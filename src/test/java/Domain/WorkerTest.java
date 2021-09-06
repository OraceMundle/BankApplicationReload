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
public class WorkerTest {
    
    public WorkerTest() {
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
     * Test of getId method, of class Worker.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Worker instance = new Worker();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class Worker.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Worker instance = new Worker();
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class Worker.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        Worker instance = new Worker();
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephoneNumber method, of class Worker.
     */
    @Test
    public void testGetTelephoneNumber() {
        System.out.println("getTelephoneNumber");
        Worker instance = new Worker();
        String expResult = "";
        String result = instance.getTelephoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Worker.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Worker instance = new Worker();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Worker.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Worker instance = new Worker();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class Worker.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        Worker instance = new Worker();
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLastname method, of class Worker.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "";
        Worker instance = new Worker();
        instance.setLastname(lastname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelephoneNumber method, of class Worker.
     */
    @Test
    public void testSetTelephoneNumber() {
        System.out.println("setTelephoneNumber");
        String telephoneNumber = "";
        Worker instance = new Worker();
        instance.setTelephoneNumber(telephoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Worker.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Worker instance = new Worker();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
