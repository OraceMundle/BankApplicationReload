/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Customer;
import Services.Exceptions.ServiceLoadException;
import Services.Factory;
import Services.IAuthenticateService;
import Services.ICustomerService;
import Services.SpringConfig;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author OraceMundle
 */
public class CustomerJDBCManager {
    
    private static final Logger log = Logger.getLogger(CustomerJDBCManager.class);
    
    public void addCustomerJDBC(Customer anCustomer)
    {
        try {
            System.out.println("In Business Layer addCustomerJDBC(Customer customer) method");
            Factory factory = new Factory();            
            ICustomerService iCustomerMgrJDBC = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgrJDBC.addCustomerJDBC(anCustomer);
            
        } catch (ServiceLoadException ex) {
           System.out.println(ex.getMessage());
           log.info(ex.getMessage());
           
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage()); 
        }
    }
    public Customer getCustomerJDBC(String trn)
    {
        Customer aCustomer=new Customer();
        try {
            System.out.println("In Business Layer getCustomerJDBC(String trn) method");
            Factory factory = new Factory();
            
            ICustomerService iCustomerMgrJDBC = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            aCustomer=iCustomerMgrJDBC.getCustomerJDBC(trn);
            System.out.println("In Business Layer getCustomerJDBC(String trn) method" + aCustomer.getLastname());
            
            
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
        
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
            
        }
        return aCustomer;
    }
    
    public void updateCustomerJDBC(Customer aCustomer)
    {
        try {
            System.out.println("In Business Layer  updateCustomerJDBC(Customer aCustomer) method");
            Factory factory = new Factory();            
            ICustomerService iCustomerMgrJDBC = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgrJDBC.updateCustomerJDBC(aCustomer);
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllCustomerJDBC()
    {
        ResultSet rs=null;
        List<Customer> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllCustomerJDBC method");
            Factory factory = new Factory();
            ICustomerService iCustomerMgrJDBC = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            rs=(ResultSet) iCustomerMgrJDBC.getAllCustomersJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
          log.info(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());  
            log.info(ex.getMessage());
        }
        return rs;
    }
    
    
    public void deleteCustomerJDBC(String trn)
    {
        try {
            System.out.println("In Business Layer deleteCustomerJDBC method");
            Factory factory = new Factory();
            ICustomerService iCustomerMgrJDBC = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgrJDBC.deleteCustomerJDBC(trn);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
          log.info(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    
    public Boolean validateUser(String username) //check if user exist, does not check password
    {
        Boolean exist=false;
        
        try {
           Factory factory = new Factory();                        
           IAuthenticateService iAuthenticate = (IAuthenticateService) factory.getTheService(IAuthenticateService.NAME);
            
            //ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            //IAuthenticateService iAuthenticate = (IAuthenticateService) context.getBean("IAuthenticateImplement");
            exist=iAuthenticate.validateUser(username);  //check only username  
        } catch (ServiceLoadException ex) {          
            System.out.println("Could not load Service (Service oad Exception): "+ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Could not load Service (Base Exception): "+ex.getMessage());
            
        }
        return exist;
    }
     
      public Boolean validateUsernameAndPwd(Customer user)//same as validateUser Service layer IAuthenticateService would check the pasword
    {
        Boolean exist=false;        
        try {
           Factory factory = new Factory();                        
           IAuthenticateService iAuthenticate = (IAuthenticateService) factory.getTheService(IAuthenticateService.NAME);
           //ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
           //IAuthenticateService iAuthenticate = (IAuthenticateService) context.getBean("IAuthenticateImplement");
            exist=iAuthenticate.validateUsernameAndPwd(user);     //check username and password       
        } catch (ServiceLoadException ex) {          
            System.out.println("Could not load Service (Service oad Exception): "+ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Could not load Service (Base Exception): "+ex.getMessage());
            
        }
        return exist;
    }
    
    
    
    
    
    
    
    
    
    
    
    public CustomerJDBCManager() {
    }
    
    
}
