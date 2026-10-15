package com.pluralsight;

public class Reciept {

    public static void main(String[] args) {

        //Declare and initialize variables
        String itemName = "Spaghetti";
        double itemPrice = 3.99;
        int quantity = 2;

        //Print out the sentence
        System.out.println("You bought " + quantity + " " + itemName + "'s for $" + itemPrice * quantity + "." );

    }
}
