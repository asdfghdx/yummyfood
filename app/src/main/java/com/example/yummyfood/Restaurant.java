package com.example.yummyfood;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String location;
    private String cuisine;
    private String rating;
    private String description;
    private String opening;
    private String closing;
    private int number;

    public Restaurant() {

    }

    public Restaurant(String name, String location, String cuisine, String rating, String description, String opening, String closing, int number) {
        this.name = name;
        this.location = location;
        this.cuisine = cuisine;
        this.rating = rating;
        this.description = description;
        this.opening = opening;
        this.closing = closing;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getOpening(){
        return opening;
    }

    public void setOpening(String opening){
        this.opening = opening;
    }

    public String getClosing(){
        return closing;
    }

    public void setClosing(String closing){
        this.closing = closing;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public static Restaurant getRestaurant(String id){
        for(Restaurant restaurant : getRestaurants()) {
            if (restaurant.getName().equals(id)) {
                return restaurant;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return name;
    }

    public static ArrayList<Restaurant> getRestaurants(){
        ArrayList<Restaurant> restaurants = new ArrayList();



        return restaurants;
    }
}
