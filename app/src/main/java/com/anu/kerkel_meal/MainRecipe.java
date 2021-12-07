package com.anu.kerkel_meal;

import java.util.ArrayList;

public class MainRecipe {
    private ArrayList<ModelClass> meals;

    public MainRecipe(ArrayList<ModelClass> meals) {
        this.meals = meals;
    }

    public ArrayList<ModelClass> getRecipes() {
        return meals;
    }
    public void setRecipes(ArrayList<ModelClass> meals) {
        this.meals = meals;
    }

}
