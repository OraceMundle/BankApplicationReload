/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import Domain.WorkerLog;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public interface IWorkerLogService extends IService{
    
    //ORM
    public final String NAME = "IWorkerLogService";
    
    public void addWorkerLog(WorkerLog workerLog ) throws Exception;
    
    public void updateWorkerLog(WorkerLog workerLog) throws Exception;
    
    public WorkerLog getWorkerLog(int id)throws Exception;
    
    public List<WorkerLog> getAllWorkerLog() throws Exception;
    
    public void deleteWorkLog(Class<?> WorkerLog, int id) throws Exception;
    
    
    
    //JDBC
     public void addWorkerLogJDBC(WorkerLog workerLog ) throws Exception;
    
    public void updateWorkerLogJDBC(WorkerLog workerLog) throws Exception;
    
    public WorkerLog getWorkerLogJDBC(int id)throws Exception;
    
    public List<WorkerLog> getAllWorkerLogJDBC() throws Exception;
    
    public void deleteWorkLogJDBC(int id) throws Exception;
    
}
