/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.TransactionCal;
import Services.Exceptions.ServiceLoadException;
import Services.Factory;
import Services.IAuthenticateService;
import Services.ITransactionCalService;
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
public class TransactionCalManager {
    
    
    private static final Logger log = Logger.getLogger(TransactionCalManager.class);
    
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    
     
    public void addTransactionCal(TransactionCal aTransactionCal)
    {
       PropertyConfigurator.configure("C:\\Users\\orace\\Documents\\NetBeansProjects\\BankApplicationReload\\src\\main\\resources\\log4j.properties"); 
       
        
        //ORM
        try {
            
            System.out.println("In Business Layer addTransactionCal(TransactionCal aTransactionCal) method");
            log.info("In Business Layer addTransactionCal(TransactionCal aTransactionCal) method");
            //Factory factory = new Factory();
            //ITransactionCalService iTransactionCalMgr = (ITransactionCalService) factory.getTheService(ITransactionCalService.NAME);
            
            
         ITransactionCalService iTransactionCalMgr=(ITransactionCalService)context.getBean("TransactionCalORM");
         iTransactionCalMgr.addTransaction(aTransactionCal);
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
           System.out.println(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
    }
    public TransactionCal getTransactionCal(int transactionId)
    {
        TransactionCal aTransactionCal=new TransactionCal();
        try {
            System.out.println("In Business Layer getTransactionCal(int transactionId) method");
            //Factory factory = new Factory();
            //ITransactionCalService iTransactionCalMgr = (ITransactionCalService) factory.getTheService(ITransactionCalService.NAME);
            ITransactionCalService iTransactionCalMgr=(ITransactionCalService)context.getBean("TransactionCalORM");
             iTransactionCalMgr.getTransaction(transactionId);
            
            aTransactionCal=iTransactionCalMgr.getTransaction(transactionId);
            System.out.println(aTransactionCal.getTransactionid());
            
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
        return aTransactionCal;
    }
    
    public void updateTransactionCal(TransactionCal aTransactionCal)
    {
        try {
            System.out.println("In Business Layer updateTransactionCal(TransactionCal aTransactionCal) method");
            //Factory factory = new Factory();
            //ITransactionCalService iTransactionCalMgr = (ITransactionCalService) factory.getTheService(ITransactionCalService.NAME);
            ITransactionCalService iTransactionCalMgr=(ITransactionCalService)context.getBean("TransactionCalORM");
         iTransactionCalMgr.updateTransaction(aTransactionCal);
            
            iTransactionCalMgr.updateTransaction(aTransactionCal);
            
        } catch (ServiceLoadException ex) {
          
            log.info(ex.getMessage());
           System.out.println(ex.getMessage());
        } catch (Exception ex) {
           log.info(ex.getMessage()); 
           System.out.println(ex.getMessage()); 
        }
    }
    
    public List<TransactionCal> getAllTransactionCal()
    {
        List<TransactionCal> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllTransactionCal method");
            //Factory factory = new Factory();
            //ITransactionCalService iTransactionCalMgr = (ITransactionCalService) factory.getTheService(ITransactionCalService.NAME);
            
            ITransactionCalService iTransactionCalMgr=(ITransactionCalService)context.getBean("TransactionCalORM");
            //iTransactionCalMgr.addTransactionCal(aTransactionCal);
            customerList=iTransactionCalMgr.getAllTransactions();
            
        } catch (ServiceLoadException ex) {
          log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        }
        return customerList;
    }
    
    
    public void deleteTransactionCal(Class<?> TransactionCal, int transactionId)
    {
        try {
            System.out.println("In Business Layer deleteTransactionCal method");
            //Factory factory = new Factory();
            //ITransactionCalService iTransactionCalMgr = (ITransactionCalService) factory.getTheService(ITransactionCalService.NAME);
            ITransactionCalService iTransactionCalMgr=(ITransactionCalService)context.getBean("TransactionCalORM");
         
         
            iTransactionCalMgr.deleteTransaction(TransactionCal, transactionId);            
        } catch (ServiceLoadException ex) {
            System.out.println(ex.getMessage());
            log.info(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    
    //JDBC
    
    public void addTransactionCalJDBC(TransactionCal anTransactionCal)
    {
        try {
            System.out.println("In Business Layer addTransactionCalJDBC(TransactionCal customer) method");
            Factory factory = new Factory();            
            ITransactionCalService iTransactionCalMgrJDBC = (ITransactionCalService) factory.getTheService(ITransactionCalService.NAME);
            iTransactionCalMgrJDBC.addTransactionJDBC(anTransactionCal);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           log.info(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
    }
    public TransactionCal getTransactionCalJDBC(int transactionId)
    {
        TransactionCal aTransactionCal=new TransactionCal();
        try {
            System.out.println("In Business Layer getTransactionCalJDBC(int transactionId) method");
            Factory factory = new Factory();           
            ITransactionCalService iTransactionCalMgrJDBC = (ITransactionCalService) factory.getTheService(ITransactionCalService.NAME);
            aTransactionCal=iTransactionCalMgrJDBC.getTransactionJDBC(transactionId);
             System.out.println("In Business Layer getTransactionCalJDBC(int transactionId) method" + aTransactionCal.getTransactionid());
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            log.info(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            log.info(ex.getMessage());
        }
        return aTransactionCal;
    }
    
    public void updateTransactionCalJDBC(TransactionCal aTransactionCal)
    {
        try {
            System.out.println("In Business Layer  updateTransactionCalJDBC(TransactionCal aTransactionCal) method");
            Factory factory = new Factory();            
            ITransactionCalService iTransactionCalMgrJDBC = (ITransactionCalService) factory.getTheService(ITransactionCalService.NAME);
            iTransactionCalMgrJDBC.updateTransactionJDBC(aTransactionCal);
            
        } catch (ServiceLoadException ex) {
          log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllTransactionCalJDBC()
    {
        ResultSet rs=null;
        List<TransactionCal> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllTransactionCalJDBC method");
            Factory factory = new Factory();
            ITransactionCalService iTransactionCalMgrJDBC = (ITransactionCalService) factory.getTheService(ITransactionCalService.NAME);
            rs=(ResultSet) iTransactionCalMgrJDBC.getAllTransactionsJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            log.info(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
               log.info(ex.getMessage());
        }
        return rs;
    }
    
    
    public void deleteTransactionCalJDBC(int transactionId)
    {
        try {
            System.out.println("In Business Layer deleteTransactionCalJDBC method");
            Factory factory = new Factory();
            ITransactionCalService iTransactionCalMgrJDBC = (ITransactionCalService) factory.getTheService(ITransactionCalService.NAME);
            iTransactionCalMgrJDBC.deleteTransactionJDBC(transactionId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
           log.info(ex.getMessage()); 
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
       
    public TransactionCalManager() {
    }
 
}
    
    

