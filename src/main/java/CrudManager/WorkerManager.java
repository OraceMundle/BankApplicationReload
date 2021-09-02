/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Worker;
import Services.Exceptions.ServiceLoadException;
import Services.Factory;
import Services.IWorkerService;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public class WorkerManager {
    
    
     public void addWorker(Worker aWorker)
    {
        try {
            
            System.out.println("In Business Layer addWorker(Worker aWorker) method");
            Factory factory = new Factory();
            IWorkerService iBookMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            iBookMgr.addWorker(aWorker);
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    public Worker getWorker(String trn)
    {
        Worker aWorker=new Worker();
        try {
            System.out.println("In Business Layer getWorker(String trn) method");
            Factory factory = new Factory();
            IWorkerService iWorkerMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            aWorker=iWorkerMgr.getWorker(trn);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
        return aWorker;
    }
    
    public void updateWorker(Worker aWorker)
    {
        try {
            System.out.println("In Business Layer updateWorker(Worker aWorker) method");
            Factory factory = new Factory();
            IWorkerService iWorkerMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            iWorkerMgr.updateWorker(aWorker);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage());
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public List<Worker> getAllWorker()
    {
        List<Worker> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllWorker method");
            Factory factory = new Factory();
            IWorkerService iWorkerMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            customerList=iWorkerMgr.getAllWorker();
            
        } catch (ServiceLoadException ex) {
          
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
        return customerList;
    }
    
    
    public void deleteWorker(Class<?> Worker, String trn)
    {
        try {
            System.out.println("In Business Layer deleteWorker method");
            Factory factory = new Factory();
            IWorkerService iWorkerMgr = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            iWorkerMgr.deleteWorker(Worker, trn);            
        } catch (ServiceLoadException ex) {
            System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }

    
    public void addWorkerJDBC(Worker anWorker)
    {
        try {
            System.out.println("In Business Layer addWorkerJDBC(Worker customer) method");
            Factory factory = new Factory();            
            IWorkerService iWorkerMgrJDBC = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            iWorkerMgrJDBC.addWorkerJDBC(anWorker);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    public Worker getWorkerJDBC(String id)
    {
        Worker aWorker=new Worker();
        try {
            System.out.println("In Business Layer getWorkerJDBC(String trn) method");
            Factory factory = new Factory();           
            IWorkerService iWorkerMgrJDBC = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            aWorker=iWorkerMgrJDBC.getWorkerJDBC(id);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
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
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
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
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());            
        }
        return rs;
    }
    
    
    public void deleteWorkerJDBC(String id)
    {
        try {
            System.out.println("In Business Layer deleteWorkerJDBC method");
            Factory factory = new Factory();
            IWorkerService iWorkerMgrJDBC = (IWorkerService) factory.getTheService(IWorkerService.NAME);
            iWorkerMgrJDBC.deleteWorkerJDBC(id);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }
    
       
    public WorkerManager() {
    }
 
    
 
    
    
    
}
