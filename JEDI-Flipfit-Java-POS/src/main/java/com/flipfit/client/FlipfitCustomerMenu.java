package com.flipfit.client;

public class FlipfitCustomerMenu {
    public static void display() {
        System.out.println("Welcome to Customer Menu");
        System.out.println("Choose an option:" +
                "\n 1. View Booked Slots" +
                "\n 2. View Centres" +
                "\n 3. Logout");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch (choice){
            case 1:{
                //TODO - Show slot booked corresponding to FlipFit CustomerId
            }
            case 2:{
                //TODO - Display Gym centres list
                //TODO - Enter Gym id
                //TODO - Show Available slots and choose slot
            }
            case 3:{
                //TODO - Logout and move to main menu
            }
        }
        // Add customer-specific options here

    }
}
