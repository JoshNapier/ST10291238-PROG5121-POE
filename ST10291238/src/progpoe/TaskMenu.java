/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpoe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joshn
 */
public class TaskMenu {

    public static ArrayList<Task> tasks = new ArrayList<>();
    public static void menu(User user) {
        Scanner scanner = new Scanner(System.in);
        boolean quitFlag = false;

        while(true) {
            System.out.println("Welcome to EasyKanban");
            System.out.println("\nWhat would you like to do? (Enter the corresponding number)");
            System.out.println("1. Add tasks");
            System.out.println("2. Show report");
            System.out.println("3. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    AddTask task = new AddTask(tasks, user);
                }
                case 2 -> System.out.println("Coming soon!");
                case 3 -> {
                    System.out.println("Logging out...");
                    scanner.close();
                }
                default -> System.out.println("Invalid choice.");
            }
            if(quitFlag) break;
        }
    }
    
    
    
    
}
//--------------------------- END OF CLASS -----------------------------------//
