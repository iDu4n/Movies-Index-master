package com.sg.moviesindex.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class Database_Impl extends Database {
  private volatile FavouriteMoviesDAO _favouriteMoviesDAO;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `favourite_movies` (`imdb_id` TEXT, `budget` INTEGER, `revenue` INTEGER, `runtime` INTEGER, `status` TEXT, `tagline` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT, `video` INTEGER, `vote_average` REAL, `title` TEXT, `popularity` REAL, `poster_path` TEXT, `original_language` TEXT, `original_title` TEXT, `genres` TEXT, `backdrop_path` TEXT, `adult` INTEGER, `overview` TEXT, `release_date` TEXT, `casts_list` TEXT, `reviews_list` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3928234d9635639191a99ddafe6149f0')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `favourite_movies`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsFavouriteMovies = new HashMap<String, TableInfo.Column>(21);
        _columnsFavouriteMovies.put("imdb_id", new TableInfo.Column("imdb_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("budget", new TableInfo.Column("budget", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("revenue", new TableInfo.Column("revenue", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("runtime", new TableInfo.Column("runtime", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("tagline", new TableInfo.Column("tagline", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("video", new TableInfo.Column("video", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("vote_average", new TableInfo.Column("vote_average", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("original_language", new TableInfo.Column("original_language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("original_title", new TableInfo.Column("original_title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("backdrop_path", new TableInfo.Column("backdrop_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("adult", new TableInfo.Column("adult", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("release_date", new TableInfo.Column("release_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("casts_list", new TableInfo.Column("casts_list", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteMovies.put("reviews_list", new TableInfo.Column("reviews_list", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavouriteMovies = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavouriteMovies = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavouriteMovies = new TableInfo("favourite_movies", _columnsFavouriteMovies, _foreignKeysFavouriteMovies, _indicesFavouriteMovies);
        final TableInfo _existingFavouriteMovies = TableInfo.read(db, "favourite_movies");
        if (!_infoFavouriteMovies.equals(_existingFavouriteMovies)) {
          return new RoomOpenHelper.ValidationResult(false, "favourite_movies(com.sg.moviesindex.model.tmdb.Movie).\n"
                  + " Expected:\n" + _infoFavouriteMovies + "\n"
                  + " Found:\n" + _existingFavouriteMovies);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3928234d9635639191a99ddafe6149f0", "c16d6911f501571d15b52a9900cfbe3c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "favourite_movies");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `favourite_movies`");
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
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(FavouriteMoviesDAO.class, FavouriteMoviesDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public FavouriteMoviesDAO getFDAO() {
    if (_favouriteMoviesDAO != null) {
      return _favouriteMoviesDAO;
    } else {
      synchronized(this) {
        if(_favouriteMoviesDAO == null) {
          _favouriteMoviesDAO = new FavouriteMoviesDAO_Impl(this);
        }
        return _favouriteMoviesDAO;
      }
    }
  }
}
