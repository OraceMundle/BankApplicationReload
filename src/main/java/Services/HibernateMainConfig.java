/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import Domain.Account;
import Domain.Customer;
import Domain.CustomerAddress;
import Domain.Worker;
import Domain.WorkerLog;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author IT Technician
 */
public abstract class HibernateMainConfig {
    private static final Configuration Config = new Configuration();
    private static SessionFactory sessionFactory=null;
    
    private static SessionFactory getSessionFactory() throws HibernateException
    {
        if(sessionFactory==null)
        {
            try{
                //configure hibernate using xml file
                Config.configure("hibernate.cfg.xml");
                
                //add annotated classes
                Config.addAnnotatedClass(Account.class);
                Config.addAnnotatedClass(Customer.class);
                Config.addAnnotatedClass(CustomerAddress.class);
                Config.addAnnotatedClass(Worker.class);
                Config.addAnnotatedClass(WorkerLog.class);
                
                
                sessionFactory=Config.buildSessionFactory();
                
            }
            catch(HibernateException hex)
            {
                throw new HibernateException("Unable to build Session factory " +hex.getMessage());
            }
        }
        return sessionFactory;
    }
    
    protected static Session getSession() throws HibernateException
    {
        sessionFactory=getSessionFactory();
        return(sessionFactory!=null) ? sessionFactory.openSession() : null; //opens and return the session
    }
    
    
}
