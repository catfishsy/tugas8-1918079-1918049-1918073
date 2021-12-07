package com.anu.kerkel_meal;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    String BASE_URL = "https://www.themealdb.com/api/json/v1/1/";


    @GET("latest.php")
    Call<MainRecipe> getRecipes(
            @Query("s") String search
    );
}

