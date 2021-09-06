/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.HibernateImplement;

import Domain.Customer;
import Services.HibernateMainConfig;
import Services.ICustomerService;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

/**
 *
 * @author OraceMundle
 */
@Component("CustomerORM")

public class CustomerORMImpl extends HibernateMainConfig implements ICustomerService{

    @Override
    public void addCustomer(Customer customer) throws Exception {
        
         Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(customer);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to save customer; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session.flush();
                      //session.close();
                     }   
    
        
        
    
    
    
    }

    @Override
    public void updateCustomer(Customer customer) throws Exception {
        Session session = this.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(customer);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to update customer information; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
        
    }

    @Override
    public Customer getCustomer(String trn) throws Exception {
        
        Session session = CustomerORMImpl.getSession();
         Transaction transact=null;
        
          Customer aCustomer=null;
         try{
             transact=session.beginTransaction();
             aCustomer = (Customer) session.load(Customer.class, trn);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load customer with id " + trn + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return aCustomer;
        
    }

    @Override
    public List<Customer> getAllCustomers() throws Exception {
        
      Session session1 = this.getSession();
         Transaction transact=null;
         List<Customer> customerList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             customerList = (List<Customer>) session1.createQuery("from Customer ").list();
             transact.commit();             
         }
         catch(HibernateException hex){
             if(session1!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load all customers; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return customerList;  
        
        
    }

    @Override
    public void deleteCustomer(Class<?> Customer, String trn) throws Exception {
    Session session = CustomerORMImpl.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object customerObject = session.load(Customer, trn);
             
                      session.delete(customerObject);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to delete customer; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      //session.flush();
                      //session.close();
                     }
    
    }
    @Override
    public void addCustomerJDBC(Customer customer) throws Exception {
        throw new UnsupportedOperationException("This is Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCustomerJDBC(Customer customer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomerJDBC(String trn) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getAllCustomersJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCustomerJDBC(String trn) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomerLogin(Customer user) throws Exception {
        
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
			 		
			 	BasicConfigurator.configure();
			 	//ogger.info("login error");
				//logger.error("user wasn't found");
				 Customer log = null;
				 //log.setAttempts(1);
				 return log;
				}
			return null;
     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
        
        
    }

    @Override
    public Customer getCustomerLoginJDBC(Customer user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
