package com.weekOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if(didOswaldActAlone()){
            System.out.println("\nOswald DID act alone.");
        }
        else{
            System.out.println("\nOswald did NOT act alone.");
        }

        System.out.println("\n***************\n");

//        wasOjGuilty() cannot be called because it is not static
//        and we have not created an instance of the class Main
//
//        if(wasOjGuilty){
//            System.out.println("\nOJ WAS guilty.");
//        }
//        else{
//            System.out.println("\nOJ was NOT guilty.");
//        }
//
//        System.out.println("***************");

        String usersFavouriteFilm = favouriteFilm();
        System.out.println("You answered: \"" + usersFavouriteFilm +"\"");

        System.out.println("\n***************\n");

        System.out.println("You rated it " + filmRating(usersFavouriteFilm) + " out of 10");

    }

    public static boolean didOswaldActAlone() {

        System.out.println("Answer True or False.");
        System.out.print("Oswald acted alone:\t");
        do {
            try {
                Scanner userInput = new Scanner(System.in);
                return userInput.nextBoolean();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, try again.");
            }
        }while(true);
    }

    public boolean wasOjGuilty() {

        System.out.println("Answer True or False.");
        System.out.print("OJ was guilty:\t");
        do {
            try {
                Scanner userInput = new Scanner(System.in);
                return userInput.nextBoolean();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, try again.");
            }
        }while(true);
    }

    public static String favouriteFilm(){
        System.out.println("What is your favourite film?");

        do {
            try {
                Scanner userInput = new Scanner(System.in);
                String str = userInput.nextLine();
                return str;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, try again.");
            }
        }while(true);
    }

    public static int filmRating(String film){
        System.out.println("Rate the film: \"" + film + "\" out of 10");

        do {
            try {
                Scanner userInput = new Scanner(System.in);
                int rating = userInput.nextInt();

                if(rating < 0 || rating > 10){
                    throw (new InputMismatchException());
                }
                else {
                    return rating;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, try again.");
            }
        }while(true);
    }
}
