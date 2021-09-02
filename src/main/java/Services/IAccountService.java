/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Account;
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
    
    public Account getAccount(String accountnumber)throws Exception;
    
    public List<Account> getAllAccount() throws Exception;
    
    public void deleteAccount(Class<?> Account, String accountnumber) throws Exception;
    
    
    
    //JDBC 
    public void addAccountJDBC(Account account ) throws Exception;
    
    public void updateAccountJDBC(Account account) throws Exception;
    
    public Account getAccountJDBC(String accountnumber)throws Exception;
     
    public List<Account> getAllAccountJDBC() throws Exception;
    
    public void deleteAccountJDBC(Class<?> Account, String accountnumber) throws Exception;
    
            
    
    
}
