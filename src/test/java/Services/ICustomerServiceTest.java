/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

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
public class ICustomerServiceTest {
    
    public ICustomerServiceTest() {
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
     * Test of addCustomer method, of class ICustomerService.
     */
    @Test
    public void testAddCustomer() throws Exception {
        System.out.println("addCustomer");
        Customer customer = null;
        ICustomerService instance = new ICustomerServiceImpl();
        instance.addCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomer method, of class ICustomerService.
     */
    @Test
    public void testUpdateCustomer() throws Exception {
        System.out.println("updateCustomer");
        Customer customer = null;
        ICustomerService instance = new ICustomerServiceImpl();
        instance.updateCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class ICustomerService.
     */
    @Test
    public void testGetCustomer() throws Exception {
        System.out.println("getCustomer");
        String trn = "";
        ICustomerService instance = new ICustomerServiceImpl();
        Customer expResult = null;
        Customer result = instance.getCustomer(trn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomers method, of class ICustomerService.
     */
    @Test
    public void testGetAllCustomers() throws Exception {
        System.out.println("getAllCustomers");
        ICustomerService instance = new ICustomerServiceImpl();
        List<Customer> expResult = null;
        List<Customer> result = instance.getAllCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class ICustomerService.
     */
    @Test
    public void testDeleteCustomer() throws Exception {
        System.out.println("deleteCustomer");
        Class Customer = null;
        String trn = "";
        ICustomerService instance = new ICustomerServiceImpl();
        instance.deleteCustomer(Customer, trn);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomerJDBC method, of class ICustomerService.
     */
    @Test
    public void testAddCustomerJDBC() throws Exception {
        System.out.println("addCustomerJDBC");
        Customer customer = null;
        ICustomerService instance = new ICustomerServiceImpl();
        instance.addCustomerJDBC(customer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomerJDBC method, of class ICustomerService.
     */
    @Test
    public void testUpdateCustomerJDBC() throws Exception {
        System.out.println("updateCustomerJDBC");
        Customer customer = null;
        ICustomerService instance = new ICustomerServiceImpl();
        instance.updateCustomerJDBC(customer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerJDBC method, of class ICustomerService.
     */
    @Test
    public void testGetCustomerJDBC() throws Exception {
        System.out.println("getCustomerJDBC");
        String trn = "";
        ICustomerService instance = new ICustomerServiceImpl();
        Customer expResult = null;
        Customer result = instance.getCustomerJDBC(trn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomersJDBC method, of class ICustomerService.
     */
    @Test
    public void testGetAllCustomersJDBC() throws Exception {
        System.out.println("getAllCustomersJDBC");
        ICustomerService instance = new ICustomerServiceImpl();
        List<Customer> expResult = null;
        List<Customer> result = instance.getAllCustomersJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomerJDBC method, of class ICustomerService.
     */
    @Test
    public void testDeleteCustomerJDBC() throws Exception {
        System.out.println("deleteCustomerJDBC");
        String trn = "";
        ICustomerService instance = new ICustomerServiceImpl();
        instance.deleteCustomerJDBC(trn);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class ICustomerServiceImpl implements ICustomerService {

        public void addCustomer(Customer customer) throws Exception {
        }

        public void updateCustomer(Customer customer) throws Exception {
        }

        public Customer getCustomer(String trn) throws Exception {
            return null;
        }

        public List<Customer> getAllCustomers() throws Exception {
            return null;
        }

        public void deleteCustomer(Class<?> Customer, String trn) throws Exception {
        }

        public void addCustomerJDBC(Customer customer) throws Exception {
        }

        public void updateCustomerJDBC(Customer customer) throws Exception {
        }

        public Customer getCustomerJDBC(String trn) throws Exception {
            return null;
        }

        public List<Customer> getAllCustomersJDBC() throws Exception {
            return null;
        }

        public void deleteCustomerJDBC(String trn) throws Exception {
        }

        @Override
        public Customer getCustomerLogin(Customer user) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Customer getCustomerLoginJDBC(Customer user) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
