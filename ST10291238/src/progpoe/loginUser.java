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
public class loginUser {

    private User user;
    private boolean validLogin = false;
    
    public boolean isValidLogin() {
        return this.validLogin;
    }

    public loginUser(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter username: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();
        user = new User(username, password);

        // Check if the entered password matches the registered password for the given username
        if (!users.contains(user)) {
            System.out.println("Incorrect password. Please try again.");
            return;
        }
        user = users.get(users.indexOf(user));

        // Check validity of login
        boolean found = false;
        for (int i = 0; i < users.size() && !found; i++) {
            User current = users.get(i);
            this.validLogin = current.getUsername().equals(user.getUsername()) && current.getPassword().equals(user.getPassword());
            if (validLogin){
                this.user = current;
                System.out.println("\nLogin successful!");
            }
            else{
                found = true;
                System.out.println("Login failed");
                return;
            }
        }
        if(validLogin) {
            System.out.println("Welcome " + user.getFirstName() + " " + user.getSurname() + ", it is great to see you again.");
        }
       
    }

    public User getUser() {
        return user;
    }

}
//----------------------- END OF CLASS ---------------------------------------//