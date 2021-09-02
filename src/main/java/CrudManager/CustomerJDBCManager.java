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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public class CustomerJDBCManager {
    
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

    public CustomerJDBCManager() {
    }
    
    
}
