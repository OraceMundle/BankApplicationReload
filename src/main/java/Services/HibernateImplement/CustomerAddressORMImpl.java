/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.HibernateImplement;


import Domain.Account;
import Domain.CustomerAddress;
import Services.HibernateMainConfig;
import Services.ICustomerAddressService;
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
public class CustomerAddressORMImpl extends HibernateMainConfig implements ICustomerAddressService{

    private static final Logger log = Logger.getLogger(CustomerAddressORMImpl.class);
    
    //ORM Methods
    @Override
    public void addCustomerAddress(CustomerAddress customerAddress) throws Exception {
        
        Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(customerAddress);
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
    public void updateCustomerAddress(CustomerAddress customerAddress) throws Exception {
      Session session = this.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(customerAddress);
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
    public CustomerAddress getCustomerAddress(int addressId) throws Exception {
        
        Session session = CustomerORMImpl.getSession();
         Transaction transact=null;
        
          CustomerAddress account=null;
         try{
             transact=session.beginTransaction();
             account = (CustomerAddress) session.load(CustomerAddress.class, addressId);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 log.info(hex.getMessage());
                 transact.rollback();
                 throw new HibernateException("Not able to load account with id " + addressId  + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return account;
              
    }

    @Override
    public List<CustomerAddress> getAllCustomerAddresses() throws Exception {
        
        Session session1 = this.getSession();
         Transaction transact=null;
         List<CustomerAddress> customerAddressList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             customerAddressList = (List<CustomerAddress>) session1.createQuery("from ").list();
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
         return customerAddressList;  
               
    }

    @Override
    public void deleteCustomerAddress(Class<?> CustomerAddress, int addressId) throws Exception {
        
        Session session = CustomerORMImpl.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object bookObject = session.load(CustomerAddress, addressId);
             
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
                      session.flush();
                      session.close();
                     }
                 
    }

    
    
    //JDBC
    
    @Override
    public void addCustomerAddressJDBC(CustomerAddress customerAddress) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCustomerAddressJDBC(CustomerAddress customerAddress) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerAddress getCustomerAddressJDBC(int addressId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerAddress> getAllCustomerAddressesJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCustomerAddressJDBC(int addressId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
