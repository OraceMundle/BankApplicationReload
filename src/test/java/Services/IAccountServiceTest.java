/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Account;
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
public class IAccountServiceTest {
    
    public IAccountServiceTest() {
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
     * Test of addAccount method, of class IAccountService.
     */
    @Test
    public void testAddAccount() throws Exception {
        System.out.println("addAccount");
        Account account = null;
        IAccountService instance = new IAccountServiceImpl();
        instance.addAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccount method, of class IAccountService.
     */
    @Test
    public void testUpdateAccount() throws Exception {
        System.out.println("updateAccount");
        Account account = null;
        IAccountService instance = new IAccountServiceImpl();
        instance.updateAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount method, of class IAccountService.
     */
    @Test
    public void testGetAccount() throws Exception {
        System.out.println("getAccount");
        int accountnumber = 0;
        IAccountService instance = new IAccountServiceImpl();
        Account expResult = null;
        Account result = instance.getAccount(accountnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccount method, of class IAccountService.
     */
    @Test
    public void testGetAllAccount() throws Exception {
        System.out.println("getAllAccount");
        IAccountService instance = new IAccountServiceImpl();
        List<Account> expResult = null;
        List<Account> result = instance.getAllAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class IAccountService.
     */
    @Test
    public void testDeleteAccount() throws Exception {
        System.out.println("deleteAccount");
        Class Account = null;
        int accountnumber = 0;
        IAccountService instance = new IAccountServiceImpl();
        instance.deleteAccount(Account, accountnumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccountJDBC method, of class IAccountService.
     */
    @Test
    public void testAddAccountJDBC() throws Exception {
        System.out.println("addAccountJDBC");
        Account account = null;
        IAccountService instance = new IAccountServiceImpl();
        instance.addAccountJDBC(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccountJDBC method, of class IAccountService.
     */
    @Test
    public void testUpdateAccountJDBC() throws Exception {
        System.out.println("updateAccountJDBC");
        Account account = null;
        IAccountService instance = new IAccountServiceImpl();
        instance.updateAccountJDBC(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountJDBC method, of class IAccountService.
     */
    @Test
    public void testGetAccountJDBC() throws Exception {
        System.out.println("getAccountJDBC");
        int accountnumber = 0;
        IAccountService instance = new IAccountServiceImpl();
        Account expResult = null;
        Account result = instance.getAccountJDBC(accountnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccountJDBC method, of class IAccountService.
     */
    @Test
    public void testGetAllAccountJDBC() throws Exception {
        System.out.println("getAllAccountJDBC");
        IAccountService instance = new IAccountServiceImpl();
        ResultSet expResult = null;
        ResultSet result = instance.getAllAccountJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccountJDBC method, of class IAccountService.
     */
    @Test
    public void testDeleteAccountJDBC() throws Exception {
        System.out.println("deleteAccountJDBC");
        int accountnumber = 0;
        IAccountService instance = new IAccountServiceImpl();
        instance.deleteAccountJDBC(accountnumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IAccountServiceImpl implements IAccountService {

        public void addAccount(Account account) throws Exception {
        }

        public void updateAccount(Account account) throws Exception {
        }

        public Account getAccount(int accountnumber) throws Exception {
            return null;
        }

        public List<Account> getAllAccount() throws Exception {
            return null;
        }

        public void deleteAccount(Class<?> Account, int accountnumber) throws Exception {
        }

        public void addAccountJDBC(Account account) throws Exception {
        }

        public void updateAccountJDBC(Account account) throws Exception {
        }

        public Account getAccountJDBC(int accountnumber) throws Exception {
            return null;
        }

        public ResultSet getAllAccountJDBC() throws Exception {
            return null;
        }

        public void deleteAccountJDBC(int accountnumber) throws Exception {
        }
    }
    
}
