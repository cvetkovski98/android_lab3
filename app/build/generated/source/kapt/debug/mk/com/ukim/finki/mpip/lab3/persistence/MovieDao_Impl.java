package mk.com.ukim.finki.mpip.lab3.persistence;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import mk.com.ukim.finki.mpip.lab3.model.MovieDetails;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieDetails> __insertionAdapterOfMovieDetails;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieDetails = new EntityInsertionAdapter<MovieDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MovieDetails` (`imdbId`,`title`,`year`,`rated`,`released`,`runtime`,`genre`,`director`,`writer`,`actors`,`plot`,`language`,`country`,`awards`,`poster`,`metascore`,`imdbRating`,`imdbVotes`,`type`,`dvd`,`boxOffice`,`production`,`website`,`response`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieDetails value) {
        if (value.getImdbId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getImdbId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getYear() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getYear());
        }
        if (value.getRated() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRated());
        }
        if (value.getReleased() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getReleased());
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRuntime());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getGenre());
        }
        if (value.getDirector() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDirector());
        }
        if (value.getWriter() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getWriter());
        }
        if (value.getActors() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getActors());
        }
        if (value.getPlot() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getPlot());
        }
        if (value.getLanguage() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getLanguage());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getCountry());
        }
        if (value.getAwards() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getAwards());
        }
        if (value.getPoster() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getPoster());
        }
        if (value.getMetascore() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getMetascore());
        }
        if (value.getImdbRating() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getImdbRating());
        }
        if (value.getImdbVotes() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getImdbVotes());
        }
        if (value.getType() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getType());
        }
        if (value.getDvd() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getDvd());
        }
        if (value.getBoxOffice() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getBoxOffice());
        }
        if (value.getProduction() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getProduction());
        }
        if (value.getWebsite() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getWebsite());
        }
        if (value.getResponse() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getResponse());
        }
      }
    };
  }

  @Override
  public void insertAllMovieDetails(final List<MovieDetails> movies) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovieDetails.insert(movies);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertMovieDetails(final MovieDetails movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovieDetails.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public MovieDetails findById(final String movieId) {
    final String _sql = "SELECT * FROM MovieDetails WHERE imdbId=? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (movieId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, movieId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
      final int _cursorIndexOfRated = CursorUtil.getColumnIndexOrThrow(_cursor, "rated");
      final int _cursorIndexOfReleased = CursorUtil.getColumnIndexOrThrow(_cursor, "released");
      final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
      final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
      final int _cursorIndexOfDirector = CursorUtil.getColumnIndexOrThrow(_cursor, "director");
      final int _cursorIndexOfWriter = CursorUtil.getColumnIndexOrThrow(_cursor, "writer");
      final int _cursorIndexOfActors = CursorUtil.getColumnIndexOrThrow(_cursor, "actors");
      final int _cursorIndexOfPlot = CursorUtil.getColumnIndexOrThrow(_cursor, "plot");
      final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
      final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
      final int _cursorIndexOfAwards = CursorUtil.getColumnIndexOrThrow(_cursor, "awards");
      final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
      final int _cursorIndexOfMetascore = CursorUtil.getColumnIndexOrThrow(_cursor, "metascore");
      final int _cursorIndexOfImdbRating = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbRating");
      final int _cursorIndexOfImdbVotes = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbVotes");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfDvd = CursorUtil.getColumnIndexOrThrow(_cursor, "dvd");
      final int _cursorIndexOfBoxOffice = CursorUtil.getColumnIndexOrThrow(_cursor, "boxOffice");
      final int _cursorIndexOfProduction = CursorUtil.getColumnIndexOrThrow(_cursor, "production");
      final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
      final int _cursorIndexOfResponse = CursorUtil.getColumnIndexOrThrow(_cursor, "response");
      final MovieDetails _result;
      if(_cursor.moveToFirst()) {
        final String _tmpImdbId;
        _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpYear;
        _tmpYear = _cursor.getString(_cursorIndexOfYear);
        final String _tmpRated;
        _tmpRated = _cursor.getString(_cursorIndexOfRated);
        final String _tmpReleased;
        _tmpReleased = _cursor.getString(_cursorIndexOfReleased);
        final String _tmpRuntime;
        _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
        final String _tmpGenre;
        _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
        final String _tmpDirector;
        _tmpDirector = _cursor.getString(_cursorIndexOfDirector);
        final String _tmpWriter;
        _tmpWriter = _cursor.getString(_cursorIndexOfWriter);
        final String _tmpActors;
        _tmpActors = _cursor.getString(_cursorIndexOfActors);
        final String _tmpPlot;
        _tmpPlot = _cursor.getString(_cursorIndexOfPlot);
        final String _tmpLanguage;
        _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
        final String _tmpCountry;
        _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
        final String _tmpAwards;
        _tmpAwards = _cursor.getString(_cursorIndexOfAwards);
        final String _tmpPoster;
        _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
        final String _tmpMetascore;
        _tmpMetascore = _cursor.getString(_cursorIndexOfMetascore);
        final String _tmpImdbRating;
        _tmpImdbRating = _cursor.getString(_cursorIndexOfImdbRating);
        final String _tmpImdbVotes;
        _tmpImdbVotes = _cursor.getString(_cursorIndexOfImdbVotes);
        final String _tmpType;
        _tmpType = _cursor.getString(_cursorIndexOfType);
        final String _tmpDvd;
        _tmpDvd = _cursor.getString(_cursorIndexOfDvd);
        final String _tmpBoxOffice;
        _tmpBoxOffice = _cursor.getString(_cursorIndexOfBoxOffice);
        final String _tmpProduction;
        _tmpProduction = _cursor.getString(_cursorIndexOfProduction);
        final String _tmpWebsite;
        _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
        final String _tmpResponse;
        _tmpResponse = _cursor.getString(_cursorIndexOfResponse);
        _result = new MovieDetails(_tmpImdbId,_tmpTitle,_tmpYear,_tmpRated,_tmpReleased,_tmpRuntime,_tmpGenre,_tmpDirector,_tmpWriter,_tmpActors,_tmpPlot,_tmpLanguage,_tmpCountry,_tmpAwards,_tmpPoster,_tmpMetascore,_tmpImdbRating,_tmpImdbVotes,_tmpType,_tmpDvd,_tmpBoxOffice,_tmpProduction,_tmpWebsite,_tmpResponse);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
