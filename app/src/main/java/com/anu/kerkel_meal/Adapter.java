package com.anu.kerkel_meal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<ModelClass> modelClassArrayList;
    public Adapter(Context context, ArrayList<ModelClass>
            modelClassArrayList) {
        this.context = context;
        this.modelClassArrayList = modelClassArrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,null,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder
                                         holder, @SuppressLint("RecyclerView") int position) {
        holder.cardView.setOnClickListener(new
                                                   View.OnClickListener() {
                                                       @Override
                                                       public void onClick(View v) {
                                                           ModelClass recipe = new ModelClass(
                                                                   modelClassArrayList.get(position).getStrCategory(),
                                                                   modelClassArrayList.get(position).getStrMeal(),
                                                                   modelClassArrayList.get(position).getStrArea(),
                                                                   modelClassArrayList.get(position).getStrMealThumb(),
                                                                   modelClassArrayList.get(position).getStrInstructions(),
                                                                   modelClassArrayList.get(position).getStrTags()
                                                           );
                                                           Intent intent = new Intent(context, Main2.class);

                                                           intent.putExtra(Main2.XTRA_RECIPE, recipe);
                                                           context.startActivity(intent);
                                                       }
                                                   });
        holder.mtitle.setText(modelClassArrayList.get(position).getStrMeal());
        holder.mtypes.setText(modelClassArrayList.get(position).getStrCategory());
        holder.morigin.setText(modelClassArrayList.get(position).getStrArea());
        Glide.with(context).load(modelClassArrayList.get(position).getStrMealThumb() + "/preview").into(holder.imageView);
    }
    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView mtitle,mtypes,morigin;
        CardView cardView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mtitle=itemView.findViewById(R.id.recipetitle);
            mtypes=itemView.findViewById(R.id.recipetypes);
            morigin=itemView.findViewById(R.id.recipeorigin);
            imageView=itemView.findViewById(R.id.imageview);
            cardView=itemView.findViewById(R.id.cardview);
        }
    }
}

