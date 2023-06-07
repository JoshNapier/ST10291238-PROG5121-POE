/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progpoe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joshn
 */
public class ProgPOE {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<User> users = new ArrayList<User>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWhat would you like to do? (Enter the corresponding number)");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerUser register = new registerUser();
                    users.add(register.getUser());
                    break;
                case 2:
                    loginUser login = new loginUser(users);
                    TaskMenu menu = new TaskMenu();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

}
//------------------------- END OF FILE --------------------------------------//