/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpoe;

import java.util.Scanner;

/**
 *
 * @author joshn
 */
public class loginUser extends ProgPOE {

    private static void loginUser(Scanner scanner) {
        System.out.print("\nEnter username: ");
        String username = scanner.next();

        // Check if username exists
        if (!registeredUsers.containsKey(username)) {
            System.out.println("Username not found. Please try again.");
            return;
        }

        System.out.print("Enter password: ");
        String password = scanner.next();

        // Check if the entered password matches the registered password for the given username
        if (!registeredUsers.get(username).equals(password)) {
            System.out.println("Incorrect password. Please try again.");
            return;
        }

        System.out.println("\nLogin successful!");
        System.out.println("Welcome, " + username + "!");
    }
}
