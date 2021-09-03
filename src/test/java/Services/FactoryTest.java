/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

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
public class FactoryTest {
    
    public FactoryTest() {
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
     * Test of getTheService method, of class Factory.
     */
    @Test
    public void testGetTheService() throws Exception {
        System.out.println("getTheService");
        String serviceName = "";
        Factory instance = new Factory();
        IService expResult = null;
        IService result = instance.getTheService(serviceName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImplementName method, of class Factory.
     */
    @Test
    public void testGetImplementName() throws Exception {
        System.out.println("getImplementName");
        String serviceName = "";
        Factory instance = new Factory();
        String expResult = "";
        String result = instance.getImplementName(serviceName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
