package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sizeOfSandwich = 0;
        int age = 0;
        boolean size = false;


        System.out.println();
        System.out.println("Welcome to The Sandwich Shop ");
        System.out.println();
        System.out.println("please chose what sandwich you would like today");
        System.out.println();
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95 ");
        System.out.println();
        System.out.println("Please select 1 or 2.  ");
        sizeOfSandwich =scanner.nextInt();


        System.out.println("How old are you?");
        age = scanner.nextInt();
        scanner.nextLine();

        if (sizeOfSandwich == 1){
            size = true;
        }

        if (1<= age && age <=17){
            if (size == true )
            System.out.println("your total is: 4.90 ");
            else {
                System.out.println("your total is: 8.05" );
            }
        }


        if (18<= age && age <= 64){
            if (size == true )
                System.out.println("your total is: 5.45 ");
            else {
                System.out.println("your total is: 8.95" );
            }

        }

        if ( age >= 65){
            if (size == true )
                System.out.println("your total is: 4.36 ");
            else {
                System.out.println("your total is: 7.16" );
            }

        }


    }
}