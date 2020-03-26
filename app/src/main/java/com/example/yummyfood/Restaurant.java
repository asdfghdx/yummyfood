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
    private String number;

    public Restaurant() {

    }

    public Restaurant(String name, String location, String cuisine, String rating, String description, String opening, String closing, String number) {
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

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
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
        restaurants.add(new Restaurant("Aria", "1 Macquarie St, Sydney NSW 2000","Fine Dining","4.5", "Chef Matt Moran presents Modern Australian haute cuisine in an elegant, glass-walled dining room. Their two hatted restaurant at Circular Quay, on the very edge of Sydney's glistening harbour shows the delicate touches, the time taken, the passion shown and the sincerity of delivery. Aria's purpose is to refine and elevate the senses with a signature dining experience like no other. Now regarded as a timeless culinary masterpiece, Aria is recognised with numerous local and international awards." , "11:00", "22:00", "0292402255"));
        restaurants.add(new Restaurant("Quay", "Upper Overseas Passenger Terminal, The Rocks NSW 2000","Fine Dining","4.4", "Quay is a restaurant in Sydney, Australia. It is owned by Leon Fink, and is run by chef Peter Gilmore." , "12:00", "22:00", "0292515600"));
        restaurants.add(new Restaurant("Bennelong", "Bennelong Point Sydney Opera House, Sydney NSW 2000","Fine Dining","4.5", "Magnificent Australian food & wine. Dine with us in one of Sydney's most iconic landmarks, the Sydney Opera House." , "13:00", "22:00", "0292408000"));
        restaurants.add(new Restaurant("Rockpool", "66 Hunter St, Sydney NSW 2000","Bar & Grill","4.4", "Rockpool Dining Group is a portfolio of dining brands with a passion for delivering memorable dining experiences across multiple sectors and dining formats." , "10:00", "22:00", "0280997077"));
        restaurants.add(new Restaurant("Madang", "371A Pitt St, Sydney NSW 2000","Korean BBQ","4.0", "Airy and bright Korean restaurant with laid-back vibe, for BBQ dishes and mains, with BYO alcohol." , "12:00", "22:00", "0292647010"));
        restaurants.add(new Restaurant("Chicken V", "345b Sussex St, Sydney NSW 2000","Korean Fried Chicken","4.5", "No nonsense korean fried chicken with ample supply of alcohol" , "14:00", "22:00", "0292405471"));
        restaurants.add(new Restaurant("Rengaya", "Shop 1/101 Miller St, North Sydney NSW 2060","Japanese BBQ","4.3", "Cosy Japanese eatery offering a DIY barbecue experience focusing on Wagyu beef cuts and seafood." , "15:00", "21:00", "0251842255"));
        restaurants.add(new Restaurant("Sushi Rio", "Shop 7/339A Sussex St, Sydney NSW 2000","Conveyor Belt Sushi","4.0", "Japanese sushi train restaurant for nigiri and tempura prawn rolls in casual, low-lit surrounds." , "12:00", "20:00", "0298451255"));
        restaurants.add(new Restaurant("Malatang", "Shop G-1/345B-353 Sussex St, Sydney NSW 2000","Chinese Restaurant","3.9", "No.1 Malatang is the first Chinese Malatang Chain Restaurant in Australia. We provide more than 140 fresh and locally-sourced ingredients for our diners to choose from" , "12:00", "22:00", "0281002255"));
        restaurants.add(new Restaurant("Krispy Kreme", "15 Macquarie St, Sydney NSW 2000","Fast Food","4.5", "Krispy Kreme Doughnuts, Inc. is an American doughnut company and coffeehouse chain owned by JAB Holding Company." , "9:00", "22:00", "0281002255"));
        return restaurants;
    }
}
