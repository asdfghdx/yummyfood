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
        restaurants.add(new Restaurant("Aria", "1 Macquarie St, Sydney NSW 2000","Fine Dining","4.5", "Chef Matt Moran presents Modern Australian haute cuisine in an elegant, glass-walled dining room. Their two hatted restaurant at Circular Quay, on the very edge of Sydney's glistening harbour shows the delicate touches, the time taken, the passion shown and the sincerity of delivery. Aria's purpose is to refine and elevate the senses with a signature dining experience like no other. Now regarded as a timeless culinary masterpiece, Aria is recognised with numerous local and international awards." , "11:00", "22:00", "(02) 92402255"));
        restaurants.add(new Restaurant("Quay", "Upper Overseas Passenger Terminal, The Rocks NSW 2000","Fine Dining","4.4", "This Rocks institution won Gourmet Traveller’s Restaurant of the Year for 2019. It has consistently held three Good Food Guide hats for seventeen years. Is it necessary to continue? Ok, easy. At the helm is highly celebrated chef, Peter Gilmore, who is known not simply for his culinary masterpieces but also his dedication to growing his own, fresh produce." , "12:00", "22:00", "(02) 92515600"));
        restaurants.add(new Restaurant("Bennelong", "Bennelong Point Sydney Opera House, Sydney NSW 2000","Fine Dining","4.5", "With one of Australia’s most celebrated chefs, Peter Gilmore, at the helm, Bennelong showcases the flavour, diversity and quality of Australian produce within the shell of one of Australia’s most iconic buildings. The Bennelong menu has been inspired by conversations with the most passionate and dedicated farmers, fishermen, breeders and providores nationwide." , "13:00", "22:00", "(02) 92408000"));
        restaurants.add(new Restaurant("Rockpool", "66 Hunter St, Sydney NSW 2000","Bar & Grill","4.4", "Rockpool Bar & Grill Sydney is Australia’s most beautiful dining room. Situated in the sensational City Mutual Building, a 1936 Emil Sodersteen-designed American style art deco skyscraper, the dining style is simple and uncomplicated – perfectly wood fire grilled meats and seafood from Australia’s very best producers – a perfect match to what is Australia’s greatest wine list." , "10:00", "22:00", "(02) 80997077"));
        restaurants.add(new Restaurant("Madang", "371A Pitt St, Sydney NSW 2000","Korean BBQ","4.0", "BBQ that makes our restaurant famous for friendly staffs, quality food and nice dining atmosphere guarantee that you'll have unforgettable experience at Madang. Airy and bright Korean restaurant with laid-back vibe, for BBQ dishes and mains, with BYO alcohol." , "12:00", "22:00", "(02) 92647010"));
        restaurants.add(new Restaurant("Chicken V", "345b Sussex St, Sydney NSW 2000","Korean Fried Chicken","4.5", "No nonsense korean fried chicken with large selection of beverages and drinks. Chicken V is an institution for late night eats especially after a long days work." , "14:00", "22:00", "(02) 92405471"));
        restaurants.add(new Restaurant("Rengaya", "Shop 1/101 Miller St, North Sydney NSW 2060","Japanese BBQ","4.3", "Situated right in front of North Sydney Station, Rengaya has been Australia’s first and finest Japanese BBQ restaurant in Australia since 1993. We use only the finest ingredients such as Japanese Black Cattle made in Australia for beef, Sashimi and Seafood fresh from the sea. Rengaya is the restaurant foodies around the country have chosen." , "15:00", "21:00", "(02) 51842255"));
        restaurants.add(new Restaurant("Sushi Hotaru", "Shop 7/339A Sussex St, Sydney NSW 2000","Conveyor Belt Sushi","4.0", "Located in the heart of the Sydney CBD, Sushi Hotaru has, over the years, established itself as a well-known sushi train restaurant amongst locals and visitors alike. It is our mission to bring the casual Japanese street eatery experience to patron with a lively and warm dining atmosphere." , "12:00", "20:00", "(02) 98451255"));
        restaurants.add(new Restaurant("Malatang", "Shop G-1/345B-353 Sussex St, Sydney NSW 2000","Chinese Restaurant","3.9", "No.1 Malatang is the first Chinese Malatang Chain Restaurant in Australia. We provide more than 140 fresh and locally-sourced ingredients for our diners to choose from" , "12:00", "22:00", "(02) 81002255"));
        restaurants.add(new Restaurant("Krispy Kreme", "15 Macquarie St, Sydney NSW 2000","Fast Food","4.5", "Krispy Kreme Doughnuts, Inc. is an American doughnut company and coffeehouse chain owned by JAB Holding Company." , "9:00", "22:00", "(02) 81002255"));
        return restaurants;
    }
}
