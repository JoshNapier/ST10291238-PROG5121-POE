/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joshn
 */
public class TaskManager {

    Scanner scanner = new Scanner(System.in);

    private Task task;
    private User user;
    
    
    AddTask task = new AddTask();


    int choice;

    
        while{
        System.out.println("1. Display tasks with status 'Done'");
        System.out.println("2. Display the task with the longest duration");
        System.out.println("3. Search for a task by name");
        System.out.println("4. Search for tasks assigned to a developer");
        System.out.println("5. Delete a task by name");
        System.out.println("6. Display the full task report");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> displayTasksWithStatus("Done");
            case 2 -> displayTaskWithLongestDuration();
            case 3 -> searchTaskByName(scanner);
            case 4 -> searchTasksByDeveloper(scanner);
            case 5 -> deleteTaskByName(scanner);
            case 6 -> displayTaskReport();
            case 7 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

private static void displayTasksWithStatus(String status) {
        System.out.println("Tasks with status '" + status + "':");

        for (int i = 0; i < taskStatus.size(); i++) {
            if (taskStatus.get(i).equalsIgnoreCase(status)) {
                System.out.println("Developer: " + developer.get(i));
                System.out.println("Task Name: " + taskName.get(i));
                System.out.println("Task Duration: " + taskDuration.get(i));
                System.out.println();
            }
        }
    }

    private static void displayTaskWithLongestDuration() {
        int maxDurationIndex = 0;
        int maxDuration = taskDuration.get(0);

        for (int i = 1; i < taskDuration.size(); i++) {
            if (taskDuration.get(i) > maxDuration) {
                maxDuration = taskDuration.get(i);
                maxDurationIndex = i;
            }
        }

        System.out.println("Task with the longest duration:");
        System.out.println("Developer: " + developer.get(maxDurationIndex));
        System.out.println("Task Duration: " + taskDuration.get(maxDurationIndex));
        System.out.println();
    }

    private static void searchTaskByName(Scanner scanner) {
        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();

        int index = taskName.indexOf(taskName);
        if (index != -1) {
            System.out.println("Task Found!");
            System.out.println("Task Name: " + taskName.get(index));
            System.out.println("Developer: " + developer.get(index));
            System.out.println("Task Status: " + taskStatus.get(index));
        } else {
            System.out.println("Task Not Found!");
        }

        System.out.println();
    }

    private static void searchTasksByDeveloper(Scanner scanner) {
        System.out.print("Enter developer name: ");
        String developer = scanner.nextLine();

        System.out.println("Tasks assigned to developer '" + developer + "':");

        for (int i = 0; i < developer.size(); i++) {
            if (developer.get(i).equalsIgnoreCase(developer)) {
                System.out.println("Task Name: " + taskName.get(i));
                System.out.println("Task Status: " + taskStatus.get(i));
                System.out.println();
            }
        }
    }

    private static void deleteTaskByName(Scanner scanner) {
        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();

        int index = taskName.indexOf(taskName);
        if (index != -1) {
            developer.remove(index);
            taskName.remove(index);
            taskID.remove(index);
            taskDuration.remove(index);
            taskStatus.remove(index);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task Not Found!");
        }

        System.out.println();
    }

    private static void displayTaskReport() {
        System.out.println("Task Report:");

        for (int i = 0; i < taskName.size(); i++) {
            System.out.println("Task ID: " + taskID.get(i));
            System.out.println("Developer: " + developer.get(i));
            System.out.println("Task Name: " + taskName.get(i));
            System.out.println("Task Duration: " + taskDuration.get(i));
            System.out.println("Task Status: " + taskStatus.get(i));
            System.out.println();
        }
    }

}
//--------------------------END OF CLASS--------------------------------------//
