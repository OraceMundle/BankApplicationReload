/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.TransactionCal;
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
public class ITransactionCalServiceTest {
    
    public ITransactionCalServiceTest() {
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
     * Test of addTransaction method, of class ITransactionCalService.
     */
    @Test
    public void testAddTransaction() throws Exception {
        System.out.println("addTransaction");
        TransactionCal transaction = null;
        ITransactionCalService instance = new ITransactionCalServiceImpl();
        instance.addTransaction(transaction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTransaction method, of class ITransactionCalService.
     */
    @Test
    public void testUpdateTransaction() throws Exception {
        System.out.println("updateTransaction");
        TransactionCal transaction = null;
        ITransactionCalService instance = new ITransactionCalServiceImpl();
        instance.updateTransaction(transaction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransaction method, of class ITransactionCalService.
     */
    @Test
    public void testGetTransaction() throws Exception {
        System.out.println("getTransaction");
        int transactionId = 0;
        ITransactionCalService instance = new ITransactionCalServiceImpl();
        TransactionCal expResult = null;
        TransactionCal result = instance.getTransaction(transactionId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTransactions method, of class ITransactionCalService.
     */
    @Test
    public void testGetAllTransactions() throws Exception {
        System.out.println("getAllTransactions");
        ITransactionCalService instance = new ITransactionCalServiceImpl();
        List<TransactionCal> expResult = null;
        List<TransactionCal> result = instance.getAllTransactions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTransaction method, of class ITransactionCalService.
     */
    @Test
    public void testDeleteTransaction() throws Exception {
        System.out.println("deleteTransaction");
        Class Transaction = null;
        int transactionId = 0;
        ITransactionCalService instance = new ITransactionCalServiceImpl();
        instance.deleteTransaction(Transaction, transactionId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTransactionJDBC method, of class ITransactionCalService.
     */
    @Test
    public void testAddTransactionJDBC() throws Exception {
        System.out.println("addTransactionJDBC");
        TransactionCal transaction = null;
        ITransactionCalService instance = new ITransactionCalServiceImpl();
        instance.addTransactionJDBC(transaction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTransactionJDBC method, of class ITransactionCalService.
     */
    @Test
    public void testUpdateTransactionJDBC() throws Exception {
        System.out.println("updateTransactionJDBC");
        TransactionCal transaction = null;
        ITransactionCalService instance = new ITransactionCalServiceImpl();
        instance.updateTransactionJDBC(transaction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionJDBC method, of class ITransactionCalService.
     */
    @Test
    public void testGetTransactionJDBC() throws Exception {
        System.out.println("getTransactionJDBC");
        int transactionId = 0;
        ITransactionCalService instance = new ITransactionCalServiceImpl();
        TransactionCal expResult = null;
        TransactionCal result = instance.getTransactionJDBC(transactionId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTransactionsJDBC method, of class ITransactionCalService.
     */
    @Test
    public void testGetAllTransactionsJDBC() throws Exception {
        System.out.println("getAllTransactionsJDBC");
        ITransactionCalService instance = new ITransactionCalServiceImpl();
        ResultSet expResult = null;
        ResultSet result = instance.getAllTransactionsJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTransactionJDBC method, of class ITransactionCalService.
     */
    @Test
    public void testDeleteTransactionJDBC() throws Exception {
        System.out.println("deleteTransactionJDBC");
        int transactionId = 0;
        ITransactionCalService instance = new ITransactionCalServiceImpl();
        instance.deleteTransactionJDBC(transactionId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ITransactionCalServiceImpl implements ITransactionCalService {

        public void addTransaction(TransactionCal transaction) throws Exception {
        }

        public void updateTransaction(TransactionCal transaction) throws Exception {
        }

        public TransactionCal getTransaction(int transactionId) throws Exception {
            return null;
        }

        public List<TransactionCal> getAllTransactions() throws Exception {
            return null;
        }

        public void deleteTransaction(Class<?> Transaction, int transactionId) throws Exception {
        }

        public void addTransactionJDBC(TransactionCal transaction) throws Exception {
        }

        public void updateTransactionJDBC(TransactionCal transaction) throws Exception {
        }

        public TransactionCal getTransactionJDBC(int transactionId) throws Exception {
            return null;
        }

        public ResultSet getAllTransactionsJDBC() throws Exception {
            return null;
        }

        public void deleteTransactionJDBC(int transactionId) throws Exception {
        }
    }
    
}
