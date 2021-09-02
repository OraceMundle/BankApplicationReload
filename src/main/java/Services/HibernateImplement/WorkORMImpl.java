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
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author OraceMundle
 */
public class WorkORMImpl extends HibernateMainConfig implements IWorkerService{

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
    public Worker getWorker(String id) throws Exception {
        
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
                 transact.rollback();
                 throw new HibernateException("Not able to load account with id " + id  + "; rolling back transaction " + hex.getMessage());
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
                 transact.rollback();
                 throw new HibernateException("Not able to load all accounts; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return workerList; 
        
    }

    @Override
    public void deleteWorker(Class<?> Worker, String id) throws Exception {
        
        Session session = CustomerORMImpl.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object bookObject = session.load(Worker, id);
             
                      session.delete(bookObject);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to delete account; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      session.flush();
                      session.close();
                     }
        
    }

    
    //JDBC Methods
    @Override
    public void addWorkerJDBS(Worker worker) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateWorkerJDBC(Worker worker) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Worker getWorkerJDBC(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Worker> getAllWorkerJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteWorkerJDBC(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
