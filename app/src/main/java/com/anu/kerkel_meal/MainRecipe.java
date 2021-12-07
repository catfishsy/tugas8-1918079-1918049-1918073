package com.anu.kerkel_meal;

import java.util.ArrayList;

public class MainRecipe {
    private ArrayList<ModelClass> recipes;

    public MainRecipe(ArrayList<ModelClass> recipes) {
        this.recipes = recipes;
    }

    public ArrayList<ModelClass> getRecipes() {
        return recipes;
    }
    public void setRecipes(ArrayList<ModelClass> recipes) {
        this.recipes = recipes;
    }

}
