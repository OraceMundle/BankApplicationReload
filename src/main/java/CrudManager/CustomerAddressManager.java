/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.CustomerAddress;
import Services.Exceptions.ServiceLoadException;
import Services.Factory;
import Services.ICustomerAddressService;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public class CustomerAddressManager {
    
      public void addCustomerAddress(CustomerAddress aCustomerAddress)
    {
        try {
            
            System.out.println("In Business Layer addCustomerAddress(CustomerAddress aCustomerAddress) method");
            Factory factory = new Factory();
            ICustomerAddressService iBookMgr = (ICustomerAddressService) factory.getTheService(ICustomerAddressService.NAME);
            iBookMgr.addCustomerAddress(aCustomerAddress);
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    public CustomerAddress getCustomerAddress(int addressId)
    {
        CustomerAddress aCustomerAddress=new CustomerAddress();
        try {
            System.out.println("In Business Layer getCustomerAddress(String trn) method");
            Factory factory = new Factory();
            ICustomerAddressService iCustomerAddressMgr = (ICustomerAddressService) factory.getTheService(ICustomerAddressService.NAME);
            aCustomerAddress=iCustomerAddressMgr.getCustomerAddressJDBC(addressId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
        return aCustomerAddress;
    }
    
    public void updateCustomerAddress(CustomerAddress aCustomerAddress)
    {
        try {
            System.out.println("In Business Layer updateCustomerAddress(CustomerAddress aCustomerAddress) method");
            Factory factory = new Factory();
            ICustomerAddressService iCustomerAddressMgr = (ICustomerAddressService) factory.getTheService(ICustomerAddressService.NAME);
            iCustomerAddressMgr.updateCustomerAddress(aCustomerAddress);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage());
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public List<CustomerAddress> getAllCustomerAddress()
    {
        List<CustomerAddress> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllCustomerAddress method");
            Factory factory = new Factory();
            ICustomerAddressService iCustomerAddressMgr = (ICustomerAddressService) factory.getTheService(ICustomerAddressService.NAME);
            customerList=iCustomerAddressMgr.getAllCustomerAddresses();
            
        } catch (ServiceLoadException ex) {
          
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
        return customerList;
    }
    
    
    public void deleteCustomerAddress(Class<?> CustomerAddress, int addressId)
    {
        try {
            System.out.println("In Business Layer deleteCustomerAddress method");
            Factory factory = new Factory();
            ICustomerAddressService iCustomerAddressMgr = (ICustomerAddressService) factory.getTheService(ICustomerAddressService.NAME);
            iCustomerAddressMgr.deleteCustomerAddress(CustomerAddress, addressId);            
        } catch (ServiceLoadException ex) {
            System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }

    
    public void addCustomerAddressJDBC(CustomerAddress anCustomerAddress)
    {
        try {
            System.out.println("In Business Layer addCustomerAddressJDBC(CustomerAddress customer) method");
            Factory factory = new Factory();            
            ICustomerAddressService iCustomerAddressMgrJDBC = (ICustomerAddressService) factory.getTheService(ICustomerAddressService.NAME);
            iCustomerAddressMgrJDBC.addCustomerAddressJDBC(anCustomerAddress);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    public CustomerAddress getCustomerAddressJDBC(int addressId)
    {
        CustomerAddress aCustomerAddress=new CustomerAddress();
        try {
            System.out.println("In Business Layer getCustomerAddressJDBC(String trn) method");
            Factory factory = new Factory();           
            ICustomerAddressService iCustomerAddressMgrJDBC = (ICustomerAddressService) factory.getTheService(ICustomerAddressService.NAME);
            aCustomerAddress=iCustomerAddressMgrJDBC.getCustomerAddressJDBC(addressId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return aCustomerAddress;
    }
    
    public void updateCustomerAddressJDBC(CustomerAddress aCustomerAddress)
    {
        try {
            System.out.println("In Business Layer  updateCustomerAddressJDBC(CustomerAddress aCustomerAddress) method");
            Factory factory = new Factory();            
            ICustomerAddressService iCustomerAddressMgrJDBC = (ICustomerAddressService) factory.getTheService(ICustomerAddressService.NAME);
            iCustomerAddressMgrJDBC.updateCustomerAddressJDBC(aCustomerAddress);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllCustomerAddressJDBC()
    {
        ResultSet rs=null;
        List<CustomerAddress> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllCustomerAddressJDBC method");
            Factory factory = new Factory();
            ICustomerAddressService iCustomerAddressMgrJDBC = (ICustomerAddressService) factory.getTheService(ICustomerAddressService.NAME);
            rs=(ResultSet) iCustomerAddressMgrJDBC.getAllCustomerAddressesJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());            
        }
        return rs;
    }
    
    
    public void deleteCustomerAddress(int addressId)
    {
        try {
            System.out.println("In Business Layer deleteCustomerAddressJDBC method");
            Factory factory = new Factory();
            ICustomerAddressService iCustomerAddressMgrJDBC = (ICustomerAddressService) factory.getTheService(ICustomerAddressService.NAME);
            iCustomerAddressMgrJDBC.deleteCustomerAddressJDBC(addressId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }
    
       
    public CustomerAddressManager() {
    }
 
    
    
}
    

