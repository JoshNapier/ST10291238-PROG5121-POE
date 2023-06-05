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
public class registerUser {

    private User user;

    public registerUser() {
        Scanner sc = new Scanner(System.in);

        user = new User("", "");

            System.out.print("\nEnter username: ");
            String username = sc.next();
            user.setUsername(username);
            
             if (username.length() > 5 || !username.contains("_")) {
        System.out.println("Invalid username. Username must be no more than 5 characters long and contain an underscore.");
        return;
    }
        // Check if username already exists
//        if (registeredUsers.containsKey(username)) {
//            System.out.println("Username already exists. Please choose a different username.");
//            return;
//        }
        System.out.print("Enter password: ");
        String password = sc.next();
        user.setPassword(password);

        boolean containsUppercase = false;
        boolean containsNumber = false;
        boolean containsSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                containsUppercase = true;
            } else if (Character.isDigit(c)) {
                containsNumber = true;
            } else if ("!@#$%^&*()_+-=[]{}|;':<>,.?/".indexOf(c) != -1) {
                containsSpecialCharacter = true;
            }
        }
        
        if (password.length() < 8 || !containsUppercase || !containsNumber || !containsSpecialCharacter) {
        System.out.println("Invalid password. Password must be at least 8 characters long, contain an uppercase letter, a number, and a special character.");
        return;
    }
        
        System.out.print("Enter first name: ");
        String firstName = sc.next();
        user.setFirstName(firstName);

        
        System.out.print("Enter surname: ");
        String surname = sc.next();
        user.setSurname(surname);

        System.out.println("\nRegistration successful!");

    }
        public User getUser() {
            return user;
         }

  

}
