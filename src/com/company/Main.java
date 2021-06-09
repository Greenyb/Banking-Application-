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
        String arr[][] = new String[][];
        int p = 0;
        if(chosen == "R"){

        }else if(chosen == "C"){
            Random rand = new Random();
            System.out.println("Enter your name: ");
            Scanner name = new Scanner(System.in);
            String userName = name.nextLine();
            arr[p][] = new String[userName];
            System.out.println("What type of account?");
            String accType = name.nextLine();
            int accNum = rand.nextInt(10000000);

        }else if(chosen == "U"){

        }else if(chosen == "D"){

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
