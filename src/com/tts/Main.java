package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Testing system output
        System.out.println("Hello World");

        //print numbers
        AsciiChars.printNumbers();
        System.out.print("\n");

        //print lowercase letters
        AsciiChars.printLowerCase();
        System.out.print("\n");

        //print uppercase letters
        AsciiChars.printUpperCase();
        System.out.print("\n");

        //Ask user for name
        Scanner input = new Scanner(System.in);
//        String userName = "";
//        String response = "";
        System.out.print("Please enter your name: ");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName);

        //Ask if user would like to continue to interactive component
        System.out.println("Would you like to continue to the interactive zone?");
        System.out.println("Y/N");
        String response = input.next();

        if(response.equals("N") || response.equals("n")){
            System.out.println("Program will quit, please come back later to complete survey");
                    } else {
            //user will be asked questions
            Scanner scan = new Scanner(System.in);
            System.out.println("Great!");
            System.out.println("Please answer the following questions to generate your winning lottery numbers!");
            System.out.println("Do you have a red car? (yes, no): ");
            String car = scan.nextLine();
            System.out.println("What is the name of your favorite pet?");
            String pet = scan.nextLine();
            System.out.printf("How old is %s?",  pet );
            int petAge = scan.nextInt();
            System.out.println("What is your lucky number?");
            int luckyNumber = scan.nextInt();
            scan.nextLine();
            System.out.println("Do you have a favorite athlete? (yes, no)");
            String athlete = scan.nextLine();
            if(athlete.equals("yes")){
                System.out.println("What is their jersey number?");
                int jersey = scan.nextInt();
            }
//            else {}
            System.out.println("What is the last two digits of the model year of your car?");
            int carYear = scan.nextInt();
            scan.nextLine();
            System.out.println("Who is your favorite actor?");
            String actor = scan.nextLine();
            System.out.println("Enter a random number between 1 and 50: ");
            int randNum = scan.nextInt();

//            System.out.print(car + petAge + luckyNumber);

            }//end else



        }
    }


