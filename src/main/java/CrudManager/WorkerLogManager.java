/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.WorkerLog;
import Services.Exceptions.ServiceLoadException;
import Services.Factory;
import Services.IWorkerLogService;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author OraceMundle
 */
public class WorkerLogManager {
    
    private static final Logger log = Logger.getLogger(WorkerLogManager.class);
    
     public void addWorkerLog(WorkerLog aWorkerLog)
    {
        try {
            
            System.out.println("In Business Layer addWorkerLog(WorkerLog aWorkerLog) method");
            Factory factory = new Factory();
            IWorkerLogService iBookMgr = (IWorkerLogService) factory.getTheService(IWorkerLogService.NAME);
            iBookMgr.addWorkerLog(aWorkerLog);
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
          //System.out.println(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
            //System.out.println(ex.getMessage()); 
        }
    }
    public WorkerLog getWorkerLog(int id)
    {
        WorkerLog aWorkerLog=new WorkerLog();
        try {
            System.out.println("In Business Layer getWorkerLog(String trn) method");
            Factory factory = new Factory();
            IWorkerLogService iWorkerLogMgr = (IWorkerLogService) factory.getTheService(IWorkerLogService.NAME);
            aWorkerLog=iWorkerLogMgr.getWorkerLog(id);
            
        } catch (ServiceLoadException ex) {
          //System.out.println(ex.getMessage());
          log.info(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
           //System.out.println(ex.getMessage()); 
        }
        return aWorkerLog;
    }
    
    public void updateWorkerLog(WorkerLog aWorkerLog)
    {
        try {
            System.out.println("In Business Layer updateWorkerLog(WorkerLog aWorkerLog) method");
            Factory factory = new Factory();
            IWorkerLogService iWorkerLogMgr = (IWorkerLogService) factory.getTheService(IWorkerLogService.NAME);
            iWorkerLogMgr.updateWorkerLog(aWorkerLog);
            
        } catch (ServiceLoadException ex) {
          log.info(ex.getMessage());
           //System.out.println(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
           //System.out.println(ex.getMessage()); 
        }
    }
    
    public List<WorkerLog> getAllWorkerLog()
    {
        List<WorkerLog> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllWorkerLog method");
            Factory factory = new Factory();
            IWorkerLogService iWorkerLogMgr = (IWorkerLogService) factory.getTheService(IWorkerLogService.NAME);
            customerList=iWorkerLogMgr.getAllWorkerLog();
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
            //System.out.println(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
            //System.out.println(ex.getMessage());
        }
        return customerList;
    }
    
    
    public void deleteWorkerLog(Class<?> WorkerLog, int id)
    {
        try {
            System.out.println("In Business Layer deleteWorkerLog method");
            Factory factory = new Factory();
            IWorkerLogService iWorkerLogMgr = (IWorkerLogService) factory.getTheService(IWorkerLogService.NAME);
            iWorkerLogMgr.deleteWorkLog(WorkerLog, id);            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
            //System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            //System.out.println(ex.getMessage());
        }
    }

    
    public void addWorkerLogJDBC(WorkerLog anWorkerLog)
    {
        try {
            System.out.println("In Business Layer addWorkerLogJDBC(WorkerLog customer) method");
            Factory factory = new Factory();            
            IWorkerLogService iWorkerLogMgrJDBC = (IWorkerLogService) factory.getTheService(IWorkerLogService.NAME);
            iWorkerLogMgrJDBC.addWorkerLogJDBC(anWorkerLog);
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
            //System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
           log.info(ex.getMessage()); 
           //System.out.println(ex.getMessage()); 
        }
    }
    public WorkerLog getWorkerLogJDBC(int id)
    {
        WorkerLog aWorkerLog=new WorkerLog();
        try {
            System.out.println("In Business Layer getWorkerLogJDBC(String trn) method");
            Factory factory = new Factory();           
            IWorkerLogService iWorkerLogMgrJDBC = (IWorkerLogService) factory.getTheService(IWorkerLogService.NAME);
            aWorkerLog=iWorkerLogMgrJDBC.getWorkerLogJDBC(id);
            
        } catch (ServiceLoadException ex) {
          log.info(ex.getMessage());
            //System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            //System.out.println(ex.getMessage());
            
        }
        return aWorkerLog;
    }
    
    public void updateWorkerLogJDBC(WorkerLog aWorkerLog)
    {
        try {
            System.out.println("In Business Layer  updateWorkerLogJDBC(WorkerLog aWorkerLog) method");
            Factory factory = new Factory();            
            IWorkerLogService iWorkerLogMgrJDBC = (IWorkerLogService) factory.getTheService(IWorkerLogService.NAME);
            iWorkerLogMgrJDBC.updateWorkerLogJDBC(aWorkerLog);
            
        } catch (ServiceLoadException ex) {
          log.info(ex.getMessage());
           //System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            log.info(ex.getMessage());
           //System.out.println(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllWorkerLogJDBC()
    {
        ResultSet rs=null;
        List<WorkerLog> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllWorkerLogJDBC method");
            Factory factory = new Factory();
            IWorkerLogService iWorkerLogMgrJDBC = (IWorkerLogService) factory.getTheService(IWorkerLogService.NAME);
            rs=(ResultSet) iWorkerLogMgrJDBC.getAllWorkerLogJDBC();
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
            //System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
           log.info(ex.getMessage()); 
        //System.out.println(ex.getMessage());            
        }
        return rs;
    }
    
    
    public void deleteWorkerLogJDBC(int id)
    {
        try {
            System.out.println("In Business Layer deleteWorkerLogJDBC method");
            Factory factory = new Factory();
            IWorkerLogService iWorkerLogMgrJDBC = (IWorkerLogService) factory.getTheService(IWorkerLogService.NAME);
            iWorkerLogMgrJDBC.deleteWorkLogJDBC(id);
            
        } catch (ServiceLoadException ex) {
          log.info(ex.getMessage());
            //System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            //System.out.println(ex.getMessage());
        }
    }
    
       
    public WorkerLogManager() {
    }
 
    
 
    
    
}
