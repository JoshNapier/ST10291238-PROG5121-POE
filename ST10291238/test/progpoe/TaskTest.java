/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package progpoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joshn
 */
public class TaskTest {
    
    public TaskTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTaskName method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskName method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testSetTaskName() {
        System.out.println("setTaskName");
        String taskName = "";
        Task instance = null;
        instance.setTaskName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskNum method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testGetTaskNum() {
        System.out.println("getTaskNum");
        Task instance = null;
        int expResult = 0;
        int result = instance.getTaskNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDescr method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testGetTaskDescr() {
        System.out.println("getTaskDescr");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskDescr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskDescr method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testSetTaskDescr() {
        System.out.println("setTaskDescr");
        String taskDescr = "";
        Task instance = null;
        instance.setTaskDescr(taskDescr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDuration method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testGetTaskDuration() {
        System.out.println("getTaskDuration");
        Task instance = null;
        double expResult = 0.0;
        double result = instance.getTaskDuration();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskDuration method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testSetTaskDuration() {
        System.out.println("setTaskDuration");
        double taskDuration = 0.0;
        Task instance = null;
        instance.setTaskDuration(taskDuration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskID method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testGetTaskID() {
        System.out.println("getTaskID");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskID method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testSetTaskID() {
        System.out.println("setTaskID");
        String taskID = "";
        Task instance = null;
        instance.setTaskID(taskID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskStatus method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testGetTaskStatus() {
        System.out.println("getTaskStatus");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskStatus method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testSetTaskStatus() {
        System.out.println("setTaskStatus");
        String taskStatus = "";
        Task instance = null;
        instance.setTaskStatus(taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
