/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpoe;

/**
 *
 * @author joshn
 */
public class Task {

    public String taskName;
    public int taskNum;
    public String taskDescr;
    public double taskDuration;
    public String taskID;
    public String taskStatus;
    public static int taskAmount = 0;

    public Task(String taskName, String taskDescr, double taskDuration, String taskID, String taskStatus) {
        taskAmount++;
        this.taskName = taskName;
        this.taskNum = taskAmount;
        this.taskDescr = taskDescr;
        this.taskDuration = taskDuration;
        this.taskID = taskID;
        this.taskStatus = taskStatus;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public String getTaskDescr() {
        return taskDescr;
    }

    public void setTaskDescr(String taskDescr) {
        this.taskDescr = taskDescr;
    }

    public double getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(double taskDuration) {
        this.taskDuration = taskDuration;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

}
//------------------------ END OF CLASS --------------------------------------//
