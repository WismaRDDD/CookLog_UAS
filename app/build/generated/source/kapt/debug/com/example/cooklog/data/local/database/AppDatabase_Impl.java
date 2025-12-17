package com.example.cooklog.data.local.database;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.example.cooklog.data.local.dao.RecipeDao;
import com.example.cooklog.data.local.dao.RecipeDao_Impl;
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
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile RecipeDao _recipeDao;

  @Override
  @NonNull
  protected RoomOpenDelegate createOpenDelegate() {
    final RoomOpenDelegate _openDelegate = new RoomOpenDelegate(1, "d6e300dc82bcdd08b8b5eb3ebab685e4", "41a7f79a3a8821b01901a3fb1f104cbf") {
      @Override
      public void createAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `recipes` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `tags` TEXT NOT NULL, `cookingTime` TEXT NOT NULL, `ingredients` TEXT NOT NULL, `steps` TEXT NOT NULL, `imageRes` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd6e300dc82bcdd08b8b5eb3ebab685e4')");
      }

      @Override
      public void dropAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `recipes`");
      }

      @Override
      public void onCreate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      public void onOpen(@NonNull final SQLiteConnection connection) {
        internalInitInvalidationTracker(connection);
      }

      @Override
      public void onPreMigrate(@NonNull final SQLiteConnection connection) {
        DBUtil.dropFtsSyncTriggers(connection);
      }

      @Override
      public void onPostMigrate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      @NonNull
      public RoomOpenDelegate.ValidationResult onValidateSchema(
          @NonNull final SQLiteConnection connection) {
        final Map<String, TableInfo.Column> _columnsRecipes = new HashMap<String, TableInfo.Column>(7);
        _columnsRecipes.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("cookingTime", new TableInfo.Column("cookingTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("ingredients", new TableInfo.Column("ingredients", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("steps", new TableInfo.Column("steps", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("imageRes", new TableInfo.Column("imageRes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysRecipes = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesRecipes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecipes = new TableInfo("recipes", _columnsRecipes, _foreignKeysRecipes, _indicesRecipes);
        final TableInfo _existingRecipes = TableInfo.read(connection, "recipes");
        if (!_infoRecipes.equals(_existingRecipes)) {
          return new RoomOpenDelegate.ValidationResult(false, "recipes(com.example.cooklog.data.local.entity.RecipeEntity).\n"
                  + " Expected:\n" + _infoRecipes + "\n"
                  + " Found:\n" + _existingRecipes);
        }
        return new RoomOpenDelegate.ValidationResult(true, null);
      }
    };
    return _openDelegate;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final Map<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final Map<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "recipes");
  }

  @Override
  public void clearAllTables() {
    super.performClear(false, "recipes");
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final Map<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(RecipeDao.class, RecipeDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final Set<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
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
  public RecipeDao recipeDao() {
    if (_recipeDao != null) {
      return _recipeDao;
    } else {
      synchronized(this) {
        if(_recipeDao == null) {
          _recipeDao = new RecipeDao_Impl(this);
        }
        return _recipeDao;
      }
    }
  }
}
