package com.anu.kerkel_meal;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MenuFragment extends Fragment {
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    private RecyclerView recyclerViewMenu;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle
                                     savedInstanceState) {
        View v = inflater.inflate(R.layout.menufragment,null);
        recyclerViewMenu=v.findViewById(R.id.recyclermenu);
        modelClassArrayList = new ArrayList<>();
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(),modelClassArrayList);
        recyclerViewMenu.setAdapter(adapter);
        findRecipes();
        return v;
    }
    private void findRecipes() {

        ApiUtilities.getApiInterface().getRecipes("Spicy").enqueue(new Callback<MainRecipe>() {
            @Override
            public void onResponse(Call<MainRecipe> call,
                                   Response<MainRecipe> response) {
                if(response.isSuccessful())
                {
                    modelClassArrayList.addAll(response.body().getRecipes());
                    adapter.notifyDataSetChanged();
                }
            }
            @Override
            public void onFailure(Call<MainRecipe> call, Throwable t) {
            }
        });
    }
}
