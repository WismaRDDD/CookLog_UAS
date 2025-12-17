package com.example.cooklog.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0086@\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/cooklog/data/repository/RecipeRepository;", "", "recipeDao", "Lcom/example/cooklog/data/local/dao/RecipeDao;", "(Lcom/example/cooklog/data/local/dao/RecipeDao;)V", "getAllRecipes", "", "Lcom/example/cooklog/data/model/Recipe;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllUniqueTags", "", "getRecipeById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapEntityToModel", "entity", "Lcom/example/cooklog/data/local/entity/RecipeEntity;", "seedIfEmpty", "", "app_debug"})
public final class RecipeRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.cooklog.data.local.dao.RecipeDao recipeDao = null;
    
    public RecipeRepository(@org.jetbrains.annotations.NotNull()
    com.example.cooklog.data.local.dao.RecipeDao recipeDao) {
        super();
    }
    
    /**
     * Ambil semua resep
     * Digunakan untuk Home (grid, search, random feed)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllRecipes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.cooklog.data.model.Recipe>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllUniqueTags(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    /**
     * Ambil satu resep berdasarkan ID
     * Digunakan untuk Recipe Detail Page
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRecipeById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cooklog.data.model.Recipe> $completion) {
        return null;
    }
    
    /**
     * Seed data awal (HANYA JALAN JIKA DATABASE KOSONG)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object seedIfEmpty(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Mapper: Entity → UI Model
     * SATU-SATUNYA tempat konversi data
     */
    private final com.example.cooklog.data.model.Recipe mapEntityToModel(com.example.cooklog.data.local.entity.RecipeEntity entity) {
        return null;
    }
}