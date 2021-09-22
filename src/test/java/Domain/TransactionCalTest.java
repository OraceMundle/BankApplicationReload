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
public class TransactionCalTest {
    
    public TransactionCalTest() {
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
     * Test of getTransactionid method, of class TransactionCal.
     */
    @Test
    public void testGetTransactionid() {
        System.out.println("getTransactionid");
        TransactionCal instance = new TransactionCal();
        int expResult = 0;
        int result = instance.getTransactionid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorker_id method, of class TransactionCal.
     */
    @Test
    public void testGetWorker_id() {
        System.out.println("getWorker_id");
        TransactionCal instance = new TransactionCal();
        String expResult = "";
        String result = instance.getWorker_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount_number method, of class TransactionCal.
     */
    @Test
    public void testGetAccount_number() {
        System.out.println("getAccount_number");
        TransactionCal instance = new TransactionCal();
        int expResult = 0;
        int result = instance.getAccount_number();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrent_balance method, of class TransactionCal.
     */
    @Test
    public void testGetCurrent_balance() {
        System.out.println("getCurrent_balance");
        TransactionCal instance = new TransactionCal();
        float expResult = 0.0F;
        float result = instance.getCurrent_balance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPayment_amount method, of class TransactionCal.
     */
    @Test
    public void testGetPayment_amount() {
        System.out.println("getPayment_amount");
        TransactionCal instance = new TransactionCal();
        float expResult = 0.0F;
        float result = instance.getPayment_amount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrevious_balance method, of class TransactionCal.
     */
    @Test
    public void testGetPrevious_balance() {
        System.out.println("getPrevious_balance");
        TransactionCal instance = new TransactionCal();
        float expResult = 0.0F;
        float result = instance.getPrevious_balance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransaction_date method, of class TransactionCal.
     */
    @Test
    public void testGetTransaction_date() {
        System.out.println("getTransaction_date");
        TransactionCal instance = new TransactionCal();
        String expResult = "";
        String result = instance.getTransaction_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount method, of class TransactionCal.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        TransactionCal instance = new TransactionCal();
        Account expResult = null;
        Account result = instance.getAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorker method, of class TransactionCal.
     */
    @Test
    public void testGetWorker() {
        System.out.println("getWorker");
        TransactionCal instance = new TransactionCal();
        Worker expResult = null;
        Worker result = instance.getWorker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransactionid method, of class TransactionCal.
     */
    @Test
    public void testSetTransactionid() {
        System.out.println("setTransactionid");
        int transactionid = 0;
        TransactionCal instance = new TransactionCal();
        instance.setTransactionid(transactionid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWorker_id method, of class TransactionCal.
     */
    @Test
    public void testSetWorker_id() {
        System.out.println("setWorker_id");
        String worker_id = "";
        TransactionCal instance = new TransactionCal();
        instance.setWorker_id(worker_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccount_number method, of class TransactionCal.
     */
    @Test
    public void testSetAccount_number() {
        System.out.println("setAccount_number");
        int account_number = 0;
        TransactionCal instance = new TransactionCal();
        instance.setAccount_number(account_number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrent_balance method, of class TransactionCal.
     */
    @Test
    public void testSetCurrent_balance() {
        System.out.println("setCurrent_balance");
        float current_balance = 0.0F;
        TransactionCal instance = new TransactionCal();
        instance.setCurrent_balance(current_balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPayment_amount method, of class TransactionCal.
     */
    @Test
    public void testSetPayment_amount() {
        System.out.println("setPayment_amount");
        float payment_amount = 0.0F;
        TransactionCal instance = new TransactionCal();
        instance.setPayment_amount(payment_amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrevious_balance method, of class TransactionCal.
     */
    @Test
    public void testSetPrevious_balance() {
        System.out.println("setPrevious_balance");
        float previous_balance = 0.0F;
        TransactionCal instance = new TransactionCal();
        instance.setPrevious_balance(previous_balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransaction_date method, of class TransactionCal.
     */
    @Test
    public void testSetTransaction_date() {
        System.out.println("setTransaction_date");
        String transaction_date = "";
        TransactionCal instance = new TransactionCal();
        instance.setTransaction_date(transaction_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccount method, of class TransactionCal.
     */
    @Test
    public void testSetAccount() {
        System.out.println("setAccount");
        Account account = null;
        TransactionCal instance = new TransactionCal();
        instance.setAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWorker method, of class TransactionCal.
     */
    @Test
    public void testSetWorker() {
        System.out.println("setWorker");
        Worker worker = null;
        TransactionCal instance = new TransactionCal();
        instance.setWorker(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateBalance method, of class TransactionCal.
     */
    @Test
    public void testCalculateBalance() {
        System.out.println("CalculateBalance");
        float payment_amount = 0.0F;
        TransactionCal instance = new TransactionCal();
        instance.CalculateBalance(payment_amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
