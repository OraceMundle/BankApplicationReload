/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.HibernateImplement;

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
public class AccountORMImplTest {
    
    public AccountORMImplTest() {
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
     * Test of addAccount method, of class AccountORMImpl.
     */
    @Test
    public void testAddAccount() throws Exception {
        System.out.println("addAccount");
        Account account = null;
        AccountORMImpl instance = new AccountORMImpl();
        instance.addAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccount method, of class AccountORMImpl.
     */
    @Test
    public void testUpdateAccount() throws Exception {
        System.out.println("updateAccount");
        Account account = null;
        AccountORMImpl instance = new AccountORMImpl();
        instance.updateAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount method, of class AccountORMImpl.
     */
    @Test
    public void testGetAccount() throws Exception {
        System.out.println("getAccount");
        String accountnumber = "";
        AccountORMImpl instance = new AccountORMImpl();
        Account expResult = null;
        Account result = instance.getAccount(accountnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccount method, of class AccountORMImpl.
     */
    @Test
    public void testGetAllAccount() throws Exception {
        System.out.println("getAllAccount");
        AccountORMImpl instance = new AccountORMImpl();
        List<Account> expResult = null;
        List<Account> result = instance.getAllAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class AccountORMImpl.
     */
    @Test
    public void testDeleteAccount() throws Exception {
        System.out.println("deleteAccount");
        Class Account = null;
        String accountnumber = "";
        AccountORMImpl instance = new AccountORMImpl();
        instance.deleteAccount(Account, accountnumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccountJDBC method, of class AccountORMImpl.
     */
    @Test
    public void testAddAccountJDBC() throws Exception {
        System.out.println("addAccountJDBC");
        Account account = null;
        AccountORMImpl instance = new AccountORMImpl();
        instance.addAccountJDBC(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccountJDBC method, of class AccountORMImpl.
     */
    @Test
    public void testUpdateAccountJDBC() throws Exception {
        System.out.println("updateAccountJDBC");
        Account account = null;
        AccountORMImpl instance = new AccountORMImpl();
        instance.updateAccountJDBC(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountJDBC method, of class AccountORMImpl.
     */
    @Test
    public void testGetAccountJDBC() throws Exception {
        System.out.println("getAccountJDBC");
        String accountnumber = "";
        AccountORMImpl instance = new AccountORMImpl();
        Account expResult = null;
        Account result = instance.getAccountJDBC(accountnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccountJDBC method, of class AccountORMImpl.
     */
    @Test
    public void testGetAllAccountJDBC() throws Exception {
        System.out.println("getAllAccountJDBC");
        AccountORMImpl instance = new AccountORMImpl();
        ResultSet expResult = null;
        ResultSet result = instance.getAllAccountJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccountJDBC method, of class AccountORMImpl.
     */
    @Test
    public void testDeleteAccountJDBC() throws Exception {
        System.out.println("deleteAccountJDBC");
        String accountnumber = "";
        AccountORMImpl instance = new AccountORMImpl();
        instance.deleteAccountJDBC(accountnumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
