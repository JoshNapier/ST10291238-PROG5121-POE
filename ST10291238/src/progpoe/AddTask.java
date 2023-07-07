/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpoe;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joshn
 */
public class AddTask {

    private static List<String> developers = new ArrayList<>();
    private static List<String> taskNames = new ArrayList<>();
    private static List<String> taskIDs = new ArrayList<>();
    private static List<Double> taskDurations = new ArrayList<>();
    private static List<String> taskStatuses = new ArrayList<>();
    
    Scanner scanner = new Scanner(System.in);

    private User user;
    private Task task;

    private int totalHours;


    public AddTask(ArrayList<Task> tasks, User user) {
        this.user = user;

        System.out.println("How many tasks would you like to create?");
        int taskAmount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < taskAmount; i++) {

            System.out.println("Enter task name: ");
            String taskName = scanner.nextLine();
            taskNames.add(taskName);

            System.out.println("Enter task description (max 50 characters): ");
            String taskDescr = scanner.nextLine();

            System.out.println("Enter task duration in hours: ");
            double taskDuration = Double.parseDouble(scanner.nextLine());
            taskDurations.add(taskDuration);

            if (taskDescr.length() > 50) {
                System.out.println("Please enter a task description of less than 50 characters");
                i--;
                continue;
            }

            String taskID = generateTaskID(taskName, i, user.getSurname());
            taskIDs.add(taskID);

            String taskStatus = selectTaskStatus();

            String taskDetails = "Task Status: " + taskStatus + "\n"
                    + "Developer Details: " + user.getFirstName() + " " + user.getSurname() + "\n"
                    + "Task Number: " + i + "\n"
                    + "Task Name: " + taskName + "\n"
                    + "Task Description: " + taskDescr + "\n"
                    + "Task ID: " + taskID + "\n"
                    + "Duration: " + taskDuration + " hours";
            JOptionPane.showMessageDialog(null, taskDetails);
            
            developers.add(user.getFirstName() + " " + user.getSurname());

            totalHours += taskDuration;
        }
    }

    private String generateTaskID(String taskName, int taskNumber, String Surname) {
        String taskID = taskName.substring(0, 2).toUpperCase()
                + ":"
                + taskNumber
                + ":"
                + Surname.substring(Surname.length() - 3).toUpperCase();

        return taskID;
    }

    private String selectTaskStatus() {
        System.out.println("Select Task Status:");
        System.out.println("1) To Do");
        System.out.println("2) Done");
        System.out.println("3) Doing");
        System.out.print("Enter status number or phrase (lower case): \n");

        String status = scanner.nextLine().trim().toLowerCase();

        switch (status) {
            case "1", "to do" -> {
                taskStatuses.add("To Do");
                return "To Do";
            }
            case "2", "done" -> {
                taskStatuses.add("Done");
                return "Done";
            }
            case "3", "doing" -> {
                taskStatuses.add("Doing");
                return "Doing";
            }
            default -> {
                System.out.println("Invalid status. Defaulting to 'To Do'.");
                taskStatuses.add("To Do");
                return "To Do";
            }
        }

    }

    public static List<String> getDevelopers() {
        return developers;
    }

    public static List<String> getTaskNames() {
        return taskNames;
    }

    public static List<String> getTaskIDs() {
        return taskIDs;
    }

    public static List<Double> getTaskDurations() {
        return taskDurations;
    }

    public static List<String> getTaskStatuses() {
        return taskStatuses;
    }
    
}



//---------------------------- END OF CLASS ----------------------------------//
