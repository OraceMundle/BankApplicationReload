/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Worker;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public interface IWorkerService extends IService{
    
     public final String NAME = "IWorkerService";
    
    //ORM  
    public void addWorker(Worker worker ) throws Exception;
    
    public void updateWorker(Worker worker) throws Exception;
    
    public Worker getWorker(String id)throws Exception;
    
    public List<Worker> getAllWorker() throws Exception;
    
    public void deleteWorker(Class<?> Worker, String id) throws Exception;
    
    public Worker getworkerLogin(Worker user) throws Exception;
    
    
    
    //JDBC 
    public void addWorkerJDBC(Worker worker ) throws Exception;
    
    public void updateWorkerJDBC(Worker worker) throws Exception;
    
    public Worker getWorkerJDBC(String id)throws Exception;
    
    public ResultSet getAllWorkerJDBC() throws Exception;
    
    public void deleteWorkerJDBC(String id) throws Exception;
    
   public Worker getworkerLoginJDBC(Worker user) throws Exception;
    
}
