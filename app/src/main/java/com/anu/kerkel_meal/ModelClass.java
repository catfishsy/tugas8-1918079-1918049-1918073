package com.anu.kerkel_meal;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class ModelClass implements Parcelable {
    private String strCategory,strMeal,strArea, strMealThumb, strInstructions, strTags;

    public ModelClass(String strCategory, String strMeal, String
            strArea, String strMealThumb, String strInstructions, String
            strTags) {
        this.strCategory = strCategory;
        this.strMeal = strMeal;
        this.strArea = strArea;
        this.strMealThumb = strMealThumb;
        this.strInstructions = strInstructions;
        this.strTags = strTags;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrMeal() {
        return strMeal;
    }

    public void setStrMeal(String strMeal) {
        this.strMeal = strMeal;
    }

    public String getStrArea() {
        return strArea;
    }

    public void setStrArea(String strArea) {
        this.strArea = strArea;
    }

    public String getStrMealThumb() {
        return strMealThumb;
    }

    public void setStrMealThumb(String strMealThumb) {
        this.strMealThumb = strMealThumb;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    public String getStrTags() {
        return strTags;
    }

    public void setStrTags(String strTags) {
        this.strTags = strTags;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.strCategory);
        dest.writeString(this.strMeal);
        dest.writeString(this.strArea);
        dest.writeString(this.strMealThumb);
        dest.writeString(this.strInstructions);
        dest.writeString(this.strTags);
    }
    protected ModelClass(Parcel in) {
        this.strCategory = in.readString();
        this.strMeal = in.readString();
        this.strArea = in.readString();
        this.strMealThumb = in.readString();
        this.strInstructions = in.readString();
        this.strTags = in.readString();
    }

    public ModelClass(){

    }

    public static final Parcelable.Creator<ModelClass> CREATOR = new Parcelable.Creator<ModelClass>() {
        @Override
        public ModelClass createFromParcel(Parcel source) {
            return new ModelClass(source);
        }

        @Override
        public ModelClass[] newArray(int size) {
            return new ModelClass[size];
        }
    };
}
