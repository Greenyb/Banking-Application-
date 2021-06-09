package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("ⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢ");
        System.out.println("ⅢWelcome to the probie banking application!Ⅲ");
        System.out.println("ⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢⅢ");

        System.out.println("Main menu");
        // maybe add a user interaction application
        System.out.println("enter option");
        System.out.println("R: read bank info\nC:create account\nU: update account\nD: delete account");
        Scanner option = new Scanner(System.in);
        String chosen = option.nextLine();
        String arr[][] = new String[10][10];
        int p = 0;
        if(chosen == "R"){

        //Account Creation
        }else if(chosen == "C"){
            //Prompts Username
            Random rand = new Random();
            System.out.println("Enter your name: ");
            Scanner name = new Scanner(System.in);
            String userName = name.nextLine();
            arr[p][1] = userName;

            //Declared Account Type
            System.out.println("What type of account?");
            String accType = name.nextLine();
            arr[p][2] = accType;

            //Random Account Number
            System.out.println("New Account Number: ");
            int accNum = rand.nextInt(10000000);
            //arr[p][3] = accNum;

            //Account Balance
            System.out.println("Make a deposit: ");
            Scanner scan = new Scanner(System.in);
            String accBalance = scan.nextLine();
            arr[p][4] = accBalance;

        }else if(chosen == "U"){
            //Write a method that ask for account number

            //Write another method that prints out all the options that are available to change for the user and ask for
            //the input that they want to change

            //Use a nested if else statement that points towards what the users would like to change and have them enter
            //the new value

            //run a check to see if what they entered is correct

            //if correct then update the old variable with the new one

            //if incorrect repeat steps 3-6

        }else if(chosen == "D"){
            System.out.println("Are you sure that you would like to delete this account?");
            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.nextLine();
            //if yes delete account
            //if no go back to main menu

        }else{
            System.out.println("Invalid option");
        }
        //A driver class must be created to run the program and interact through the command line
        //Method to create, update, read, and delete account application
        //organization by adding arrays and tables to hold the information.
        //set up folders as a bridge or connection between each account that holds all the information inside of it.

        //Account ids must be in a random sequence or order
        // methods to save current account information to a .csv file
    }
}
