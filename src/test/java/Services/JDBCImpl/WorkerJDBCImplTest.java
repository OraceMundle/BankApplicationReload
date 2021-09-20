/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

import Domain.Worker;
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
public class WorkerJDBCImplTest {
    
    public WorkerJDBCImplTest() {
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
     * Test of addWorker method, of class WorkerJDBCImpl.
     */
    @Test
    public void testAddWorker() throws Exception {
        System.out.println("addWorker");
        Worker worker = null;
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        instance.addWorker(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorker method, of class WorkerJDBCImpl.
     */
    @Test
    public void testUpdateWorker() throws Exception {
        System.out.println("updateWorker");
        Worker worker = null;
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        instance.updateWorker(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorker method, of class WorkerJDBCImpl.
     */
    @Test
    public void testGetWorker() throws Exception {
        System.out.println("getWorker");
        int id = 0;
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        Worker expResult = null;
        Worker result = instance.getWorker(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorker method, of class WorkerJDBCImpl.
     */
    @Test
    public void testGetAllWorker() throws Exception {
        System.out.println("getAllWorker");
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        List<Worker> expResult = null;
        List<Worker> result = instance.getAllWorker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorker method, of class WorkerJDBCImpl.
     */
    @Test
    public void testDeleteWorker() throws Exception {
        System.out.println("deleteWorker");
        Class Worker = null;
        int id = 0;
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        instance.deleteWorker(Worker, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWorkerJDBC method, of class WorkerJDBCImpl.
     */
    @Test
    public void testAddWorkerJDBC() throws Exception {
        System.out.println("addWorkerJDBC");
        Worker worker = null;
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        instance.addWorkerJDBC(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorkerJDBC method, of class WorkerJDBCImpl.
     */
    @Test
    public void testUpdateWorkerJDBC() throws Exception {
        System.out.println("updateWorkerJDBC");
        Worker worker = null;
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        instance.updateWorkerJDBC(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkerJDBC method, of class WorkerJDBCImpl.
     */
    @Test
    public void testGetWorkerJDBC() throws Exception {
        System.out.println("getWorkerJDBC");
        int id = 0;
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        Worker expResult = null;
        Worker result = instance.getWorkerJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorkerJDBC method, of class WorkerJDBCImpl.
     */
    @Test
    public void testGetAllWorkerJDBC() throws Exception {
        System.out.println("getAllWorkerJDBC");
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        ResultSet expResult = null;
        ResultSet result = instance.getAllWorkerJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorkerJDBC method, of class WorkerJDBCImpl.
     */
    @Test
    public void testDeleteWorkerJDBC() throws Exception {
        System.out.println("deleteWorkerJDBC");
        int id = 0;
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        instance.deleteWorkerJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getworkerLoginJDBC method, of class WorkerJDBCImpl.
     */
    @Test
    public void testGetworkerLoginJDBC() throws Exception {
        System.out.println("getworkerLoginJDBC");
        Worker user = null;
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        Worker expResult = null;
        Worker result = instance.getworkerLoginJDBC(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getworkerLogin method, of class WorkerJDBCImpl.
     */
    @Test
    public void testGetworkerLogin() throws Exception {
        System.out.println("getworkerLogin");
        Worker user = null;
        WorkerJDBCImpl instance = new WorkerJDBCImpl();
        Worker expResult = null;
        Worker result = instance.getworkerLogin(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
