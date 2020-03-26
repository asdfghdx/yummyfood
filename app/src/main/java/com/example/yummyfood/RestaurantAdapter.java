package com.example.yummyfood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>{

    private ArrayList<Restaurant> mRestaurants;
    private RecyclerViewClickListener mListener;

    public RestaurantAdapter(ArrayList<Restaurant> restaurants, RecyclerViewClickListener listener){
        mRestaurants = restaurants;
        mListener = listener;
    }

    public interface RecyclerViewClickListener {
        void onClick (View view, int position);
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView name, location, cuisine, rating;
        public Button book;
        private RecyclerViewClickListener mListener;

        public RestaurantViewHolder(View v, RecyclerViewClickListener listener){
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            name = v.findViewById(R.id.tvName);
            location = v.findViewById(R.id.tvLocation);
            cuisine = v.findViewById(R.id.tvCuisine);
            rating = v.findViewById(R.id.tvRating);
        }

        @Override
        public void onClick(View view){
            mListener.onClick(view,getAdapterPosition());
        }

    }

    @Override
    public RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_row,parent,false);
    return new RestaurantViewHolder(v, mListener);
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position){
        Restaurant restaurant = mRestaurants.get(position);
        holder.name.setText(restaurant.getName());
        holder.location.setText(restaurant.getLocation());
        holder.cuisine.setText(restaurant.getCuisine());
        holder.rating.setText(restaurant.getRating());
    }

    @Override
    public int getItemCount(){
        return mRestaurants.size();
    }

}
