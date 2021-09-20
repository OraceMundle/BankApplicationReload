/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.HibernateImplement;

import Domain.Account;
import Domain.Worker;
import Services.HibernateMainConfig;
import Services.IWorkerService;
import static com.mysql.cj.conf.PropertyKey.logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.apache.log4j.Logger;
/**
 *
 * @author OraceMundle
 */
public class WorkORMImpl extends HibernateMainConfig implements IWorkerService{

    public static final Logger log = Logger.getLogger(WorkORMImpl.class);
    
    //ORM Methods
    @Override
    public void addWorker(Worker worker) throws Exception {
        
        Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(worker);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to save an worker; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session.flush();
                      //session.close();
                     }   
            
        
    }

    @Override
    public void updateWorker(Worker worker) throws Exception {
        
        Session session = this.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(worker);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to update worker information; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
        
        
    }

    @Override
    public Worker getWorker(int id) throws Exception {
        
        Session session = CustomerORMImpl.getSession();
         Transaction transact=null;
        
          Worker account=null;
         try{
             transact=session.beginTransaction();
             account = (Worker) session.load(Worker.class, id);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to load worker with id " + id  + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return account;
        
    }

    @Override
    public List<Worker> getAllWorker() throws Exception {
       
         Session session1 = this.getSession();
         Transaction transact=null;
         List<Worker> workerList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             workerList = (List<Worker>) session1.createQuery("from ").list();
             transact.commit();             
         }
         catch(HibernateException hex){
             if(session1!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to load all workers; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return workerList; 
        
    }

    @Override
    public void deleteWorker(Class<?> Worker, int id) throws Exception {
        
        Session session = CustomerORMImpl.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object workerObject = session.load(Worker, id);
             
                      session.delete(workerObject);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to delete worker; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      //session.flush();
                      //session.close();
                     }
        
    }

    @Override
    public Worker getworkerLogin(Worker user) throws Exception {
           	try {
                //Session session = hibernate.getSessionFactory();
        Session session = CustomerORMImpl.getSession();
        Transaction transact=null;
			session.beginTransaction(); 
        
        if (user != null) {
		        	System.out.println("Worker find");
		        	session.close();
		        	//user.setAttempts(2);
		    	  	 return user;
		    	  }
		   }
		catch(Exception ex){
                                    
                                log.info(ex.getMessage());			 		
			 	BasicConfigurator.configure();
			 	//ogger.info("login error");
				//logger.error("user wasn't found");
				 Worker log = null;
				 //log.setAttempts(1);
				 return log;
				}
			return null;
     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
    //JDBC Methods
    @Override
    public void addWorkerJDBC(Worker worker) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateWorkerJDBC(Worker worker) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Worker getWorkerJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getAllWorkerJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteWorkerJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Worker getworkerLoginJDBC(Worker user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
