package com.flipfit.client;

import java.util.Scanner;

public class FlipfitApplicationMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to Flipfit application:");
            System.out.println("1. Login");
            System.out.println("2. Registration of the Customer");
            System.out.println("3. Registration of Gym Owner");
            System.out.println("4. Update Password");
            System.out.println("5. Exit");

            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Login
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter role (Admin/GymOwner/Customer): ");
                    String role = scanner.nextLine();

                    if (login(username, password, role)) {
                        switch (role.toLowerCase()) {
                            case "admin":
                                FlipfitAdminMenu.display();
                                break;
                            case "customer":
                                FlipfitCustomerMenu.display();
                                break;
                            case "gymowner":
                                FlipfitGymOwnerMenu.display();
                                break;
                            default:
                                System.out.println("Invalid role.");
                        }
                    } else {
                        System.out.println("Invalid credentials.");
                    }
                    break;

                case 2:
                    // Registration of the Customer
                    System.out.println("Customer Registration");
                    // Add registration logic here
                    break;

                case 3:
                    // Registration of Gym Owner
                    System.out.println("Gym Owner Registration");
                    // Add registration logic here
                    break;

                case 4:
                    // Update Password
                    System.out.println("Update Password");
                    // Add password update logic here
                    break;

                case 5:
                    running = false; // Exit the loop
                    System.out.println("Exiting the application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    // Dummy login method with role
    private static boolean login(String username, String password, String role) {
        // Replace with actual login logic to validate credentials and role
        return true; // Invalid credentials
    }
}
