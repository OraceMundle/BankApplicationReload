/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

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
public class AccountJDBCImplTest {
    
    public AccountJDBCImplTest() {
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
     * Test of addAccount method, of class AccountJDBCImpl.
     */
    @Test
    public void testAddAccount() throws Exception {
        System.out.println("addAccount");
        Account account = null;
        AccountJDBCImpl instance = new AccountJDBCImpl();
        instance.addAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccount method, of class AccountJDBCImpl.
     */
    @Test
    public void testUpdateAccount() throws Exception {
        System.out.println("updateAccount");
        Account account = null;
        AccountJDBCImpl instance = new AccountJDBCImpl();
        instance.updateAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount method, of class AccountJDBCImpl.
     */
    @Test
    public void testGetAccount() throws Exception {
        System.out.println("getAccount");
        int accountnumber = 0;
        AccountJDBCImpl instance = new AccountJDBCImpl();
        Account expResult = null;
        Account result = instance.getAccount(accountnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccount method, of class AccountJDBCImpl.
     */
    @Test
    public void testGetAllAccount() throws Exception {
        System.out.println("getAllAccount");
        AccountJDBCImpl instance = new AccountJDBCImpl();
        List<Account> expResult = null;
        List<Account> result = instance.getAllAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class AccountJDBCImpl.
     */
    @Test
    public void testDeleteAccount() throws Exception {
        System.out.println("deleteAccount");
        Class Account = null;
        int accountnumber = 0;
        AccountJDBCImpl instance = new AccountJDBCImpl();
        instance.deleteAccount(Account, accountnumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccountJDBC method, of class AccountJDBCImpl.
     */
    @Test
    public void testAddAccountJDBC() throws Exception {
        System.out.println("addAccountJDBC");
        Account account = null;
        AccountJDBCImpl instance = new AccountJDBCImpl();
        instance.addAccountJDBC(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccountJDBC method, of class AccountJDBCImpl.
     */
    @Test
    public void testUpdateAccountJDBC() throws Exception {
        System.out.println("updateAccountJDBC");
        Account account = null;
        AccountJDBCImpl instance = new AccountJDBCImpl();
        instance.updateAccountJDBC(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountJDBC method, of class AccountJDBCImpl.
     */
    @Test
    public void testGetAccountJDBC() throws Exception {
        System.out.println("getAccountJDBC");
        int accountnumber = 0;
        AccountJDBCImpl instance = new AccountJDBCImpl();
        Account expResult = null;
        Account result = instance.getAccountJDBC(accountnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccountJDBC method, of class AccountJDBCImpl.
     */
    @Test
    public void testGetAllAccountJDBC() throws Exception {
        System.out.println("getAllAccountJDBC");
        AccountJDBCImpl instance = new AccountJDBCImpl();
        ResultSet expResult = null;
        ResultSet result = instance.getAllAccountJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccountJDBC method, of class AccountJDBCImpl.
     */
    @Test
    public void testDeleteAccountJDBC() throws Exception {
        System.out.println("deleteAccountJDBC");
        int accountnumber = 0;
        AccountJDBCImpl instance = new AccountJDBCImpl();
        instance.deleteAccountJDBC(accountnumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
