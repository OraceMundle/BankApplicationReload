/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.WorkerLog;
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
public class WorkerLogManagerTest {
    
    public WorkerLogManagerTest() {
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
     * Test of addWorkerLog method, of class WorkerLogManager.
     */
    @Test
    public void testAddWorkerLog() {
        System.out.println("addWorkerLog");
        WorkerLog aWorkerLog = null;
        WorkerLogManager instance = new WorkerLogManager();
        instance.addWorkerLog(aWorkerLog);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkerLog method, of class WorkerLogManager.
     */
    @Test
    public void testGetWorkerLog() {
        System.out.println("getWorkerLog");
        int id = 0;
        WorkerLogManager instance = new WorkerLogManager();
        WorkerLog expResult = null;
        WorkerLog result = instance.getWorkerLog(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorkerLog method, of class WorkerLogManager.
     */
    @Test
    public void testUpdateWorkerLog() {
        System.out.println("updateWorkerLog");
        WorkerLog aWorkerLog = null;
        WorkerLogManager instance = new WorkerLogManager();
        instance.updateWorkerLog(aWorkerLog);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorkerLog method, of class WorkerLogManager.
     */
    @Test
    public void testGetAllWorkerLog() {
        System.out.println("getAllWorkerLog");
        WorkerLogManager instance = new WorkerLogManager();
        List<WorkerLog> expResult = null;
        List<WorkerLog> result = instance.getAllWorkerLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorkerLog method, of class WorkerLogManager.
     */
    @Test
    public void testDeleteWorkerLog() {
        System.out.println("deleteWorkerLog");
        Class WorkerLog = null;
        int id = 0;
        WorkerLogManager instance = new WorkerLogManager();
        instance.deleteWorkerLog(WorkerLog, id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addWorkerLogJDBC method, of class WorkerLogManager.
     */
    @Test
    public void testAddWorkerLogJDBC() {
        System.out.println("addWorkerLogJDBC");
        WorkerLog anWorkerLog = null;
        WorkerLogManager instance = new WorkerLogManager();
        instance.addWorkerLogJDBC(anWorkerLog);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkerLogJDBC method, of class WorkerLogManager.
     */
    @Test
    public void testGetWorkerLogJDBC() {
        System.out.println("getWorkerLogJDBC");
        int id = 0;
        WorkerLogManager instance = new WorkerLogManager();
        WorkerLog expResult = null;
        WorkerLog result = instance.getWorkerLogJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorkerLogJDBC method, of class WorkerLogManager.
     */
    @Test
    public void testUpdateWorkerLogJDBC() {
        System.out.println("updateWorkerLogJDBC");
        WorkerLog aWorkerLog = null;
        WorkerLogManager instance = new WorkerLogManager();
        instance.updateWorkerLogJDBC(aWorkerLog);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorkerLogJDBC method, of class WorkerLogManager.
     */
    @Test
    public void testGetAllWorkerLogJDBC() {
        System.out.println("getAllWorkerLogJDBC");
        WorkerLogManager instance = new WorkerLogManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllWorkerLogJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorkerLogJDBC method, of class WorkerLogManager.
     */
    @Test
    public void testDeleteWorkerLogJDBC() {
        System.out.println("deleteWorkerLogJDBC");
        int id = 0;
        WorkerLogManager instance = new WorkerLogManager();
        instance.deleteWorkerLogJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
