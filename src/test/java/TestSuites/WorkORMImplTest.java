/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import Domain.Worker;
import Services.HibernateImplement.WorkORMImpl;
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
public class WorkORMImplTest {
    
    public WorkORMImplTest() {
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
     * Test of addWorker method, of class WorkORMImpl.
     */
    @Test
    public void testAddWorker() throws Exception {
        System.out.println("addWorker");
        Worker worker = null;
        WorkORMImpl instance = new WorkORMImpl();
        instance.addWorker(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorker method, of class WorkORMImpl.
     */
    @Test
    public void testUpdateWorker() throws Exception {
        System.out.println("updateWorker");
        Worker worker = null;
        WorkORMImpl instance = new WorkORMImpl();
        instance.updateWorker(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorker method, of class WorkORMImpl.
     */
    @Test
    public void testGetWorker() throws Exception {
        System.out.println("getWorker");
        String id = "";
        WorkORMImpl instance = new WorkORMImpl();
        Worker expResult = null;
        Worker result = instance.getWorker(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorker method, of class WorkORMImpl.
     */
    @Test
    public void testGetAllWorker() throws Exception {
        System.out.println("getAllWorker");
        WorkORMImpl instance = new WorkORMImpl();
        List<Worker> expResult = null;
        List<Worker> result = instance.getAllWorker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorker method, of class WorkORMImpl.
     */
    @Test
    public void testDeleteWorker() throws Exception {
        System.out.println("deleteWorker");
        Class Worker = null;
        String id = "";
        WorkORMImpl instance = new WorkORMImpl();
        instance.deleteWorker(Worker, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWorkerJDBC method, of class WorkORMImpl.
     */
    @Test
    public void testAddWorkerJDBC() throws Exception {
        System.out.println("addWorkerJDBC");
        Worker worker = null;
        WorkORMImpl instance = new WorkORMImpl();
        instance.addWorkerJDBC(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorkerJDBC method, of class WorkORMImpl.
     */
    @Test
    public void testUpdateWorkerJDBC() throws Exception {
        System.out.println("updateWorkerJDBC");
        Worker worker = null;
        WorkORMImpl instance = new WorkORMImpl();
        instance.updateWorkerJDBC(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkerJDBC method, of class WorkORMImpl.
     */
    @Test
    public void testGetWorkerJDBC() throws Exception {
        System.out.println("getWorkerJDBC");
        String id = "";
        WorkORMImpl instance = new WorkORMImpl();
        Worker expResult = null;
        Worker result = instance.getWorkerJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorkerJDBC method, of class WorkORMImpl.
     */
    @Test
    public void testGetAllWorkerJDBC() throws Exception {
        System.out.println("getAllWorkerJDBC");
        WorkORMImpl instance = new WorkORMImpl();
        List<Worker> expResult = null;
        List<Worker> result = instance.getAllWorkerJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorkerJDBC method, of class WorkORMImpl.
     */
    @Test
    public void testDeleteWorkerJDBC() throws Exception {
        System.out.println("deleteWorkerJDBC");
        String id = "";
        WorkORMImpl instance = new WorkORMImpl();
        instance.deleteWorkerJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
