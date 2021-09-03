/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Worker;
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
public class IWorkerServiceTest {
    
    public IWorkerServiceTest() {
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
     * Test of addWorker method, of class IWorkerService.
     */
    @Test
    public void testAddWorker() throws Exception {
        System.out.println("addWorker");
        Worker worker = null;
        IWorkerService instance = new IWorkerServiceImpl();
        instance.addWorker(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorker method, of class IWorkerService.
     */
    @Test
    public void testUpdateWorker() throws Exception {
        System.out.println("updateWorker");
        Worker worker = null;
        IWorkerService instance = new IWorkerServiceImpl();
        instance.updateWorker(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorker method, of class IWorkerService.
     */
    @Test
    public void testGetWorker() throws Exception {
        System.out.println("getWorker");
        String id = "";
        IWorkerService instance = new IWorkerServiceImpl();
        Worker expResult = null;
        Worker result = instance.getWorker(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorker method, of class IWorkerService.
     */
    @Test
    public void testGetAllWorker() throws Exception {
        System.out.println("getAllWorker");
        IWorkerService instance = new IWorkerServiceImpl();
        List<Worker> expResult = null;
        List<Worker> result = instance.getAllWorker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorker method, of class IWorkerService.
     */
    @Test
    public void testDeleteWorker() throws Exception {
        System.out.println("deleteWorker");
        Class Worker = null;
        String id = "";
        IWorkerService instance = new IWorkerServiceImpl();
        instance.deleteWorker(Worker, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWorkerJDBC method, of class IWorkerService.
     */
    @Test
    public void testAddWorkerJDBC() throws Exception {
        System.out.println("addWorkerJDBC");
        Worker worker = null;
        IWorkerService instance = new IWorkerServiceImpl();
        instance.addWorkerJDBC(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorkerJDBC method, of class IWorkerService.
     */
    @Test
    public void testUpdateWorkerJDBC() throws Exception {
        System.out.println("updateWorkerJDBC");
        Worker worker = null;
        IWorkerService instance = new IWorkerServiceImpl();
        instance.updateWorkerJDBC(worker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkerJDBC method, of class IWorkerService.
     */
    @Test
    public void testGetWorkerJDBC() throws Exception {
        System.out.println("getWorkerJDBC");
        String id = "";
        IWorkerService instance = new IWorkerServiceImpl();
        Worker expResult = null;
        Worker result = instance.getWorkerJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWorkerJDBC method, of class IWorkerService.
     */
    @Test
    public void testGetAllWorkerJDBC() throws Exception {
        System.out.println("getAllWorkerJDBC");
        IWorkerService instance = new IWorkerServiceImpl();
        List<Worker> expResult = null;
        List<Worker> result = instance.getAllWorkerJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorkerJDBC method, of class IWorkerService.
     */
    @Test
    public void testDeleteWorkerJDBC() throws Exception {
        System.out.println("deleteWorkerJDBC");
        String id = "";
        IWorkerService instance = new IWorkerServiceImpl();
        instance.deleteWorkerJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IWorkerServiceImpl implements IWorkerService {

        public void addWorker(Worker worker) throws Exception {
        }

        public void updateWorker(Worker worker) throws Exception {
        }

        public Worker getWorker(String id) throws Exception {
            return null;
        }

        public List<Worker> getAllWorker() throws Exception {
            return null;
        }

        public void deleteWorker(Class<?> Worker, String id) throws Exception {
        }

        public void addWorkerJDBC(Worker worker) throws Exception {
        }

        public void updateWorkerJDBC(Worker worker) throws Exception {
        }

        public Worker getWorkerJDBC(String id) throws Exception {
            return null;
        }

        public List<Worker> getAllWorkerJDBC() throws Exception {
            return null;
        }

        public void deleteWorkerJDBC(String id) throws Exception {
        }
    }
    
}
