/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.CustomerAddress;
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
public class CustomerAddressManagerTest {
    
    public CustomerAddressManagerTest() {
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
     * Test of addCustomerAddress method, of class CustomerAddressManager.
     */
    @Test
    public void testAddCustomerAddress() {
        System.out.println("addCustomerAddress");
        CustomerAddress aCustomerAddress = null;
        CustomerAddressManager instance = new CustomerAddressManager();
        instance.addCustomerAddress(aCustomerAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerAddress method, of class CustomerAddressManager.
     */
    @Test
    public void testGetCustomerAddress() {
        System.out.println("getCustomerAddress");
        int addressId = 0;
        CustomerAddressManager instance = new CustomerAddressManager();
        CustomerAddress expResult = null;
        CustomerAddress result = instance.getCustomerAddress(addressId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomerAddress method, of class CustomerAddressManager.
     */
    @Test
    public void testUpdateCustomerAddress() {
        System.out.println("updateCustomerAddress");
        CustomerAddress aCustomerAddress = null;
        CustomerAddressManager instance = new CustomerAddressManager();
        instance.updateCustomerAddress(aCustomerAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomerAddress method, of class CustomerAddressManager.
     */
    @Test
    public void testGetAllCustomerAddress() {
        System.out.println("getAllCustomerAddress");
        CustomerAddressManager instance = new CustomerAddressManager();
        List<CustomerAddress> expResult = null;
        List<CustomerAddress> result = instance.getAllCustomerAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomerAddress method, of class CustomerAddressManager.
     */
    @Test
    public void testDeleteCustomerAddress_Class_int() {
        System.out.println("deleteCustomerAddress");
        Class CustomerAddress = null;
        int addressId = 0;
        CustomerAddressManager instance = new CustomerAddressManager();
        instance.deleteCustomerAddress(CustomerAddress, addressId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomerAddressJDBC method, of class CustomerAddressManager.
     */
    @Test
    public void testAddCustomerAddressJDBC() {
        System.out.println("addCustomerAddressJDBC");
        CustomerAddress anCustomerAddress = null;
        CustomerAddressManager instance = new CustomerAddressManager();
        instance.addCustomerAddressJDBC(anCustomerAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerAddressJDBC method, of class CustomerAddressManager.
     */
    @Test
    public void testGetCustomerAddressJDBC() {
        System.out.println("getCustomerAddressJDBC");
        int addressId = 0;
        CustomerAddressManager instance = new CustomerAddressManager();
        CustomerAddress expResult = null;
        CustomerAddress result = instance.getCustomerAddressJDBC(addressId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomerAddressJDBC method, of class CustomerAddressManager.
     */
    @Test
    public void testUpdateCustomerAddressJDBC() {
        System.out.println("updateCustomerAddressJDBC");
        CustomerAddress aCustomerAddress = null;
        CustomerAddressManager instance = new CustomerAddressManager();
        instance.updateCustomerAddressJDBC(aCustomerAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomerAddressJDBC method, of class CustomerAddressManager.
     */
    @Test
    public void testGetAllCustomerAddressJDBC() {
        System.out.println("getAllCustomerAddressJDBC");
        CustomerAddressManager instance = new CustomerAddressManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllCustomerAddressJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomerAddress method, of class CustomerAddressManager.
     */
    @Test
    public void testDeleteCustomerAddress_int() {
        System.out.println("deleteCustomerAddress");
        int addressId = 0;
        CustomerAddressManager instance = new CustomerAddressManager();
        instance.deleteCustomerAddress(addressId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
