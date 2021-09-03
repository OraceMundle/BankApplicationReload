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
public class CustomerAddressTest {
    
    public CustomerAddressTest() {
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
     * Test of getAddressId method, of class CustomerAddress.
     */
    @Test
    public void testGetAddressId() {
        System.out.println("getAddressId");
        CustomerAddress instance = new CustomerAddress();
        int expResult = 0;
        int result = instance.getAddressId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStreet method, of class CustomerAddress.
     */
    @Test
    public void testGetStreet() {
        System.out.println("getStreet");
        CustomerAddress instance = new CustomerAddress();
        String expResult = "";
        String result = instance.getStreet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCommunity method, of class CustomerAddress.
     */
    @Test
    public void testGetCommunity() {
        System.out.println("getCommunity");
        CustomerAddress instance = new CustomerAddress();
        String expResult = "";
        String result = instance.getCommunity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class CustomerAddress.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        CustomerAddress instance = new CustomerAddress();
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddressId method, of class CustomerAddress.
     */
    @Test
    public void testSetAddressId() {
        System.out.println("setAddressId");
        int addressId = 0;
        CustomerAddress instance = new CustomerAddress();
        instance.setAddressId(addressId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStreet method, of class CustomerAddress.
     */
    @Test
    public void testSetStreet() {
        System.out.println("setStreet");
        String street = "";
        CustomerAddress instance = new CustomerAddress();
        instance.setStreet(street);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCommunity method, of class CustomerAddress.
     */
    @Test
    public void testSetCommunity() {
        System.out.println("setCommunity");
        String community = "";
        CustomerAddress instance = new CustomerAddress();
        instance.setCommunity(community);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCountry method, of class CustomerAddress.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        CustomerAddress instance = new CustomerAddress();
        instance.setCountry(country);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
