package com.sg.moviesindex.db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.sg.moviesindex.db.typeconverters.CastTypeConverter;
import com.sg.moviesindex.db.typeconverters.GenreTypeConverter;
import com.sg.moviesindex.db.typeconverters.ReviewTypeConverter;
import com.sg.moviesindex.model.tmdb.Cast;
import com.sg.moviesindex.model.tmdb.Genre;
import com.sg.moviesindex.model.tmdb.Movie;
import com.sg.moviesindex.model.tmdb.Review;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FavouriteMoviesDAO_Impl implements FavouriteMoviesDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Movie> __insertionAdapterOfMovie;

  private final EntityDeletionOrUpdateAdapter<Movie> __deletionAdapterOfMovie;

  public FavouriteMoviesDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `favourite_movies` (`imdb_id`,`budget`,`revenue`,`runtime`,`status`,`tagline`,`id`,`video`,`vote_average`,`title`,`popularity`,`poster_path`,`original_language`,`original_title`,`genres`,`backdrop_path`,`adult`,`overview`,`release_date`,`casts_list`,`reviews_list`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final Movie entity) {
        if (entity.getImdbId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getImdbId());
        }
        if (entity.getBudget() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getBudget());
        }
        if (entity.getRevenue() == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, entity.getRevenue());
        }
        if (entity.getRuntime() == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, entity.getRuntime());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getStatus());
        }
        if (entity.getTagline() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getTagline());
        }
        if (entity.getId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindLong(7, entity.getId());
        }
        final Integer _tmp = entity.getVideo() == null ? null : (entity.getVideo() ? 1 : 0);
        if (_tmp == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, _tmp);
        }
        if (entity.getVoteAverage() == null) {
          statement.bindNull(9);
        } else {
          statement.bindDouble(9, entity.getVoteAverage());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getTitle());
        }
        if (entity.getPopularity() == null) {
          statement.bindNull(11);
        } else {
          statement.bindDouble(11, entity.getPopularity());
        }
        if (entity.getPosterPath() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getPosterPath());
        }
        if (entity.getOriginalLanguage() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getOriginalLanguage());
        }
        if (entity.getOriginalTitle() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getOriginalTitle());
        }
        final String _tmp_1 = GenreTypeConverter.gettingStringFromList(entity.getGenres());
        if (_tmp_1 == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, _tmp_1);
        }
        if (entity.getBackdropPath() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getBackdropPath());
        }
        final Integer _tmp_2 = entity.getAdult() == null ? null : (entity.getAdult() ? 1 : 0);
        if (_tmp_2 == null) {
          statement.bindNull(17);
        } else {
          statement.bindLong(17, _tmp_2);
        }
        if (entity.getOverview() == null) {
          statement.bindNull(18);
        } else {
          statement.bindString(18, entity.getOverview());
        }
        if (entity.getReleaseDate() == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.getReleaseDate());
        }
        final String _tmp_3 = CastTypeConverter.gettingStringFromList(entity.getCastsList());
        if (_tmp_3 == null) {
          statement.bindNull(20);
        } else {
          statement.bindString(20, _tmp_3);
        }
        final String _tmp_4 = ReviewTypeConverter.gettingStringFromList(entity.getReviewsList());
        if (_tmp_4 == null) {
          statement.bindNull(21);
        } else {
          statement.bindString(21, _tmp_4);
        }
      }
    };
    this.__deletionAdapterOfMovie = new EntityDeletionOrUpdateAdapter<Movie>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `favourite_movies` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final Movie entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
      }
    };
  }

  @Override
  public void insertFMovie(final Movie movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovie.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteFMovie(final Movie movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMovie.handle(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Movie>> getAllFMovies() {
    final String _sql = "select * from favourite_movies";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"favourite_movies"}, false, new Callable<List<Movie>>() {
      @Override
      @Nullable
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
          final int _cursorIndexOfBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "budget");
          final int _cursorIndexOfRevenue = CursorUtil.getColumnIndexOrThrow(_cursor, "revenue");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfCastsList = CursorUtil.getColumnIndexOrThrow(_cursor, "casts_list");
          final int _cursorIndexOfReviewsList = CursorUtil.getColumnIndexOrThrow(_cursor, "reviews_list");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Movie _item;
            final String _tmpImdbId;
            if (_cursor.isNull(_cursorIndexOfImdbId)) {
              _tmpImdbId = null;
            } else {
              _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            }
            final Long _tmpBudget;
            if (_cursor.isNull(_cursorIndexOfBudget)) {
              _tmpBudget = null;
            } else {
              _tmpBudget = _cursor.getLong(_cursorIndexOfBudget);
            }
            final Long _tmpRevenue;
            if (_cursor.isNull(_cursorIndexOfRevenue)) {
              _tmpRevenue = null;
            } else {
              _tmpRevenue = _cursor.getLong(_cursorIndexOfRevenue);
            }
            final Long _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getLong(_cursorIndexOfRuntime);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            final Boolean _tmpVideo;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp == null ? null : _tmp != 0;
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpOriginalLanguage;
            if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
              _tmpOriginalLanguage = null;
            } else {
              _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            }
            final String _tmpOriginalTitle;
            if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
              _tmpOriginalTitle = null;
            } else {
              _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            }
            final ArrayList<Genre> _tmpGenres;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = GenreTypeConverter.gettingListFromString(_tmp_1);
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final Boolean _tmpAdult;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp_2 == null ? null : _tmp_2 != 0;
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final ArrayList<Cast> _tmpCastsList;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfCastsList)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfCastsList);
            }
            _tmpCastsList = CastTypeConverter.gettingListFromString(_tmp_3);
            final ArrayList<Review> _tmpReviewsList;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfReviewsList)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfReviewsList);
            }
            _tmpReviewsList = ReviewTypeConverter.gettingListFromString(_tmp_4);
            _item = new Movie(_tmpAdult,_tmpBackdropPath,_tmpBudget,_tmpGenres,_tmpId,_tmpImdbId,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpOverview,_tmpPopularity,_tmpPosterPath,_tmpReleaseDate,_tmpRevenue,_tmpRuntime,_tmpStatus,_tmpTagline,_tmpTitle,_tmpVideo,_tmpVoteAverage,_tmpCastsList,_tmpReviewsList);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Movie getMovie(final String title) {
    final String _sql = "select * from favourite_movies where title==?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (title == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, title);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
      final int _cursorIndexOfBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "budget");
      final int _cursorIndexOfRevenue = CursorUtil.getColumnIndexOrThrow(_cursor, "revenue");
      final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
      final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
      final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
      final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
      final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
      final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
      final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
      final int _cursorIndexOfCastsList = CursorUtil.getColumnIndexOrThrow(_cursor, "casts_list");
      final int _cursorIndexOfReviewsList = CursorUtil.getColumnIndexOrThrow(_cursor, "reviews_list");
      final Movie _result;
      if (_cursor.moveToFirst()) {
        final String _tmpImdbId;
        if (_cursor.isNull(_cursorIndexOfImdbId)) {
          _tmpImdbId = null;
        } else {
          _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
        }
        final Long _tmpBudget;
        if (_cursor.isNull(_cursorIndexOfBudget)) {
          _tmpBudget = null;
        } else {
          _tmpBudget = _cursor.getLong(_cursorIndexOfBudget);
        }
        final Long _tmpRevenue;
        if (_cursor.isNull(_cursorIndexOfRevenue)) {
          _tmpRevenue = null;
        } else {
          _tmpRevenue = _cursor.getLong(_cursorIndexOfRevenue);
        }
        final Long _tmpRuntime;
        if (_cursor.isNull(_cursorIndexOfRuntime)) {
          _tmpRuntime = null;
        } else {
          _tmpRuntime = _cursor.getLong(_cursorIndexOfRuntime);
        }
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        final String _tmpTagline;
        if (_cursor.isNull(_cursorIndexOfTagline)) {
          _tmpTagline = null;
        } else {
          _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
        }
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final Boolean _tmpVideo;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfVideo)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfVideo);
        }
        _tmpVideo = _tmp == null ? null : _tmp != 0;
        final Double _tmpVoteAverage;
        if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
          _tmpVoteAverage = null;
        } else {
          _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Double _tmpPopularity;
        if (_cursor.isNull(_cursorIndexOfPopularity)) {
          _tmpPopularity = null;
        } else {
          _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
        }
        final String _tmpPosterPath;
        if (_cursor.isNull(_cursorIndexOfPosterPath)) {
          _tmpPosterPath = null;
        } else {
          _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
        }
        final String _tmpOriginalLanguage;
        if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
          _tmpOriginalLanguage = null;
        } else {
          _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
        }
        final String _tmpOriginalTitle;
        if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
          _tmpOriginalTitle = null;
        } else {
          _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
        }
        final ArrayList<Genre> _tmpGenres;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfGenres)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfGenres);
        }
        _tmpGenres = GenreTypeConverter.gettingListFromString(_tmp_1);
        final String _tmpBackdropPath;
        if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
          _tmpBackdropPath = null;
        } else {
          _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
        }
        final Boolean _tmpAdult;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfAdult)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfAdult);
        }
        _tmpAdult = _tmp_2 == null ? null : _tmp_2 != 0;
        final String _tmpOverview;
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _tmpOverview = null;
        } else {
          _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        }
        final String _tmpReleaseDate;
        if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
          _tmpReleaseDate = null;
        } else {
          _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
        }
        final ArrayList<Cast> _tmpCastsList;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfCastsList)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfCastsList);
        }
        _tmpCastsList = CastTypeConverter.gettingListFromString(_tmp_3);
        final ArrayList<Review> _tmpReviewsList;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfReviewsList)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfReviewsList);
        }
        _tmpReviewsList = ReviewTypeConverter.gettingListFromString(_tmp_4);
        _result = new Movie(_tmpAdult,_tmpBackdropPath,_tmpBudget,_tmpGenres,_tmpId,_tmpImdbId,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpOverview,_tmpPopularity,_tmpPosterPath,_tmpReleaseDate,_tmpRevenue,_tmpRuntime,_tmpStatus,_tmpTagline,_tmpTitle,_tmpVideo,_tmpVoteAverage,_tmpCastsList,_tmpReviewsList);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
