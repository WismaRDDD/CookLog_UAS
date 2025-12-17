package com.example.cooklog.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u001a\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/cooklog/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "allRecipes", "", "Lcom/example/cooklog/data/model/Recipe;", "allRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "recentAdapter", "Lcom/example/cooklog/ui/adapter/RecipeAdapter;", "recentRecycler", "recipeAdapter", "searchInput", "Landroid/widget/AutoCompleteTextView;", "loadRecentRecipes", "", "recentManager", "Lcom/example/cooklog/data/local/RecentRecipeManager;", "markHomeGuideShown", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "shouldShowHomeGuide", "", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView recentRecycler;
    private androidx.recyclerview.widget.RecyclerView allRecycler;
    private android.widget.AutoCompleteTextView searchInput;
    private com.example.cooklog.ui.adapter.RecipeAdapter recipeAdapter;
    private com.example.cooklog.ui.adapter.RecipeAdapter recentAdapter;
    private java.util.List<com.example.cooklog.data.model.Recipe> allRecipes;
    
    public HomeFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean shouldShowHomeGuide() {
        return false;
    }
    
    private final void markHomeGuideShown() {
    }
    
    private final void loadRecentRecipes(com.example.cooklog.data.local.RecentRecipeManager recentManager) {
    }
}