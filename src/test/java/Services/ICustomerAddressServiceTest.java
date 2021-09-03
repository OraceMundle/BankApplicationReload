/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.CustomerAddress;
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
public class ICustomerAddressServiceTest {
    
    public ICustomerAddressServiceTest() {
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
     * Test of addCustomerAddress method, of class ICustomerAddressService.
     */
    @Test
    public void testAddCustomerAddress() throws Exception {
        System.out.println("addCustomerAddress");
        CustomerAddress customerAddress = null;
        ICustomerAddressService instance = new ICustomerAddressServiceImpl();
        instance.addCustomerAddress(customerAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomerAddress method, of class ICustomerAddressService.
     */
    @Test
    public void testUpdateCustomerAddress() throws Exception {
        System.out.println("updateCustomerAddress");
        CustomerAddress customerAddress = null;
        ICustomerAddressService instance = new ICustomerAddressServiceImpl();
        instance.updateCustomerAddress(customerAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerAddress method, of class ICustomerAddressService.
     */
    @Test
    public void testGetCustomerAddress() throws Exception {
        System.out.println("getCustomerAddress");
        int addressId = 0;
        ICustomerAddressService instance = new ICustomerAddressServiceImpl();
        CustomerAddress expResult = null;
        CustomerAddress result = instance.getCustomerAddress(addressId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomerAddresses method, of class ICustomerAddressService.
     */
    @Test
    public void testGetAllCustomerAddresses() throws Exception {
        System.out.println("getAllCustomerAddresses");
        ICustomerAddressService instance = new ICustomerAddressServiceImpl();
        List<CustomerAddress> expResult = null;
        List<CustomerAddress> result = instance.getAllCustomerAddresses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomerAddress method, of class ICustomerAddressService.
     */
    @Test
    public void testDeleteCustomerAddress() throws Exception {
        System.out.println("deleteCustomerAddress");
        Class CustomerAddress = null;
        int addressId = 0;
        ICustomerAddressService instance = new ICustomerAddressServiceImpl();
        instance.deleteCustomerAddress(CustomerAddress, addressId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomerAddressJDBC method, of class ICustomerAddressService.
     */
    @Test
    public void testAddCustomerAddressJDBC() throws Exception {
        System.out.println("addCustomerAddressJDBC");
        CustomerAddress customerAddress = null;
        ICustomerAddressService instance = new ICustomerAddressServiceImpl();
        instance.addCustomerAddressJDBC(customerAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomerAddressJDBC method, of class ICustomerAddressService.
     */
    @Test
    public void testUpdateCustomerAddressJDBC() throws Exception {
        System.out.println("updateCustomerAddressJDBC");
        CustomerAddress customerAddress = null;
        ICustomerAddressService instance = new ICustomerAddressServiceImpl();
        instance.updateCustomerAddressJDBC(customerAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerAddressJDBC method, of class ICustomerAddressService.
     */
    @Test
    public void testGetCustomerAddressJDBC() throws Exception {
        System.out.println("getCustomerAddressJDBC");
        int addressId = 0;
        ICustomerAddressService instance = new ICustomerAddressServiceImpl();
        CustomerAddress expResult = null;
        CustomerAddress result = instance.getCustomerAddressJDBC(addressId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomerAddressesJDBC method, of class ICustomerAddressService.
     */
    @Test
    public void testGetAllCustomerAddressesJDBC() throws Exception {
        System.out.println("getAllCustomerAddressesJDBC");
        ICustomerAddressService instance = new ICustomerAddressServiceImpl();
        List<CustomerAddress> expResult = null;
        List<CustomerAddress> result = instance.getAllCustomerAddressesJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomerAddressJDBC method, of class ICustomerAddressService.
     */
    @Test
    public void testDeleteCustomerAddressJDBC() throws Exception {
        System.out.println("deleteCustomerAddressJDBC");
        int addressId = 0;
        ICustomerAddressService instance = new ICustomerAddressServiceImpl();
        instance.deleteCustomerAddressJDBC(addressId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICustomerAddressServiceImpl implements ICustomerAddressService {

        public void addCustomerAddress(CustomerAddress customerAddress) throws Exception {
        }

        public void updateCustomerAddress(CustomerAddress customerAddress) throws Exception {
        }

        public CustomerAddress getCustomerAddress(int addressId) throws Exception {
            return null;
        }

        public List<CustomerAddress> getAllCustomerAddresses() throws Exception {
            return null;
        }

        public void deleteCustomerAddress(Class<?> CustomerAddress, int addressId) throws Exception {
        }

        public void addCustomerAddressJDBC(CustomerAddress customerAddress) throws Exception {
        }

        public void updateCustomerAddressJDBC(CustomerAddress customerAddress) throws Exception {
        }

        public CustomerAddress getCustomerAddressJDBC(int addressId) throws Exception {
            return null;
        }

        public List<CustomerAddress> getAllCustomerAddressesJDBC() throws Exception {
            return null;
        }

        public void deleteCustomerAddressJDBC(int addressId) throws Exception {
        }
    }
    
}
