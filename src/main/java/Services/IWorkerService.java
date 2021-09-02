/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Worker;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public interface IWorkerService extends IService{
    
     public final String NAME = "IWorkerService";
    
    //ORM  
    public void addAccount(Worker worker ) throws Exception;
    
    public void updateAccount(Worker worker) throws Exception;
    
    public Worker getAccount(String id)throws Exception;
    
    public List<Worker> getAllAccount() throws Exception;
    
    public void deleteAccount(Class<?> Worker, String id) throws Exception;
    
    
    
    //JDBC 
    public void addAccountJDBS(Worker worker ) throws Exception;
    
    public void updateAccountJDBC(Worker worker) throws Exception;
    
    public Worker getAccountJDBC(String id)throws Exception;
    
    public List<Worker> getAllAccountJDBC() throws Exception;
    
    public void deleteAccountJDBC(String id) throws Exception;
    
    
    
    
    
}
