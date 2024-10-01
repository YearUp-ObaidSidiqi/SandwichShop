package com.pluralsight;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sandwichSize = 0;
        int age = 0;
        boolean isRegularSize = false;
        int loaded = 0;
        boolean isLoaded = false;
        float regularBasePrice = 5.45f;
        float largeBasePrice = 8.95f;

        System.out.println("\nWelcome to The Sandwich Shop ");
        System.out.println("\nPlease chose what sandwich you would like today");
        System.out.println("1: Regular: base price $" + regularBasePrice);
        System.out.println("2: Large: base price $" + largeBasePrice);
        System.out.println("\nPlease select 1 or 2.  ");
        sandwichSize =scanner.nextInt();


        System.out.println("\nWould you like your sandwich loaded? ");
        System.out.println("\nIf Yes, please enter 1 ");
        System.out.println("If No, please enter 2 ");
        loaded = scanner.nextInt();
        scanner.nextLine();


        if (loaded ==1){
            isLoaded = true;
        }
        System.out.println("check point 0");

        System.out.println(regularBasePrice);
        System.out.println(largeBasePrice);

        if(isLoaded){
            regularBasePrice = (regularBasePrice + 1.00f);
            largeBasePrice = (largeBasePrice+  1.75f) ;
        }

        System.out.println("check point 1");
        System.out.println(regularBasePrice);
        System.out.println(largeBasePrice);

        System.out.println("\nHow old are you?");
        age = scanner.nextInt();
        scanner.nextLine();


        if (sandwichSize == 1){
            isRegularSize = true;
        }


        if (age <=17){
            if (isRegularSize == true )
                 System.out.printf("Your total is: $%.2f",(regularBasePrice*.90));
            else {
                System.out.printf("Your total is: $%.2f", (largeBasePrice*.90));
            }
        }


        if (18<= age && age <= 64){
            if (isRegularSize == true )
                System.out.println("Your total is: " + regularBasePrice);
            else {
                System.out.println("Your total is: " + largeBasePrice );
            }

        }

        if ( age >= 65){
            if (isRegularSize == true )
                System.out.printf("Your total is: $%.2f", (regularBasePrice*0.2));
            else {
                System.out.printf("Your total is: $%.2f", (largeBasePrice*0.2));
            }

        }

        scanner.close();
    }


}