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
import org.apache.log4j.Logger;
/**
 *
 * @author Dinham
 */
public class CustomerAddressJDBCImpl extends JDBCMainConfiguration implements ICustomerAddressService{
    
    private static final Logger log = Logger.getLogger(CustomerAddressJDBCImpl.class);
    Statement statement;


    @Override
    public void addCustomerAddress(CustomerAddress customerAddress) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCustomerAddress(CustomerAddress customerAddress) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerAddress getCustomerAddress(int addressId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerAddress> getAllCustomerAddresses() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCustomerAddress(Class<?> CustomerAddress, int addressId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCustomerAddressJDBC(CustomerAddress customerAddress) throws Exception {
        try {
            
                
        String insertCustomerAddress = "INSERT INTO customeraddress(street, community_parish, country) "
                + "values('" + customerAddress.getStreet() + 
                "', '" + customerAddress.getCommunity() +
                "', '" + customerAddress.getCountry() +"')";    
       
         statement = this.getConnection().createStatement();        
        statement.execute(insertCustomerAddress);      
        
        this.getConnection().close();
        
        } catch (Exception e) {
            
            log.info(e.getMessage());
        }
    }

    @Override
    public void updateCustomerAddressJDBC(CustomerAddress customerAddress) throws Exception {
        
        try {
                    
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
        
        } catch (Exception e) {
            
            log.info(e.getMessage());
            
        }
    }

    @Override
    public CustomerAddress getCustomerAddressJDBC(int addressId) throws Exception {
       
        CustomerAddress customerAddress = new CustomerAddress();
        
        try {
            
            
        String selectAccount = "Select * From customeraddress Where address_id = " + addressId;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectAccount);
        
        while(rs.next()){
        customerAddress.setAddressId(addressId);
        customerAddress.setStreet("street");
        customerAddress.setCommunity("community_parish");
        customerAddress.setCountry("country");
        }
        
        } catch (Exception e) {
            log.info(e.getMessage());
        }
                
        return customerAddress;
    }

    @Override
    public List<CustomerAddress> getAllCustomerAddressesJDBC() throws Exception {
         ResultSet rs=null;
        PreparedStatement ps;
        
        try {
            
        
        String SelectAll="Select * From customeraddress";
        //statement=this.getConnection().createStatement();
        ps=this.getConnection().prepareStatement(SelectAll, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=ps.executeQuery(SelectAll);
        
        } catch (Exception e) {
            
            log.info(e.getMessage());
        }
        
        
        return (List<CustomerAddress>) rs; 
    }

    @Override
    public void deleteCustomerAddressJDBC(int addressId) throws Exception {
        
        try {
          
        
        statement=this.getConnection().createStatement();
        statement.execute("Delete From customeraddress Where address_id  = " + addressId);  
        
        } catch (Exception e) {
            
            log.info(e.getMessage());
        }
    }
    
}
