package com.applichic.favemus.di

import android.app.Application
import androidx.room.Room
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


@Module(includes = [ViewModelModule::class])
class AppModule {

    private fun buildRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl("http://172.20.10.3:8080/")
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