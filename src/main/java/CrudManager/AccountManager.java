/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Account;
import Services.Exceptions.ServiceLoadException;
import Services.Factory;
import Services.IAccountService;
import Services.SpringConfig;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author OraceMundle
 */
public class AccountManager {
    
    private static final Logger log = Logger.getLogger(AccountManager.class);
    
     ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    
     public void addAccount(Account aAccount)
    {
        PropertyConfigurator.configure("C:\\Users\\orace\\Documents\\NetBeansProjects\\BankApplicationReload\\src\\main\\resources\\log4j.properties");
        
        
        try {
            
            System.out.println("In Business Layer addAccount(Account aAccount) method");
            log.info("In Business Layer addAccount(Account aAccount) method");
            //Factory factory = new Factory();
            //IAccountService iAccountMgr = (IAccountService) factory.getTheService(IAccountService.NAME);
            
            IAccountService iAccountMgr=(IAccountService)context.getBean("AccountORM");
            iAccountMgr.addAccount(aAccount);
        } catch (ServiceLoadException ex) {
          
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
    }
    public Account getAccount(String trn)
    {
        Account aAccount=new Account();
        try {
            System.out.println("In Business Layer getAccount(String trn) method");
            //Factory factory = new Factory();
            //IAccountService iAccountMgr = (IAccountService) factory.getTheService(IAccountService.NAME);
            
            IAccountService iAccountMgr=(IAccountService)context.getBean("AccountORM");
            aAccount=iAccountMgr.getAccount(trn);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
          log.info(ex.getMessage());
            
        } catch (Exception ex) {
            
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
        return aAccount;
    }
    
    public void updateAccount(Account aAccount)
    {
        try {
            System.out.println("In Business Layer updateAccount(Account aAccount) method");
            //Factory factory = new Factory();
            //IAccountService iAccountMgr = (IAccountService) factory.getTheService(IAccountService.NAME);
            
            IAccountService iAccountMgr=(IAccountService)context.getBean("AccountORM");
            iAccountMgr.updateAccount(aAccount);
            
        } catch (ServiceLoadException ex) {
          
            log.info(ex.getMessage());
           System.out.println(ex.getMessage());
        } catch (Exception ex) {
            
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
    }
    
    public List<Account> getAllAccount()
    {
        List<Account> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllAccount method");
            //Factory factory = new Factory();
            //IAccountService iAccountMgr = (IAccountService) factory.getTheService(IAccountService.NAME);
            
            IAccountService iAccountMgr=(IAccountService)context.getBean("AccountORM");
            customerList=iAccountMgr.getAllAccount();
            
        } catch (ServiceLoadException ex) {
          
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        }
        return customerList;
    }
    
    
    public void deleteAccount(Class<?> Account, String trn)
    {
        try {
            System.out.println("In Business Layer deleteAccount method");
            //Factory factory = new Factory();
            //IAccountService iAccountMgr = (IAccountService) factory.getTheService(IAccountService.NAME);
            
            IAccountService iAccountMgr=(IAccountService)context.getBean("AccountORM");
            iAccountMgr.deleteAccount(Account, trn);            
        } catch (ServiceLoadException ex) {
            
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    
    public void addAccountJDBC(Account anAccount)
    {
        try {
            System.out.println("In Business Layer addAccountJDBC(Account account) method");
            Factory factory = new Factory();            
            IAccountService iAccountMgrJDBC = (IAccountService) factory.getTheService(IAccountService.NAME);
            iAccountMgrJDBC.addAccountJDBC(anAccount);
            System.out.println(anAccount.getBalance());
            
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
    }
    public Account getAccountJDBC(String trn)
    {
        Account aAccount=new Account();
        try {
            System.out.println("In Business Layer getAccountJDBC(String trn) method");
            Factory factory = new Factory();           
            IAccountService iAccountMgrJDBC = (IAccountService) factory.getTheService(IAccountService.NAME);
            aAccount=iAccountMgrJDBC.getAccountJDBC(trn);
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
            
        }
        return aAccount;
    }
    
    public void updateAccountJDBC(Account aAccount)
    {
        try {
            System.out.println("In Business Layer  updateAccountJDBC(Account aAccount) method");
            Factory factory = new Factory();            
            IAccountService iAccountMgrJDBC = (IAccountService) factory.getTheService(IAccountService.NAME);
            iAccountMgrJDBC.updateAccountJDBC(aAccount);
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            log.info(ex.getMessage());
           System.out.println(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllAccountJDBC()
    {
        ResultSet rs=null;
        List<Account> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllAccountJDBC method");
            Factory factory = new Factory();
            IAccountService iAccountMgrJDBC = (IAccountService) factory.getTheService(IAccountService.NAME);
            rs=(ResultSet) iAccountMgrJDBC.getAllAccountJDBC();
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());            
        }
        return rs;
    }
    
    
    public void deleteAccount(String trn)
    {
        try {
            System.out.println("In Business Layer deleteAccountJDBC method");
            Factory factory = new Factory();
            IAccountService iAccountMgrJDBC = (IAccountService) factory.getTheService(IAccountService.NAME);
            iAccountMgrJDBC.deleteAccountJDBC(trn);
            
        } catch (ServiceLoadException ex) {
            log.info(ex.getMessage());
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            log.info(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
       
    public AccountManager() {
    }
 
    
    
}
