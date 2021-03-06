package com.applichic.favemus.di

import android.app.Application
import androidx.room.Room
import com.applichic.favemus.api.AuthService
import com.applichic.favemus.api.TokenAuthenticator
import com.applichic.favemus.api.UserService
import com.applichic.favemus.db.LocalDatabase
import com.applichic.favemus.db.UserDao
import com.applichic.favemus.util.LiveDataCallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


const val URL = "http://172.20.10.3:8080/"

@Module(includes = [ViewModelModule::class])
class AppModule {

    private fun buildRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY // TODO: Remove before to publish
        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .authenticator(TokenAuthenticator())
            .build()

        return Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .client(client)
            .build()
    }

    @Singleton
    @Provides
    fun provideUserService(): UserService {
        return buildRetrofit().create(UserService::class.java)
    }

    @Singleton
    @Provides
    fun provideAuthService(): AuthService {
        return buildRetrofit().create(AuthService::class.java)
    }

    @Singleton
    @Provides
    fun provideDb(app: Application): LocalDatabase {
        return Room
            .databaseBuilder(app, LocalDatabase::class.java, "database.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideUserDao(db: LocalDatabase): UserDao {
        return db.userDao()
    }
}