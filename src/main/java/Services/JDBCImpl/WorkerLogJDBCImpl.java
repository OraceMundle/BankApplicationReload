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
import org.apache.log4j.Logger;

/**
 *
 * @author Dinham
 */
public class WorkerLogJDBCImpl extends JDBCMainConfiguration implements IWorkerLogService {
    
    public static final Logger log = Logger.getLogger(WorkerLogJDBCImpl.class);
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

        try {
          
                String insertWorkerLog = "INSERT INTO workerlog(workerlog_id, message, date, worker_id) "
                + "values('"+ workerLog.getId()+
                 "','" + workerLog.getMessage() + 
                "', '" + workerLog.getDate()+
                "', '" + workerLog.getWorkerId() +"')";    
       
         statement = this.getConnection().createStatement();        
        statement.execute(insertWorkerLog);      
        
        this.getConnection().close();    
        
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }

    @Override
    public void updateWorkerLogJDBC(WorkerLog workerLog) throws Exception {

        try {
            
       
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
        
         } catch (Exception e) {
             
             log.info(e.getMessage());
        }
    }

    @Override
    public WorkerLog getWorkerLogJDBC(int id) throws Exception {

        WorkerLog workerLog = new WorkerLog();
        
        try {
        
        String selectWorkerLog = "Select * From workerlog Where workerlog_id = " + id;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectWorkerLog);
        
        while(rs.next())
        {
        workerLog.setId(id);
        workerLog.setDate("date");
        workerLog.setMessage("message");
        workerLog.setWorkerId("worker_id");
        }
        
        } catch (Exception e) {
            
            log.info(e.getMessage());
        }
        return workerLog;        
    }

    @Override
    public ResultSet getAllWorkerLogJDBC() throws Exception {

        ResultSet rs=null;
        PreparedStatement ps;
        
        try {
         
        String SelectAll="Select * From workerLog";
        //statement=this.getConnection().createStatement();
        ps=this.getConnection().prepareStatement(SelectAll, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=ps.executeQuery(SelectAll);
        
        } catch (Exception e) {
            
            log.info(e.getMessage());
        }
        
        return  rs;          
    }

    @Override
    public void deleteWorkLogJDBC(int id) throws Exception {

        try {
        
        statement=this.getConnection().createStatement();
        statement.execute("Delete From workerlog Where workerlog_id  = " + id);  
        
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }
    
}
