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
        if (chosen.equals("R")) {

            //Account Creation
            //Prompt user to show all or a specific account
            System.out.println("Show all bank info or a specific account? (A/S)");
            Scanner account = new Scanner(System.in);
            String acc = account.nextLine();
            if (acc.equals("A")) {
                for (int i = 0; i <= arr.length; i++) {
                    System.out.print(arr[i][0] + " |" + arr[i][1] + " |" + arr[i][2] + " |" + arr[i][3]);
                }
            } else if (acc.equals("S")) {
                System.out.println("Enter the account number: ");
                String accountNum = account.nextLine();
                for (int j = 0; j <= arr.length; j++) {
                    if (arr[j][2].equals(accountNum)) {
                        System.out.print(arr[j][0] + " |" + arr[j][1] + " |" + arr[j][2] + " |" + arr[j][3]);
                        break;
                    } else if (!arr[arr.length - 1][2].equals(accountNum)) {
                        System.out.println("Invalid Number");
                    }
                }
            }

        } else if (chosen.equals("C")) {
            //Prompts Username
            Random rand = new Random();
            System.out.println("Enter your name(FirstName LastName): ");
            Scanner name = new Scanner(System.in);
            String userName = name.nextLine();
            arr[p][0] = userName;

            //Declared Account Type
            System.out.println("What type of account?(Savings/Checkings)");
            String accType = name.nextLine();
            arr[p][1] = accType;

            //Random Account Number

            int accNum = rand.nextInt(10000000);
            System.out.println("New Account Number: \n" + accNum);
            String accNumB = String.valueOf(accNum);
            arr[p][2] = accNumB;

            //Account Balance
            System.out.println("Make a deposit: ");
            Scanner scan = new Scanner(System.in);
            String accBalance = scan.nextLine();
            arr[p][3] = accBalance;

            p = p + 1;

        } else if (chosen.equals("U")) {
            //Write a method that ask for account number
            System.out.println("Enter the account number: ");
            Scanner scans = new Scanner(System.in);
            String userUpdate = scans.nextLine();
            for (int j = 0; j <= arr.length; j++) {
                if (arr[j][2].equals(userUpdate)) {
                    System.out.println("change name or make a deposit (n/d)");
                    String userDeposit = scans.nextLine();
                    if (userDeposit.equals("n")) {
                        System.out.println("What would you like to change your name to?");
                        String userChange = scans.nextLine();
                        arr[j][0].equals(userChange);
                        System.out.println("your name had been updated");
                    } else if (userDeposit.equals("d"))
                        System.out.println("How much would you like to deposit?");
                    String userChange = scans.nextLine();
                    arr[j][3] = String.valueOf(Double.parseDouble(arr[j][3])+Double.parseDouble(userChange));
                System.out.println("your account balance is: " + arr[j][3]);
                        break;
                } else if (!arr[arr.length - 1][2].equals(userUpdate)) {
                    System.out.println("Invalid Number");
                }
            }
            //Write another method that prints out all the options that are available to change for the user and ask for
            //the input that they want to change

            //Use a nested if else statement that points towards what the users would like to change and have them enter
            //the new value

            //run a check to see if what they entered is correct

            //if correct then update the old variable with the new one

            //if incorrect repeat steps 3-6

        } else if (chosen.equals("D")) {
            System.out.println("Are you sure that you would like to delete this account? (Y/N)");
            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.nextLine();
            //if yes delete account
            if (userAnswer.equals("Y")) {
                System.out.println("Please enter the account number: ");
                String accountNum = scan.nextLine();
                String[][] tempArr = new String[arr.length - 1][3];
                for (int i = 0; i <= arr.length; i++) {
                    //if rows account number does not equal accountNum
                    if (!arr[i][2].equals(accountNum)) {
                        //Add every column of tempArr[i][]
                        for (int x = 0; x <= 3; x++) {
                            tempArr[i][x] = arr[i][x];
                        }
                    }
                }
                arr = tempArr;
                //if no go back to main menu
            }
//            else if(userAnswer == "N"){
//                break;
//            }

        } else {

        }
        //A driver class must be created to run the program and interact through the command line
        //Method to create, update, read, and delete account application
        //organization by adding arrays and tables to hold the information.
        //set up folders as a bridge or connection between each account that holds all the information inside of it.

        //Account ids must be in a random sequence or order
        // methods to save current account information to a .csv file
    }
}

