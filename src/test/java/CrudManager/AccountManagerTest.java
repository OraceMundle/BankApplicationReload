/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

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
public class AccountManagerTest {
    
    public AccountManagerTest() {
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
     * Test of addAccount method, of class AccountManager.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        Account aAccount = null;
        AccountManager instance = new AccountManager();
        instance.addAccount(aAccount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount method, of class AccountManager.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        int accountNumber = 0;
        AccountManager instance = new AccountManager();
        Account expResult = null;
        Account result = instance.getAccount(accountNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccount method, of class AccountManager.
     */
    @Test
    public void testUpdateAccount() {
        System.out.println("updateAccount");
        Account aAccount = null;
        AccountManager instance = new AccountManager();
        instance.updateAccount(aAccount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccount method, of class AccountManager.
     */
    @Test
    public void testGetAllAccount() {
        System.out.println("getAllAccount");
        AccountManager instance = new AccountManager();
        List<Account> expResult = null;
        List<Account> result = instance.getAllAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class AccountManager.
     */
    @Test
    public void testDeleteAccount_Class_int() {
        System.out.println("deleteAccount");
        Class Account = null;
        int accountNumber = 0;
        AccountManager instance = new AccountManager();
        instance.deleteAccount(Account, accountNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccountJDBC method, of class AccountManager.
     */
    @Test
    public void testAddAccountJDBC() {
        System.out.println("addAccountJDBC");
        Account anAccount = null;
        AccountManager instance = new AccountManager();
        instance.addAccountJDBC(anAccount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountJDBC method, of class AccountManager.
     */
    @Test
    public void testGetAccountJDBC() {
        System.out.println("getAccountJDBC");
        int accountNumber = 0;
        AccountManager instance = new AccountManager();
        Account expResult = null;
        Account result = instance.getAccountJDBC(accountNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccountJDBC method, of class AccountManager.
     */
    @Test
    public void testUpdateAccountJDBC() {
        System.out.println("updateAccountJDBC");
        Account aAccount = null;
        AccountManager instance = new AccountManager();
        instance.updateAccountJDBC(aAccount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccountJDBC method, of class AccountManager.
     */
    @Test
    public void testGetAllAccountJDBC() {
        System.out.println("getAllAccountJDBC");
        AccountManager instance = new AccountManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllAccountJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class AccountManager.
     */
    @Test
    public void testDeleteAccount_int() {
        System.out.println("deleteAccount");
        int accountNumber = 0;
        AccountManager instance = new AccountManager();
        instance.deleteAccount(accountNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
