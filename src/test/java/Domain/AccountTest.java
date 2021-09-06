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
public class AccountTest {
    
    public AccountTest() {
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
     * Test of getWorkerId method, of class Account.
     */
    @Test
    public void testGetWorkerId() {
        System.out.println("getWorkerId");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getWorkerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountnumber method, of class Account.
     */
    @Test
    public void testGetAccountnumber() {
        System.out.println("getAccountnumber");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getAccountnumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Account instance = new Account();
        float expResult = 0.0F;
        float result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanAmount method, of class Account.
     */
    @Test
    public void testGetLoanAmount() {
        System.out.println("getLoanAmount");
        Account instance = new Account();
        float expResult = 0.0F;
        float result = instance.getLoanAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonthlyInstalment method, of class Account.
     */
    @Test
    public void testGetMonthlyInstalment() {
        System.out.println("getMonthlyInstalment");
        Account instance = new Account();
        float expResult = 0.0F;
        float result = instance.getMonthlyInstalment();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOpened method, of class Account.
     */
    @Test
    public void testGetDateOpened() {
        System.out.println("getDateOpened");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getDateOpened();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDateClosed method, of class Account.
     */
    @Test
    public void testGetDateClosed() {
        System.out.println("getDateClosed");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getDateClosed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerTRN method, of class Account.
     */
    @Test
    public void testGetCustomerTRN() {
        System.out.println("getCustomerTRN");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getCustomerTRN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountnumber method, of class Account.
     */
    @Test
    public void testSetAccountnumber() {
        System.out.println("setAccountnumber");
        String accountnumber = "";
        Account instance = new Account();
        instance.setAccountnumber(accountnumber);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setWorkerId method, of class Account.
     */
    @Test
    public void testSetWorkerId() {
        System.out.println("setWorkerId");
        String workerId = "";
        Account instance = new Account();
        instance.setWorkerId(workerId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBalance method, of class Account.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        float balance = 0.0F;
        Account instance = new Account();
        instance.setBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanAmount method, of class Account.
     */
    @Test
    public void testSetLoanAmount() {
        System.out.println("setLoanAmount");
        float loanAmount = 0.0F;
        Account instance = new Account();
        instance.setLoanAmount(loanAmount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMonthlyInstalment method, of class Account.
     */
    @Test
    public void testSetMonthlyInstalment() {
        System.out.println("setMonthlyInstalment");
        float monthlyInstalment = 0.0F;
        Account instance = new Account();
        instance.setMonthlyInstalment(monthlyInstalment);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOpened method, of class Account.
     */
    @Test
    public void testSetDateOpened() {
        System.out.println("setDateOpened");
        String dateOpened = "";
        Account instance = new Account();
        instance.setDateOpened(dateOpened);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDateClosed method, of class Account.
     */
    @Test
    public void testSetDateClosed() {
        System.out.println("setDateClosed");
        String dateClosed = "";
        Account instance = new Account();
        instance.setDateClosed(dateClosed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerTRN method, of class Account.
     */
    @Test
    public void testSetCustomerTRN() {
        System.out.println("setCustomerTRN");
        String customerTRN = "";
        Account instance = new Account();
        instance.setCustomerTRN(customerTRN);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
