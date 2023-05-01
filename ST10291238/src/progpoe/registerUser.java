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
public class registerUser extends ProgPOE {

    private static void registerUser(Scanner scanner) {
        System.out.print("\nEnter username: ");
        String username = scanner.next();

        // Check if username already exists
        if (registeredUsers.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different username.");
            return;
        }

        System.out.print("Enter password: ");
        String password = scanner.next();

        System.out.print("Enter first name: ");
        String firstName = scanner.next();

        System.out.print("Enter surname: ");
        String surname = scanner.next();

        // Add the new user to the registered users HashMap
        registeredUsers.put(username, password);

        System.out.println("\nRegistration successful!");
    }
}
