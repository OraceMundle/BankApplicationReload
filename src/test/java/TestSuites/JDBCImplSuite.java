/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author OraceMundle
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Services.JDBCImpl.WorkerJDBCImplTest.class, Services.JDBCImpl.WorkerLogJDBCImplTest.class, Services.JDBCImpl.CustomerAddressJDBCImplTest.class, Services.JDBCImpl.AccountJDBCImplTest.class, Services.JDBCImpl.JDBCMainConfigurationTest.class, Services.JDBCImpl.CustomerJDBCImplTest.class})
public class JDBCImplSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
