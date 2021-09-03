/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

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
public class WorkerManagerTest {
    
    public WorkerManagerTest() {
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
     * Test of addWorker method, of class WorkerManager.
     */
    @Test
    public void testAddWorker() {
        System.out.println("addWorker");
        Worker aWorker = null;
        WorkerManager instance = new WorkerManager();
        instance.addWorker(aWorker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorker method, of class WorkerManager.
     */
    @Test
    public void testGetWorker() {
        System.out.println("getWorker");
        String trn = "";
        WorkerManager instance = new WorkerManager();
        Worker expResult = null;
        Worker result = instance.getWorker(trn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorker method, of class WorkerManager.
     */
    @Test
    public void testUpdateWorker() {
        System.out.println("updateWorker");
        Worker aWorker = null;
        WorkerManager instance = new WorkerManager();
        instance.updateWorker(aWorker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorker method, of class WorkerManager.
     */
    @Test
    public void testGetAllWorker() {
        System.out.println("getAllWorker");
        WorkerManager instance = new WorkerManager();
        List<Worker> expResult = null;
        List<Worker> result = instance.getAllWorker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorker method, of class WorkerManager.
     */
    @Test
    public void testDeleteWorker() {
        System.out.println("deleteWorker");
        Class Worker = null;
        String trn = "";
        WorkerManager instance = new WorkerManager();
        instance.deleteWorker(Worker, trn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWorkerJDBC method, of class WorkerManager.
     */
    @Test
    public void testAddWorkerJDBC() {
        System.out.println("addWorkerJDBC");
        Worker anWorker = null;
        WorkerManager instance = new WorkerManager();
        instance.addWorkerJDBC(anWorker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkerJDBC method, of class WorkerManager.
     */
    @Test
    public void testGetWorkerJDBC() {
        System.out.println("getWorkerJDBC");
        String id = "";
        WorkerManager instance = new WorkerManager();
        Worker expResult = null;
        Worker result = instance.getWorkerJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorkerJDBC method, of class WorkerManager.
     */
    @Test
    public void testUpdateWorkerJDBC() {
        System.out.println("updateWorkerJDBC");
        Worker aWorker = null;
        WorkerManager instance = new WorkerManager();
        instance.updateWorkerJDBC(aWorker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorkerJDBC method, of class WorkerManager.
     */
    @Test
    public void testGetAllWorkerJDBC() {
        System.out.println("getAllWorkerJDBC");
        WorkerManager instance = new WorkerManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllWorkerJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorkerJDBC method, of class WorkerManager.
     */
    @Test
    public void testDeleteWorkerJDBC() {
        System.out.println("deleteWorkerJDBC");
        String id = "";
        WorkerManager instance = new WorkerManager();
        instance.deleteWorkerJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
