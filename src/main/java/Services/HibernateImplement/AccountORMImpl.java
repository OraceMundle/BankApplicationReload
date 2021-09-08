/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.HibernateImplement;

import Domain.Account;
import Domain.Customer;
import Services.HibernateMainConfig;
import Services.IAccountService;
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
public class AccountORMImpl extends HibernateMainConfig implements IAccountService{
    private static final Logger log = Logger.getLogger(AccountORMImpl.class);
    
    //ORM Methods
    @Override
    public void addAccount(Account account) throws Exception {
        
       Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(account);
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
                      //session.flush();
                      //session.close();
                     }   
            
        
    }

    @Override
    public void updateAccount(Account account) throws Exception {
        
        Session session = this.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(account);
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
    public Account getAccount(String accountnumber) throws Exception {
        Session session = CustomerORMImpl.getSession();
         Transaction transact=null;
        
          Account account=null;
         try{
             transact=session.beginTransaction();
             account = (Account) session.load(Account.class, accountnumber);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to load account with id " + accountnumber  + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return account;
        
    }

    @Override
    public List<Account> getAllAccount() throws Exception {
    
        Session session1 = this.getSession();
         Transaction transact=null;
         List<Account> accountList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             accountList = (List<Account>) session1.createQuery("from ").list();
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
         return accountList;  
    
    }

    @Override
    public void deleteAccount(Class<?> Account, String accountnumber) throws Exception {
        Session session = CustomerORMImpl.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object bookObject = session.load(Account, accountnumber);
             
                      session.delete(bookObject);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to delete account; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      //session.flush();
                      //session.close();
                     }
        
        
        
    }

    
    
    
    //JDBC Methods
    
    @Override
    public void addAccountJDBC(Account account) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAccountJDBC(Account account) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account getAccountJDBC(String accountnumber) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Account> getAllAccountJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      @Override
    public void deleteAccountJDBC(String accountnumber) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
