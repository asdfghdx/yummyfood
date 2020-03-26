package com.example.yummyfood;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity{

    private Restaurant mRestaurant;
    private TextView mName;
    private TextView mLocation;
    private TextView mCuisine;
    private TextView mRating;
    private TextView mDescription;
    private TextView mOpening;
    private TextView mClosing;
    private TextView mNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mName = findViewById(R.id.tvName);
        mLocation = findViewById(R.id.tvLocation);
        mCuisine = findViewById(R.id.tvCuisine);
        mRating = findViewById(R.id.tvRating);
        mDescription = findViewById(R.id.tvDescription);
        mOpening = findViewById(R.id.tvOpening);
        mClosing = findViewById(R.id.tvClosing);
        mNumber = findViewById(R.id.tvNumber);

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.MESSAGE, 0 );

        mRestaurant = Restaurant.getRestaurants().get(position);
        setTitle(mRestaurant.getName());
        mName.setText(mRestaurant.getName());
        mLocation.setText(mRestaurant.getLocation());
        mCuisine.setText(mRestaurant.getCuisine());
        mRating.setText(mRestaurant.getRating());
        mDescription.setText(mRestaurant.getDescription());
        mOpening.setText(mRestaurant.getOpening());
        mClosing.setText(mRestaurant.getClosing());
        mNumber.setText(mRestaurant.getNumber());

    }


}
