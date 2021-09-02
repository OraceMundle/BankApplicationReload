/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

import Domain.CustomerAddress;
import Services.IAccountService;
import Services.ICustomerAddressService;
import Services.ICustomerService;
import Services.IService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Dinham
 */
public class CustomerAddressJDBCImpl extends JDBCMainConfiguration implements ICustomerAddressService{
    
    Statement statement;

    @Override
    public void addAccount(CustomerAddress customerAddress) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAccount(CustomerAddress customerAddress) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerAddress getAccount(int addressId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerAddress> getAllAccount() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAccount(Class<?> CustomerAddress, int addressId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAccountJDBC(CustomerAddress customerAddress) throws Exception {
      
        String insertCustomerAddress = "INSERT INTO customeraddress(street, community_parish, country) "
                + "values('" + customerAddress.getStreet() + 
                "', '" + customerAddress.getCommunity() +
                "', '" + customerAddress.getCountry() +"')";    
       
         statement = this.getConnection().createStatement();        
        statement.execute(insertCustomerAddress);      
        
        this.getConnection().close();
    }

    @Override
    public void updateAccountJDBC(CustomerAddress customerAddress) throws Exception {

        String updateCustomerAddress = "UPDATE customeraddress SET address_id = '" + customerAddress.getAddressId() + 
                "', street = '" + customerAddress.getStreet() +
                "', community_parish ='" + customerAddress.getCommunity() + 
                "', country ='" + customerAddress.getCountry()+"')";    
          
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateCustomerAddress);
        if (rowsUpdated > 0) {
            System.out.println("Customer Address Update Successful");
        }
        
        this.getConnection().close();        
    }

    @Override
    public CustomerAddress getAccountJDBC(int addressId) throws Exception {
            
        String selectAccount = "Select * From customeraddress Where address_id = " + addressId;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectAccount);
        
        CustomerAddress customerAddress = new CustomerAddress();
        customerAddress.setStreet("street");
        customerAddress.setCommunity("community_parish");
        customerAddress.setCountry("country");
                
        return customerAddress;   
    }

    @Override
    public List<CustomerAddress> getAllAccountJDBC() throws Exception {

        ResultSet rs=null;
        PreparedStatement ps;
        
        String SelectAll="Select * From customeraddress";
        //statement=this.getConnection().createStatement();
        ps=this.getConnection().prepareStatement(SelectAll, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=ps.executeQuery(SelectAll);
        
        
        return (List<CustomerAddress>) rs;        
    }

    @Override
    public void deleteAccountJDBC(Class<?> CustomerAddress, int addressId) throws Exception {

        statement=this.getConnection().createStatement();
        statement.execute("Delete From customeraddress Where address_id  = " + addressId);        
    }
    
}
