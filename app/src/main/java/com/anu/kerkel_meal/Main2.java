package com.anu.kerkel_meal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Main2 extends AppCompatActivity {
    public static final String XTRA_RECIPE = "RECIPE";

    ModelClass recipe;
    ImageView IMthumbnail;
    TextView TMeal, TCategory, TArea, TInstructions, TTags;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TMeal = findViewById(R.id.txt_recipetitle);
        TCategory = findViewById(R.id.txt_recipecategory);
        TArea = findViewById(R.id.txt_recipeorigin);
        TInstructions = findViewById(R.id.txt_instruction);
        TTags = findViewById(R.id.txt_tags);
        IMthumbnail = findViewById(R.id.imageview);

        recipe = getIntent().getParcelableExtra(XTRA_RECIPE);
        TMeal.setText(recipe.getStrMeal());
        Glide.with(this).load(recipe.getStrMealThumb() + "/preview").into(IMthumbnail);
        TMeal.setText(recipe.getStrMeal());
        TCategory.setText(recipe.getStrCategory());
        TArea.setText(recipe.getStrArea());
        TInstructions.setText(recipe.getStrInstructions());
        TTags.setText(recipe.getStrTags());

    }
}