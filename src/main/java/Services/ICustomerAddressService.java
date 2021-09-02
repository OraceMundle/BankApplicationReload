/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.CustomerAddress;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public interface ICustomerAddressService extends IService{
    
    public final String NAME = "ICustomerAddressService";
    
    //ORM  
    public void addCustomerAddress(CustomerAddress customerAddress ) throws Exception;
    
    public void updateCustomerAddress(CustomerAddress customerAddress) throws Exception;
    
    public CustomerAddress getCustomerAddress(int addressId)throws Exception;
    
    public List<CustomerAddress> getAllCustomerAddresses() throws Exception;
    
    public void deleteCustomerAddress(Class<?> CustomerAddress, int addressId) throws Exception;
    
    
    
    //JDBC 
   public void addCustomerAddressJDBC(CustomerAddress customerAddress ) throws Exception;
    
    public void updateCustomerAddressJDBC(CustomerAddress customerAddress) throws Exception;
    
    public CustomerAddress getCustomerAddressJDBC(int addressId)throws Exception;
    
    public List<CustomerAddress> getAllCustomerAddressesJDBC() throws Exception;
    
    public void deleteCustomerAddressJDBC(int addressId) throws Exception;
    
            
    
    
}
