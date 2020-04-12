package com.applichic.favemus.di

import android.app.Application
import androidx.room.Room
import com.applichic.favemus.api.UserService
import com.applichic.favemus.db.LocalDatabase
import com.applichic.favemus.db.UserDao
import com.applichic.favemus.util.LiveDataCallAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    private fun buildRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
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