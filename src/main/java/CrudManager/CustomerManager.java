/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Customer;
import Services.Exceptions.ServiceLoadException;
import Services.Factory;
import Services.ICustomerService;
import Services.IAuthenticateService;
//import Services.Exceptions.ServiceLoadException;
import Services.SpringConfig;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author OraceMundle
 */
public class CustomerManager {
    
    private static final Logger log = Logger.getLogger(CustomerManager.class);
    
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    
     public void addCustomer(Customer aCustomer)
    {
       PropertyConfigurator.configure("C:\\Users\\orace\\Documents\\NetBeansProjects\\BankApplicationReload\\src\\main\\resources\\log4j.properties"); 
       
        
        
        try {
            
            //System.out.println("In Business Layer addCustomer(Customer aCustomer) method");
            log.info("In Business Layer addCustomer(Customer aCustomer) method");
            //Factory factory = new Factory();
            //ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            
            
         ICustomerService iCustomerMgr=(ICustomerService)context.getBean("CustomerORM");
         iCustomerMgr.addCustomer(aCustomer);
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
          //System.out.println(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
           //System.out.println(ex.getMessage()); 
        }
    }
    public Customer getCustomer(String trn)
    {
        Customer aCustomer=new Customer();
        try {
            System.out.println("In Business Layer getCustomer(String trn) method");
            //Factory factory = new Factory();
            //ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            ICustomerService iCustomerMgr=(ICustomerService)context.getBean("CustomerORM");
             //iCustomerMgr.getCustomer(trn);
            
            aCustomer=iCustomerMgr.getCustomer(trn);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
        return aCustomer;
    }
    
    public void updateCustomer(Customer aCustomer)
    {
        try {
            System.out.println("In Business Layer updateCustomer(Customer aCustomer) method");
            //Factory factory = new Factory();
            //ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            ICustomerService iCustomerMgr=(ICustomerService)context.getBean("CustomerORM");
         iCustomerMgr.updateCustomer(aCustomer);
            
            iCustomerMgr.updateCustomer(aCustomer);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage());
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public List<Customer> getAllCustomer()
    {
        List<Customer> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllCustomer method");
            //Factory factory = new Factory();
            //ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            
            ICustomerService iCustomerMgr=(ICustomerService)context.getBean("CustomerORM");
            //iCustomerMgr.addCustomer(aCustomer);
            customerList=iCustomerMgr.getAllCustomers();
            
        } catch (ServiceLoadException ex) {
          
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
        return customerList;
    }
    
    
    public void deleteCustomer(Class<?> Customer, String trn)
    {
        try {
            System.out.println("In Business Layer deleteCustomer method");
            //Factory factory = new Factory();
            //ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            ICustomerService iCustomerMgr=(ICustomerService)context.getBean("CustomerORM");
         
         
            iCustomerMgr.deleteCustomer(Customer, trn);            
        } catch (ServiceLoadException ex) {
            System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }

    
    public void addCustomerJDBC(Customer anCustomer)
    {
        try {
            System.out.println("In Business Layer addCustomerJDBC(Customer customer) method");
            Factory factory = new Factory();            
            ICustomerService iCustomerMgrJDBC = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgrJDBC.addCustomerJDBC(anCustomer);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
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
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
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
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
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
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());            
        }
        return rs;
    }
    
    
    public void deleteCustomer(String trn)
    {
        try {
            System.out.println("In Business Layer deleteCustomerJDBC method");
            Factory factory = new Factory();
            ICustomerService iCustomerMgrJDBC = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgrJDBC.deleteCustomerJDBC(trn);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }
    
    public Boolean validateUser(String username) //check if user exist, does not check password
    {
        Boolean exist=false;
        
        try {
           // Factory factory = new Factory();                        
         //   IAuthenticateService iAuthenticate = (IAuthenticateService) factory.getTheService(IAuthenticateService.NAME);
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            IAuthenticateService iAuthenticate = (IAuthenticateService) context.getBean("IAuthenticateImplement");
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
           // Factory factory = new Factory();                        
           // IAuthenticateService iAuthenticate = (IAuthenticateService) factory.getTheService(IAuthenticateService.NAME);
           ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
           IAuthenticateService iAuthenticate = (IAuthenticateService) context.getBean("IAuthenticateImplement");
            exist=iAuthenticate.validateUsernameAndPwd(user);     //check username and password       
        } catch (ServiceLoadException ex) {          
            System.out.println("Could not load Service (Service oad Exception): "+ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Could not load Service (Base Exception): "+ex.getMessage());
            
        }
        return exist;
    }
    
    
      
    
       
    public CustomerManager() {
    }
 
}

    
    
    
    
    

