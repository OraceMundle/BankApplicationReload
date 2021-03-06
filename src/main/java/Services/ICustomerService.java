/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Customer;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public interface ICustomerService extends IService{
    
    //ORM
    public final String NAME = "ICustomerService";
    
    public void addCustomer(Customer customer ) throws Exception;
    
    public void updateCustomer(Customer customer) throws Exception;
    
    public Customer getCustomer(String trn)throws Exception;
    
    public List<Customer> getAllCustomers() throws Exception;
    
    public void deleteCustomer(Class<?> Customer, String trn) throws Exception;
    
     public Customer getCustomerLogin(Customer user) throws Exception;
    
    
    
    //JDBC
    public void addCustomerJDBC(Customer customer ) throws Exception;
    
    public void updateCustomerJDBC(Customer customer) throws Exception;
    
    public Customer getCustomerJDBC(String trn)throws Exception;
    
    public ResultSet getAllCustomersJDBC() throws Exception;
    
    public void deleteCustomerJDBC(String trn) throws Exception;
    
    public Customer getCustomerLoginJDBC(Customer user) throws Exception;
    
            
}
