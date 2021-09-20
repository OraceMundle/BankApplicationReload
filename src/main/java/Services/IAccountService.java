/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Account;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public interface IAccountService extends IService{
    
     public final String NAME = "IAccountService";
    
    //ORM  
    public void addAccount(Account account ) throws Exception;
    
    public void updateAccount(Account account) throws Exception;
    
    public Account getAccount(int accountnumber)throws Exception;
    
    public List<Account> getAllAccount() throws Exception;
    
    public void deleteAccount(Class<?> Account, int accountnumber) throws Exception;
    
    
    
    //JDBC 
    public void addAccountJDBC(Account account ) throws Exception;
    
    public void updateAccountJDBC(Account account) throws Exception;
    
    public Account getAccountJDBC(int accountnumber)throws Exception;
     
    public ResultSet getAllAccountJDBC() throws Exception;
    
    public void deleteAccountJDBC(int accountnumber) throws Exception;
    
            
    
    
}
