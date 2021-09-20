/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Customer;
import Domain.Worker;
import Services.Exceptions.ServiceLoadException;
import Services.Factory;
import Services.IAuthenticateService;
import Services.IWorkerService;
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
public class WorkerManager {
    
    private static final Logger log = Logger.getLogger(WorkerLogManager.class);
    
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    
    //ORM
    
     public void addWorker(Worker aWorker)
    {
        try {
            
            System.out.println("In Business Layer addWorker(Worker aWorker) method");
            //Factory factory = new Factory();
            //IWorkerService iWorkerMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            
            
            IWorkerService iWorkerMgr=(IWorkerService)context.getBean("WorkerORM");
            iWorkerMgr.addWorker(aWorker);
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());    
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage()); 
        }
    }
    public Worker getWorker(int id)
    {
        Worker aWorker=new Worker();
        try {
            System.out.println("In Business Layer getWorker(String trn) method");
            //Factory factory = new Factory();
            //IWorkerService iWorkerMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            
            IWorkerService iWorkerMgr=(IWorkerService)context.getBean("WorkerORM");
            aWorker=iWorkerMgr.getWorker(id);
            
        } catch (ServiceLoadException ex) {
               log.info(ex.getMessage());
               System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage()); 
        }
        return aWorker;
    }
    
    public void updateWorker(Worker aWorker)
    {
        try {
            System.out.println("In Business Layer updateWorker(Worker aWorker) method");
            //Factory factory = new Factory();
            //IWorkerService iWorkerMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            
            IWorkerService iWorkerMgr=(IWorkerService)context.getBean("WorkerORM");
            iWorkerMgr.updateWorker(aWorker);
            
        } catch (ServiceLoadException ex) {
          log.info(ex.getMessage());
          System.out.println(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage()); 
        }
    }
    
    public List<Worker> getAllWorker()
    {
        List<Worker> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllWorker method");
            //Factory factory = new Factory();
            //IWorkerService iWorkerMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            
            IWorkerService iWorkerMgr=(IWorkerService)context.getBean("WorkerORM");
            customerList=iWorkerMgr.getAllWorker();
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        }
        return customerList;
    }
    
    
    public void deleteWorker(Class<?> Worker, int id)
    {
        try {
            System.out.println("In Business Layer deleteWorker method");
            //Factory factory = new Factory();
            //IWorkerService iWorkerMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            
            IWorkerService iWorkerMgr=(IWorkerService)context.getBean("WorkerORM");
            iWorkerMgr.deleteWorker(Worker, id);            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    
    //JDBC
    
    
    public void addWorkerJDBC(Worker anWorker)
    {
        try {
            System.out.println("In Business Layer addWorkerJDBC(Worker customer) method");
            Factory factory = new Factory();            
            IWorkerService iWorkerMgrJDBC = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            iWorkerMgrJDBC.addWorkerJDBC(anWorker);
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
    }
    public Worker getWorkerJDBC(int id)
    {
        Worker aWorker=new Worker();
        try {
            System.out.println("In Business Layer getWorkerJDBC(String trn) method");
            Factory factory = new Factory();           
            IWorkerService iWorkerMgrJDBC = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            aWorker=iWorkerMgrJDBC.getWorkerJDBC(id);
            
        } catch (ServiceLoadException ex) {
          log.info(ex.getMessage());
           System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
            
        }
        return aWorker;
    }
    
    public void updateWorkerJDBC(Worker aWorker)
    {
        try {
            System.out.println("In Business Layer  updateWorkerJDBC(Worker aWorker) method");
            Factory factory = new Factory();            
            IWorkerService iWorkerMgrJDBC = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            iWorkerMgrJDBC.updateWorkerJDBC(aWorker);
            
        } catch (ServiceLoadException ex) {
          log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllWorkerJDBC()
    {
        ResultSet rs=null;
        List<Worker> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllWorkerJDBC method");
            Factory factory = new Factory();
            IWorkerService iWorkerMgrJDBC = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            rs=(ResultSet) iWorkerMgrJDBC.getAllWorkerJDBC();
            
        } catch (ServiceLoadException ex) {
             log.info(ex.getMessage());   
             System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());            
        }
        return rs;
    }
    
    
    public void deleteWorkerJDBC(int id)
    {
        try {
            System.out.println("In Business Layer deleteWorkerJDBC method");
            Factory factory = new Factory();
            IWorkerService iWorkerMgrJDBC = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            iWorkerMgrJDBC.deleteWorkerJDBC(id);
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
     public Boolean validateWorker(String username) //check if user exist, does not check password
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
     
      public Boolean validateWorkerUsernameAndPwd(Worker worker)//same as validateUser Service layer IAuthenticateService would check the pasword
    {
        Boolean exist=false;        
        try {
           // Factory factory = new Factory();                        
           // IAuthenticateService iAuthenticate = (IAuthenticateService) factory.getTheService(IAuthenticateService.NAME);
           ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
           IAuthenticateService iAuthenticate = (IAuthenticateService) context.getBean("IAuthenticateImplement");
            exist=iAuthenticate.validateWorkerUsernameAndPwd(worker);
            //check username and password       
        } catch (ServiceLoadException ex) {          
            System.out.println("Could not load Service (Service oad Exception): "+ex.getMessage());
             log.info(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Could not load Service (Base Exception): "+ex.getMessage());
             log.info(ex.getMessage());
            
        }
        return exist;
    }
    
      
      
      
      //adding testCredentials Method 
   public Worker testCredentials (Worker user) 
   
   {
   Worker anworkerLogin=new Worker();
        try {
            System.out.println("In Business Layer testCredentials (WorkerLogin user) method");
            Factory factory = new Factory();           
            IWorkerService iworkerLoginMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            anworkerLogin=iworkerLoginMgr.getworkerLoginJDBC(user);
            
             System.out.println(user.getLastname());
             System.out.println(user.getId());
                        
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
           log.info(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             log.info(ex.getMessage());
            
        }
        return anworkerLogin;
   
   
   
   }
          
    public WorkerManager() {
    }
 
    
 
    
    
    
}
