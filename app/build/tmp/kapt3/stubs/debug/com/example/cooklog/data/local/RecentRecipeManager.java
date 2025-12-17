package com.example.cooklog.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/cooklog/data/local/RecentRecipeManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "KEY_RECENT", "", "MAX_SIZE", "", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getRecentRecipes", "", "saveRecipe", "", "recipeId", "app_debug"})
public final class RecentRecipeManager {
    private final android.content.SharedPreferences prefs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String KEY_RECENT = "recent_ids";
    private final int MAX_SIZE = 3;
    
    public RecentRecipeManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void saveRecipe(int recipeId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getRecentRecipes() {
        return null;
    }
}