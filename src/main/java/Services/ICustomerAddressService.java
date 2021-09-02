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
    public void addAccount(CustomerAddress customerAddress ) throws Exception;
    
    public void updateAccount(CustomerAddress customerAddress) throws Exception;
    
    public CustomerAddress getAccount(int addressId)throws Exception;
    
    public List<CustomerAddress> getAllAccount() throws Exception;
    
    public void deleteAccount(Class<?> CustomerAddress, int addressId) throws Exception;
    
    
    
    //JDBC 
  public void addAccountJDBC(CustomerAddress customerAddress ) throws Exception;
    
    public void updateAccountJDBC(CustomerAddress customerAddress) throws Exception;
    
    public CustomerAddress getAccountJDBC(int addressId)throws Exception;
    
    public List<CustomerAddress> getAllAccountJDBC() throws Exception;
    
    public void deleteAccountJDBC(Class<?> CustomerAddress, int addressId) throws Exception;
    
            
    
    
}
