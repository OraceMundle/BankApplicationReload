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
@Suite.SuiteClasses({Services.HibernateImplement.AccountORMImplTest.class, Services.HibernateImplement.CustomerAddressORMImplTest.class, Services.HibernateImplement.WorkerORMImplTest.class, Services.HibernateImplement.CustomerORMImplTest.class, Services.HibernateImplement.WorkerLogORMImplTest.class})
public class HibernateImplementSuite {

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
