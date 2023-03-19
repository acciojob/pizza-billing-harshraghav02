package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int total;
    private boolean cheese;
    private boolean extraTopping;
    private int extraToppingPrice;
    private boolean takeAway;


    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        // your code goes here
        this.takeAway = false;
        this.cheese = false;
        this.extraTopping = false;
        this.extraToppingPrice = 0;
        if(isVeg) price = 300;
        else price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.cheese==false)this.price += 80;
        this.cheese = true;
    }

    public void addExtraToppings(){
        // your code goes here

        if(isVeg && this.extraTopping==false) {
            price += 70;
            this.extraToppingPrice = 70;
        }
        else if(this.extraTopping == false){
            price += 120;
            this.extraToppingPrice = 120;
        }
        this.extraTopping = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(this.takeAway==false) this.price += 20;
        this.takeAway = true;

    }

    public String getBill(){
        // your code goes here
        int basePrice = isVeg?300:400;
        this.bill = "Base Price Of The Pizza: "+ basePrice+"\n";
        String cheese = this.cheese?"Extra Cheese Added: 80\n":"";
        this.bill += cheese;
        String extraTopping = this.extraTopping?"Extra Toppings Added: "+this.extraToppingPrice+"\n":"";
        this.bill += extraTopping;
        String takeAway = this.takeAway?"Paperbag Added: 20\n":"";
        this.bill += takeAway;
        this.bill += "Total Price: "+getPrice();
        return this.bill;
    }
}
