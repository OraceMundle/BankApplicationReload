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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getTrn method, of class Customer.
     */
    @Test
    public void testGetTrn() {
        System.out.println("getTrn");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getTrn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class Customer.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class Customer.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDob method, of class Customer.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getDob();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Customer.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephoneNum method, of class Customer.
     */
    @Test
    public void testGetTelephoneNum() {
        System.out.println("getTelephoneNum");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getTelephoneNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTrn method, of class Customer.
     */
    @Test
    public void testSetTrn() {
        System.out.println("setTrn");
        String trn = "";
        Customer instance = new Customer();
        instance.setTrn(trn);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class Customer.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        Customer instance = new Customer();
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLastname method, of class Customer.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "";
        Customer instance = new Customer();
        instance.setLastname(lastname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDob method, of class Customer.
     */
    @Test
    public void testSetDob() {
        System.out.println("setDob");
        String dob = "";
        Customer instance = new Customer();
        instance.setDob(dob);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Customer.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Customer instance = new Customer();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelephoneNum method, of class Customer.
     */
    @Test
    public void testSetTelephoneNum() {
        System.out.println("setTelephoneNum");
        String telephoneNum = "";
        Customer instance = new Customer();
        instance.setTelephoneNum(telephoneNum);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
