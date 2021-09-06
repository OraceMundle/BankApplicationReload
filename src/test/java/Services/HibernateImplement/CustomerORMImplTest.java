/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.HibernateImplement;

import Domain.Customer;
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
public class CustomerORMImplTest {
    
    public CustomerORMImplTest() {
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
     * Test of addCustomer method, of class CustomerORMImpl.
     */
    @Test
    public void testAddCustomer() throws Exception {
        System.out.println("addCustomer");
        Customer customer = null;
        CustomerORMImpl instance = new CustomerORMImpl();
        instance.addCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomer method, of class CustomerORMImpl.
     */
    @Test
    public void testUpdateCustomer() throws Exception {
        System.out.println("updateCustomer");
        Customer customer = null;
        CustomerORMImpl instance = new CustomerORMImpl();
        instance.updateCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class CustomerORMImpl.
     */
    @Test
    public void testGetCustomer() throws Exception {
        System.out.println("getCustomer");
        String trn = "";
        CustomerORMImpl instance = new CustomerORMImpl();
        Customer expResult = null;
        Customer result = instance.getCustomer(trn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomers method, of class CustomerORMImpl.
     */
    @Test
    public void testGetAllCustomers() throws Exception {
        System.out.println("getAllCustomers");
        CustomerORMImpl instance = new CustomerORMImpl();
        List<Customer> expResult = null;
        List<Customer> result = instance.getAllCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerORMImpl.
     */
    @Test
    public void testDeleteCustomer() throws Exception {
        System.out.println("deleteCustomer");
        Class Customer = null;
        String trn = "";
        CustomerORMImpl instance = new CustomerORMImpl();
        instance.deleteCustomer(Customer, trn);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomerJDBC method, of class CustomerORMImpl.
     */
    @Test
    public void testAddCustomerJDBC() throws Exception {
        System.out.println("addCustomerJDBC");
        Customer customer = null;
        CustomerORMImpl instance = new CustomerORMImpl();
        instance.addCustomerJDBC(customer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomerJDBC method, of class CustomerORMImpl.
     */
    @Test
    public void testUpdateCustomerJDBC() throws Exception {
        System.out.println("updateCustomerJDBC");
        Customer customer = null;
        CustomerORMImpl instance = new CustomerORMImpl();
        instance.updateCustomerJDBC(customer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerJDBC method, of class CustomerORMImpl.
     */
    @Test
    public void testGetCustomerJDBC() throws Exception {
        System.out.println("getCustomerJDBC");
        String trn = "";
        CustomerORMImpl instance = new CustomerORMImpl();
        Customer expResult = null;
        Customer result = instance.getCustomerJDBC(trn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomersJDBC method, of class CustomerORMImpl.
     */
    @Test
    public void testGetAllCustomersJDBC() throws Exception {
        System.out.println("getAllCustomersJDBC");
        CustomerORMImpl instance = new CustomerORMImpl();
        List<Customer> expResult = null;
        List<Customer> result = instance.getAllCustomersJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomerJDBC method, of class CustomerORMImpl.
     */
    @Test
    public void testDeleteCustomerJDBC() throws Exception {
        System.out.println("deleteCustomerJDBC");
        String trn = "";
        CustomerORMImpl instance = new CustomerORMImpl();
        instance.deleteCustomerJDBC(trn);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
