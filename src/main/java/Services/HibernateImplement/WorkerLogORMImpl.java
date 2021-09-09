/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.HibernateImplement;

import Domain.Account;
import Domain.WorkerLog;
import Services.HibernateMainConfig;
import Services.IWorkerLogService;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.apache.log4j.Logger;

/**
 *
 * @author OraceMundle
 */
public class WorkerLogORMImpl extends HibernateMainConfig implements IWorkerLogService{

    private static final Logger log = Logger.getLogger(WorkerLogORMImpl.class);
    
    //ORM Methods
    @Override
    public void addWorkerLog(WorkerLog workerLog) throws Exception {
        Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(workerLog);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to save an account; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      session.flush();
                      session.close();
                     }   
                   
        
    }

    @Override
    public void updateWorkerLog(WorkerLog workerLog) throws Exception {
        
         Session session = this.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(workerLog);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to update account information; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
        
        
    }

    @Override
    public WorkerLog getWorkerLog(int id) throws Exception {
        
        Session session = CustomerORMImpl.getSession();
         Transaction transact=null;
        
          WorkerLog account=null;
         try{
             transact=session.beginTransaction();
             account = (WorkerLog) session.load(WorkerLog.class, id);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to load Worker Log with id " + id  + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return account;
       
    }

    @Override
    public List<WorkerLog> getAllWorkerLog() throws Exception {
        
     Session session1 = this.getSession();
         Transaction transact=null;
         List<WorkerLog> workerlogList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             workerlogList = (List<WorkerLog>) session1.createQuery("from ").list();
             transact.commit();             
         }
         catch(HibernateException hex){
             if(session1!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to load all accounts; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return workerlogList;  
    
    }

    @Override
    public void deleteWorkLog(Class<?> WorkerLog, int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //JDBC Methods
    @Override
    public void addWorkerLogJDBC(WorkerLog workerLog) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateWorkerLogJDBC(WorkerLog workerLog) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WorkerLog getWorkerLogJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getAllWorkerLogJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteWorkLogJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
