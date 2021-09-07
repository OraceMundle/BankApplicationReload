/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

import Domain.Customer;
import Services.ICustomerService;
import Services.IService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.    
        
    
    }

    @Override
    public void updateCustomer(Customer customer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomer(String trn) throws Exception {
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
        
     String insertCustomer = "INSERT INTO customer(trn, f_name, l_name, email, telephone_number, dob) "
                + "values('" + customer.getTrn() + 
                "', '" + customer.getFirstname() +
                "', '" + customer.getLastname() + 
              "', '" + customer.getEmail()+ 
                "', '" + customer.getTelephoneNum() + 
                "', '" + customer.getDob()+"')";    
    
       
         statement = this.getConnection().createStatement();        
        statement.execute(insertCustomer);      
        
        this.getConnection().close();       
       
        
        
    }

    @Override
    public void updateCustomerJDBC(Customer customer) throws Exception {
         
        String updateCustomer = "UPDATE customer SET"   + 
                " f_name = '" + customer.getFirstname() +
                "', l_name = '" + customer.getLastname() + 
                "', email =  '" + customer.getEmail() +
                "', telephone_number = '" + customer.getTelephoneNum() + 
                "', dob = '" + customer.getDob()+"' Where trn = '" + customer.getTrn()+"'"; 
        
        
          
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateCustomer);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
        
    }

    @Override
    public Customer getCustomerJDBC(String trn) throws Exception {
            String selectCustomer = "SELECT * FROM customer WHERE trn = " + trn;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectCustomer);
        
        Customer customer=new Customer();
        customer.setTrn(trn);
        customer.setFirstname(rs.getString("f_name"));
        customer.setLastname(rs.getString("l_name"));
        customer.setEmail(rs.getString("email"));
        customer.setTelephoneNum(rs.getString("telephone_number"));
        customer.setDob(rs.getString("dob"));
        
        return customer;
        

    }

    @Override
    public List<Customer> getAllCustomersJDBC() throws Exception {
         ResultSet rs=null;
        PreparedStatement ps;
        
        String SelectAll="SELECT * FROM customer";
        //statement=this.getConnection().createStatement();
        ps=this.getConnection().prepareStatement(SelectAll, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=ps.executeQuery(SelectAll);
        
        
        return (List<Customer>) rs;
          
    }
    
    

    @Override
    public void deleteCustomerJDBC(String trn) throws Exception {
        statement=this.getConnection().createStatement();
        statement.execute("Delete From customer Where trn  = " + trn);
    }

    @Override
    public Customer getCustomerLogin(Customer user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomerLoginJDBC(Customer user) throws Exception {
        
       //Method to authenticate Worker User
    
	//Session session = this.getSession();//hibernate.getSessionFactory();
	//session.beginTransaction(); 
				
	String password = user.getTrn();
	String name = user.getLastname();
                
			   
	String loginQuery = " SELECT * from  customer where l_name  = '" + name + "' and trn = '" + password +"'";
			   	
                
                statement=this.getConnection().createStatement();
        
               
                    Customer customer = new Customer();
                    ResultSet rs=statement.executeQuery(loginQuery);
                    if(rs==null){
                        customer.setLastname("unknown");
                        customer.setTrn("unknown");
                        }
                    
                    else if(rs!=null) 
                    {
                        while(rs.next()){
                        customer.setLastname(rs.getString("l_name"));
                        customer.setTrn(rs.getString("trn"));
                        System.out.println(customer.getLastname());
                        System.out.println(customer.getTrn());
                         }
                    }
                  /*  workerLogin.getWorkerId();
                    workerLogin.getAttempts();
                    workerLogin.getMessage();
                    workerLogin.getPassword();
                    workerLogin.getWorkerIdNumbere();
                    workerLogin.getWorkerUserName();
                    */
                return customer; 
        
         
        
        
        
        
        
        
    }
    
}
