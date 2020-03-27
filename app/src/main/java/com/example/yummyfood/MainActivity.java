package com.example.yummyfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    public static final String MESSAGE = "test message";
    private RecyclerView mRecyclerview;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting the recyclerview to utilise the layout created
        mRecyclerview = findViewById(R.id.rvList);
        mRecyclerview.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(mLayoutManager);
        RestaurantAdapter.RecyclerViewClickListener listener = new RestaurantAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                launchDetailActivity(position);
            }
        };
        //Setting adapter to the created adapter
        mAdapter = new RestaurantAdapter(Restaurant.getRestaurants(), listener);
        mRecyclerview.setAdapter(mAdapter);
    }
    //Intent to start detailed activity
    private void launchDetailActivity(int position){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(MESSAGE, position);
        startActivity(intent);

    }
}
