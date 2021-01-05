package mk.com.ukim.finki.mpip.lab3.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import mk.com.ukim.finki.mpip.lab3.model.MovieDetails

@Database(entities = [MovieDetails::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao

    companion object {
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            if (instance == null) {
                instance =
                    Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        "movies.db"
                    ).build()
            }
            return instance as AppDatabase
        }
    }
}

