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
    public String taskID;
    public String taskStatus;
    
    public Task (String taskName, int taskNum, String taskDescr, String taskID, String taskStatus) {
        this.taskName = taskName;
        this.taskNum = taskNum;
        this.taskDescr = taskDescr;
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

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public String getTaskDescr() {
        return taskDescr;
    }

    public void setTaskDescr(String taskDescr) {
        this.taskDescr = taskDescr;
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