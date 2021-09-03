/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

import Domain.WorkerLog;
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
public class WorkerLogJDBCImplTest {
    
    public WorkerLogJDBCImplTest() {
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
     * Test of addWorkerLog method, of class WorkerLogJDBCImpl.
     */
    @Test
    public void testAddWorkerLog() throws Exception {
        System.out.println("addWorkerLog");
        WorkerLog workerLog = null;
        WorkerLogJDBCImpl instance = new WorkerLogJDBCImpl();
        instance.addWorkerLog(workerLog);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorkerLog method, of class WorkerLogJDBCImpl.
     */
    @Test
    public void testUpdateWorkerLog() throws Exception {
        System.out.println("updateWorkerLog");
        WorkerLog workerLog = null;
        WorkerLogJDBCImpl instance = new WorkerLogJDBCImpl();
        instance.updateWorkerLog(workerLog);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkerLog method, of class WorkerLogJDBCImpl.
     */
    @Test
    public void testGetWorkerLog() throws Exception {
        System.out.println("getWorkerLog");
        int id = 0;
        WorkerLogJDBCImpl instance = new WorkerLogJDBCImpl();
        WorkerLog expResult = null;
        WorkerLog result = instance.getWorkerLog(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorkerLog method, of class WorkerLogJDBCImpl.
     */
    @Test
    public void testGetAllWorkerLog() throws Exception {
        System.out.println("getAllWorkerLog");
        WorkerLogJDBCImpl instance = new WorkerLogJDBCImpl();
        List<WorkerLog> expResult = null;
        List<WorkerLog> result = instance.getAllWorkerLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorkLog method, of class WorkerLogJDBCImpl.
     */
    @Test
    public void testDeleteWorkLog() throws Exception {
        System.out.println("deleteWorkLog");
        Class WorkerLog = null;
        int id = 0;
        WorkerLogJDBCImpl instance = new WorkerLogJDBCImpl();
        instance.deleteWorkLog(WorkerLog, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWorkerLogJDBC method, of class WorkerLogJDBCImpl.
     */
    @Test
    public void testAddWorkerLogJDBC() throws Exception {
        System.out.println("addWorkerLogJDBC");
        WorkerLog workerLog = null;
        WorkerLogJDBCImpl instance = new WorkerLogJDBCImpl();
        instance.addWorkerLogJDBC(workerLog);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorkerLogJDBC method, of class WorkerLogJDBCImpl.
     */
    @Test
    public void testUpdateWorkerLogJDBC() throws Exception {
        System.out.println("updateWorkerLogJDBC");
        WorkerLog workerLog = null;
        WorkerLogJDBCImpl instance = new WorkerLogJDBCImpl();
        instance.updateWorkerLogJDBC(workerLog);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkerLogJDBC method, of class WorkerLogJDBCImpl.
     */
    @Test
    public void testGetWorkerLogJDBC() throws Exception {
        System.out.println("getWorkerLogJDBC");
        int id = 0;
        WorkerLogJDBCImpl instance = new WorkerLogJDBCImpl();
        WorkerLog expResult = null;
        WorkerLog result = instance.getWorkerLogJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorkerLogJDBC method, of class WorkerLogJDBCImpl.
     */
    @Test
    public void testGetAllWorkerLogJDBC() throws Exception {
        System.out.println("getAllWorkerLogJDBC");
        WorkerLogJDBCImpl instance = new WorkerLogJDBCImpl();
        List<WorkerLog> expResult = null;
        List<WorkerLog> result = instance.getAllWorkerLogJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorkLogJDBC method, of class WorkerLogJDBCImpl.
     */
    @Test
    public void testDeleteWorkLogJDBC() throws Exception {
        System.out.println("deleteWorkLogJDBC");
        int id = 0;
        WorkerLogJDBCImpl instance = new WorkerLogJDBCImpl();
        instance.deleteWorkLogJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
