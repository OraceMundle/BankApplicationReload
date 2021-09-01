/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

import Domain.Customer;
import Services.ICustomerService;
import Services.IService;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public class CustomerJDBCImpl extends JDBCMainConfiguration implements ICustomerService{

    Statement statement;
    
    @Override
    public void addCustomer(Customer customer) throws Exception {
    String insertAuthor = "INSERT INTO customer(trn, f_name, l_name, email, telephone_nmunber, dob) "
                + "values('" + customer.getTrn() + 
                "', '" + customer.getFirstname() +
                "', '" + customer.getLastname() + 
                "', '" + customer.getTelephoneNum() + 
                "', '" + customer.getDob()+"')";    
    
       
         statement = this.getConnection().createStatement();        
        statement.execute(insertAuthor);      
        
        this.getConnection().close();       
    
    }

    @Override
    public void updateCustomer(Customer customer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer geCustomer(String trn) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getAllCustomers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCustomer(Class<?> Customer, String trn) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCustomerJDBC(Customer customer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCustomerJDBC(Customer customer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer geCustomerJDBC(String trn) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getAllCustomersJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCustomerJDBC(String trn) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
