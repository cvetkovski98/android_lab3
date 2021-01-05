package mk.com.ukim.finki.mpip.lab3.persistence;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile MovieDao _movieDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `MovieDetails` (`imdbId` TEXT NOT NULL, `title` TEXT, `year` TEXT, `rated` TEXT, `released` TEXT, `runtime` TEXT, `genre` TEXT, `director` TEXT, `writer` TEXT, `actors` TEXT, `plot` TEXT, `language` TEXT, `country` TEXT, `awards` TEXT, `poster` TEXT, `metascore` TEXT, `imdbRating` TEXT, `imdbVotes` TEXT, `type` TEXT, `dvd` TEXT, `boxOffice` TEXT, `production` TEXT, `website` TEXT, `response` TEXT, PRIMARY KEY(`imdbId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a304c3c3c9d4684c4083b71adade8a28')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `MovieDetails`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovieDetails = new HashMap<String, TableInfo.Column>(24);
        _columnsMovieDetails.put("imdbId", new TableInfo.Column("imdbId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("year", new TableInfo.Column("year", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("rated", new TableInfo.Column("rated", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("released", new TableInfo.Column("released", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("director", new TableInfo.Column("director", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("writer", new TableInfo.Column("writer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("actors", new TableInfo.Column("actors", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("plot", new TableInfo.Column("plot", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("language", new TableInfo.Column("language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("awards", new TableInfo.Column("awards", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("poster", new TableInfo.Column("poster", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("metascore", new TableInfo.Column("metascore", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("imdbRating", new TableInfo.Column("imdbRating", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("imdbVotes", new TableInfo.Column("imdbVotes", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("dvd", new TableInfo.Column("dvd", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("boxOffice", new TableInfo.Column("boxOffice", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("production", new TableInfo.Column("production", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("website", new TableInfo.Column("website", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetails.put("response", new TableInfo.Column("response", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieDetails = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieDetails = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieDetails = new TableInfo("MovieDetails", _columnsMovieDetails, _foreignKeysMovieDetails, _indicesMovieDetails);
        final TableInfo _existingMovieDetails = TableInfo.read(_db, "MovieDetails");
        if (! _infoMovieDetails.equals(_existingMovieDetails)) {
          return new RoomOpenHelper.ValidationResult(false, "MovieDetails(mk.com.ukim.finki.mpip.lab3.model.MovieDetails).\n"
                  + " Expected:\n" + _infoMovieDetails + "\n"
                  + " Found:\n" + _existingMovieDetails);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "a304c3c3c9d4684c4083b71adade8a28", "f1bb3ee3890d9bb28966050aaa350899");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "MovieDetails");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `MovieDetails`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MovieDao movieDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }
}
