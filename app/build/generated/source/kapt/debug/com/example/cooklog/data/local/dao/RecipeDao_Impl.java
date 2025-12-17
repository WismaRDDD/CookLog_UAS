package com.example.cooklog.data.local.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.example.cooklog.data.local.entity.RecipeEntity;
import java.lang.Class;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class RecipeDao_Impl implements RecipeDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<RecipeEntity> __insertAdapterOfRecipeEntity;

  public RecipeDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfRecipeEntity = new EntityInsertAdapter<RecipeEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `recipes` (`id`,`title`,`tags`,`cookingTime`,`ingredients`,`steps`,`imageRes`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final RecipeEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getTitle());
        }
        if (entity.getTags() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getTags());
        }
        if (entity.getCookingTime() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getCookingTime());
        }
        if (entity.getIngredients() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getIngredients());
        }
        if (entity.getSteps() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getSteps());
        }
        statement.bindLong(7, entity.getImageRes());
      }
    };
  }

  @Override
  public Object insertAll(final List<RecipeEntity> recipes,
      final Continuation<? super Unit> $completion) {
    if (recipes == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfRecipeEntity.insert(_connection, recipes);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object getAllRecipes(final Continuation<? super List<RecipeEntity>> $completion) {
    final String _sql = "SELECT * FROM recipes";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfTags = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tags");
        final int _columnIndexOfCookingTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cookingTime");
        final int _columnIndexOfIngredients = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ingredients");
        final int _columnIndexOfSteps = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "steps");
        final int _columnIndexOfImageRes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "imageRes");
        final List<RecipeEntity> _result = new ArrayList<RecipeEntity>();
        while (_stmt.step()) {
          final RecipeEntity _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpTitle;
          if (_stmt.isNull(_columnIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _stmt.getText(_columnIndexOfTitle);
          }
          final String _tmpTags;
          if (_stmt.isNull(_columnIndexOfTags)) {
            _tmpTags = null;
          } else {
            _tmpTags = _stmt.getText(_columnIndexOfTags);
          }
          final String _tmpCookingTime;
          if (_stmt.isNull(_columnIndexOfCookingTime)) {
            _tmpCookingTime = null;
          } else {
            _tmpCookingTime = _stmt.getText(_columnIndexOfCookingTime);
          }
          final String _tmpIngredients;
          if (_stmt.isNull(_columnIndexOfIngredients)) {
            _tmpIngredients = null;
          } else {
            _tmpIngredients = _stmt.getText(_columnIndexOfIngredients);
          }
          final String _tmpSteps;
          if (_stmt.isNull(_columnIndexOfSteps)) {
            _tmpSteps = null;
          } else {
            _tmpSteps = _stmt.getText(_columnIndexOfSteps);
          }
          final int _tmpImageRes;
          _tmpImageRes = (int) (_stmt.getLong(_columnIndexOfImageRes));
          _item = new RecipeEntity(_tmpId,_tmpTitle,_tmpTags,_tmpCookingTime,_tmpIngredients,_tmpSteps,_tmpImageRes);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object getAllTags(final Continuation<? super List<String>> $completion) {
    final String _sql = "SELECT tags FROM recipes";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final List<String> _result = new ArrayList<String>();
        while (_stmt.step()) {
          final String _item;
          if (_stmt.isNull(0)) {
            _item = null;
          } else {
            _item = _stmt.getText(0);
          }
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object getRecipeById(final int id, final Continuation<? super RecipeEntity> $completion) {
    final String _sql = "SELECT * FROM recipes WHERE id = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfTags = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tags");
        final int _columnIndexOfCookingTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cookingTime");
        final int _columnIndexOfIngredients = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ingredients");
        final int _columnIndexOfSteps = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "steps");
        final int _columnIndexOfImageRes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "imageRes");
        final RecipeEntity _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpTitle;
          if (_stmt.isNull(_columnIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _stmt.getText(_columnIndexOfTitle);
          }
          final String _tmpTags;
          if (_stmt.isNull(_columnIndexOfTags)) {
            _tmpTags = null;
          } else {
            _tmpTags = _stmt.getText(_columnIndexOfTags);
          }
          final String _tmpCookingTime;
          if (_stmt.isNull(_columnIndexOfCookingTime)) {
            _tmpCookingTime = null;
          } else {
            _tmpCookingTime = _stmt.getText(_columnIndexOfCookingTime);
          }
          final String _tmpIngredients;
          if (_stmt.isNull(_columnIndexOfIngredients)) {
            _tmpIngredients = null;
          } else {
            _tmpIngredients = _stmt.getText(_columnIndexOfIngredients);
          }
          final String _tmpSteps;
          if (_stmt.isNull(_columnIndexOfSteps)) {
            _tmpSteps = null;
          } else {
            _tmpSteps = _stmt.getText(_columnIndexOfSteps);
          }
          final int _tmpImageRes;
          _tmpImageRes = (int) (_stmt.getLong(_columnIndexOfImageRes));
          _result = new RecipeEntity(_tmpId,_tmpTitle,_tmpTags,_tmpCookingTime,_tmpIngredients,_tmpSteps,_tmpImageRes);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
