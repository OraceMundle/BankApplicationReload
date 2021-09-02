/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

import Domain.WorkerLog;
import Services.IService;
import Services.IWorkerLogService;
import Services.IWorkerService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


/**
 *
 * @author Dinham
 */
public class WorkerLogJDBCImpl extends JDBCMainConfiguration implements IWorkerLogService {
    
    Statement statement;

    @Override
    public void addWorkerLog(WorkerLog workerLog) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateWorkerLog(WorkerLog workerLog) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WorkerLog getWorkerLog(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WorkerLog> getAllWorkerLog() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteWorkLog(Class<?> WorkerLog, int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addWorkerLogJDBC(WorkerLog workerLog) throws Exception {

        String insertWorkerLog = "INSERT INTO workerlog(message, date, worker_id) "
                + "values('" + workerLog.getMessage() + 
                "', '" + workerLog.getDate()+
                "', '" + workerLog.getWorkerId() +"')";    
       
         statement = this.getConnection().createStatement();        
        statement.execute(insertWorkerLog);      
        
        this.getConnection().close();         
    }

    @Override
    public void updateWorkerLogJDBC(WorkerLog workerLog) throws Exception {

        String updateWorkerLog = "UPDATE workerlog SET workerlog_id = '" + workerLog.getId() + 
                "', date = '" + workerLog.getDate() +
                "', l_name ='" + workerLog.getWorkerId() +
                "', email ='" + workerLog.getMessage()+"')";

        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateWorkerLog);
        if (rowsUpdated > 0) {
            System.out.println("Worker Log Update Successful");
        }
        
        this.getConnection().close();        
    }

    @Override
    public WorkerLog getWorkerLogJDBC(int id) throws Exception {

        String selectWorkerLog = "Select * From workerlog Where workerlog_id = " + id;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectWorkerLog);
        
        WorkerLog workerLog = new WorkerLog();
        workerLog.setDate("date");
        workerLog.setMessage("message");
        workerLog.setWorkerId("worker_id");
                        
        return workerLog;        
    }

    @Override
    public List<WorkerLog> getAllWorkerLogJDBC() throws Exception {

        ResultSet rs=null;
        PreparedStatement ps;
        
        String SelectAll="Select * From workerLog";
        //statement=this.getConnection().createStatement();
        ps=this.getConnection().prepareStatement(SelectAll, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=ps.executeQuery(SelectAll);
        
        
        return (List<WorkerLog>) rs;          
    }

    @Override
    public void deleteWorkLogJDBC(int id) throws Exception {

        statement=this.getConnection().createStatement();
        statement.execute("Delete From workerlog Where workerlog_id  = " + id);        
    }
    
}
