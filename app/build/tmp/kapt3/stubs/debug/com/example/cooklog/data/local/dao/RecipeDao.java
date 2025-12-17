package com.example.cooklog.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/cooklog/data/local/dao/RecipeDao;", "", "getAllRecipes", "", "Lcom/example/cooklog/data/local/entity/RecipeEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTags", "", "getRecipeById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "", "recipes", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface RecipeDao {
    
    @androidx.room.Query(value = "SELECT * FROM recipes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllRecipes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.cooklog.data.local.entity.RecipeEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT tags FROM recipes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllTags(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM recipes WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRecipeById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cooklog.data.local.entity.RecipeEntity> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.cooklog.data.local.entity.RecipeEntity> recipes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}