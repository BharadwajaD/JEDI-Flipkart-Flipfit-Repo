package com.flipfit.client;

import java.util.Scanner;

public class FlipfitAdminMenu {
    public static void display() {
        System.out.println("Welcome to Admin Menu");
        System.out.println("1. View pending requests");
        System.out.println("2. Go back to previous menu");


        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch (choice){
            case 1: {
                //TODO - print pending requests
                System.out.println("Enter owner id to be approved");
                int ownerId = sc.nextInt();
                //TODO - Approve request and Gym to database
            }
            case 2:{
                //TODO - Go back to previous menu
            }
            default:{
                //TODO- INVALID INPUT
            }
        }
        // Add admin-specific options here
    }
}
