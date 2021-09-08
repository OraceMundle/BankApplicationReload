/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Customer;
import java.sql.ResultSet;
import java.util.List;
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
public class CustomerManagerTest {
    
    public CustomerManagerTest() {
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
     * Test of addCustomer method, of class CustomerManager.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer aCustomer = new Customer("50000000", "Jill", "Thomass", "April 25 1987", "jillThomas@gmail.com","875412899","5");
        CustomerManager instance = new CustomerManager();
        instance.addCustomer(aCustomer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class CustomerManager.
     */
    
    /*
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        String trn = "";
        CustomerManager instance = new CustomerManager();
        Customer expResult = null;
        Customer result = instance.getCustomer(trn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomer method, of class CustomerManager.
     
    @Test
    public void testUpdateCustomer() {
        System.out.println("updateCustomer");
        Customer aCustomer = null;
        CustomerManager instance = new CustomerManager();
        instance.updateCustomer(aCustomer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomer method, of class CustomerManager.
     
    @Test
    public void testGetAllCustomer() {
        System.out.println("getAllCustomer");
        CustomerManager instance = new CustomerManager();
        List<Customer> expResult = null;
        List<Customer> result = instance.getAllCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerManager.
     
    @Test
    public void testDeleteCustomer_Class_String() {
        System.out.println("deleteCustomer");
        Class Customer = null;
        String trn = "";
        CustomerManager instance = new CustomerManager();
        instance.deleteCustomer(Customer, trn);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomerJDBC method, of class CustomerManager.
     
    @Test
    public void testAddCustomerJDBC() {
        System.out.println("addCustomerJDBC");
        Customer anCustomer = null;
        CustomerManager instance = new CustomerManager();
        instance.addCustomerJDBC(anCustomer);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerJDBC method, of class CustomerManager.
     
    @Test
    public void testGetCustomerJDBC() {
        System.out.println("getCustomerJDBC");
        String trn = "";
        CustomerManager instance = new CustomerManager();
        Customer expResult = null;
        Customer result = instance.getCustomerJDBC(trn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomerJDBC method, of class CustomerManager.
     
    @Test
    public void testUpdateCustomerJDBC() {
        System.out.println("updateCustomerJDBC");
        Customer aCustomer = null;
        CustomerManager instance = new CustomerManager();
        instance.updateCustomerJDBC(aCustomer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomerJDBC method, of class CustomerManager.
     
    @Test
    public void testGetAllCustomerJDBC() {
        System.out.println("getAllCustomerJDBC");
        CustomerManager instance = new CustomerManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllCustomerJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerManager.
     
    @Test
    public void testDeleteCustomer_String() {
        System.out.println("deleteCustomer");
        String trn = "";
        CustomerManager instance = new CustomerManager();
        instance.deleteCustomer(trn);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
}
