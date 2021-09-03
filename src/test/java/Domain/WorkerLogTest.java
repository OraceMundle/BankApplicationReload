/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OraceMundle
 */
public class WorkerLogTest {
    
    public WorkerLogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class WorkerLog.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        WorkerLog instance = new WorkerLog();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class WorkerLog.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        WorkerLog instance = new WorkerLog();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWorkerId method, of class WorkerLog.
     */
    @Test
    public void testSetWorkerId() {
        System.out.println("setWorkerId");
        String workerId = "";
        WorkerLog instance = new WorkerLog();
        instance.setWorkerId(workerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class WorkerLog.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        WorkerLog instance = new WorkerLog();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class WorkerLog.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        WorkerLog instance = new WorkerLog();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkerId method, of class WorkerLog.
     */
    @Test
    public void testGetWorkerId() {
        System.out.println("getWorkerId");
        WorkerLog instance = new WorkerLog();
        String expResult = "";
        String result = instance.getWorkerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class WorkerLog.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        WorkerLog instance = new WorkerLog();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class WorkerLog.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        WorkerLog instance = new WorkerLog();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
