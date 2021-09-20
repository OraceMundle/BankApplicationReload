/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

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
        int id = 0;
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
        int id = 0;
        IWorkerService instance = new IWorkerServiceImpl();
        instance.deleteWorker(Worker, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getworkerLogin method, of class IWorkerService.
     */
    @Test
    public void testGetworkerLogin() throws Exception {
        System.out.println("getworkerLogin");
        Worker user = null;
        IWorkerService instance = new IWorkerServiceImpl();
        Worker expResult = null;
        Worker result = instance.getworkerLogin(user);
        assertEquals(expResult, result);
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
        int id = 0;
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
        ResultSet expResult = null;
        ResultSet result = instance.getAllWorkerJDBC();
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
        int id = 0;
        IWorkerService instance = new IWorkerServiceImpl();
        instance.deleteWorkerJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getworkerLoginJDBC method, of class IWorkerService.
     */
    @Test
    public void testGetworkerLoginJDBC() throws Exception {
        System.out.println("getworkerLoginJDBC");
        Worker user = null;
        IWorkerService instance = new IWorkerServiceImpl();
        Worker expResult = null;
        Worker result = instance.getworkerLoginJDBC(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IWorkerServiceImpl implements IWorkerService {

        public void addWorker(Worker worker) throws Exception {
        }

        public void updateWorker(Worker worker) throws Exception {
        }

        public Worker getWorker(int id) throws Exception {
            return null;
        }

        public List<Worker> getAllWorker() throws Exception {
            return null;
        }

        public void deleteWorker(Class<?> Worker, int id) throws Exception {
        }

        public Worker getworkerLogin(Worker user) throws Exception {
            return null;
        }

        public void addWorkerJDBC(Worker worker) throws Exception {
        }

        public void updateWorkerJDBC(Worker worker) throws Exception {
        }

        public Worker getWorkerJDBC(int id) throws Exception {
            return null;
        }

        public ResultSet getAllWorkerJDBC() throws Exception {
            return null;
        }

        public void deleteWorkerJDBC(int id) throws Exception {
        }

        public Worker getworkerLoginJDBC(Worker user) throws Exception {
            return null;
        }
    }
    
}
