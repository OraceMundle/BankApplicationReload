/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.HibernateImplement;

import Domain.TransactionCal;
import Services.HibernateMainConfig;
import java.sql.ResultSet;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Services.ITransactionCalService;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

/**
 *
 * @author OraceMundle
 */

@Component("TransactionCalORM")

public class TransactionCalORMImpl extends HibernateMainConfig implements ITransactionCalService{
        
     private static final Logger log = Logger.getLogger(TransactionCalORMImpl.class);

     
     //ORM
    @Override
    public void addTransaction(TransactionCal transaction) throws Exception {
        
        Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(transaction);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to save transaction; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session.flush();
                      //session.close();
                     }   
    
    }

    @Override
    public void updateTransaction(TransactionCal transaction) throws Exception {
        
        Session session = this.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(transaction);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to update transaction information; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
       
    }

    @Override
    public TransactionCal getTransaction(int transactionId) throws Exception {
        
       Session session = TransactionCalORMImpl.getSession();
         Transaction transact=null;
        
          TransactionCal aTransaction =null;
         try{
             transact=session.beginTransaction();
             aTransaction = (TransactionCal) session.load(TransactionCal.class, transactionId);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to load Transaction with id " + transactionId + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return aTransaction; 
        
        
    }

    @Override
    public List<TransactionCal> getAllTransactions() throws Exception {
        
        Session session1 = this.getSession();
         Transaction transact=null;
         List<TransactionCal> transactionList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             transactionList = (List<TransactionCal>) session1.createQuery("from TransactionCal ").list();
             transact.commit();             
         }
         catch(HibernateException hex){
             if(session1!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to load all transactions; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return transactionList;  
        
       
    }

    @Override
    public void deleteTransaction(Class<?> TransactionCal, int transactionId) throws Exception {
        
        Session session = TransactionCalORMImpl.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object transactionObject = session.load(TransactionCal, transactionId);
             
                      session.delete(transactionObject);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to delete transaction; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      //session.flush();
                      //session.close();
                     }
        
    }

    
    
    //JDBC
    @Override
    public void addTransactionJDBC(TransactionCal transaction) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTransactionJDBC(TransactionCal transaction) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TransactionCal getTransactionJDBC(int transactionId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getAllTransactionsJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTransactionJDBC(int transactionId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

   
    
}
