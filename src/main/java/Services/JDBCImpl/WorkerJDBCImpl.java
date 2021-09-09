 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

import Domain.Worker;
import Services.IService;
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
public class WorkerJDBCImpl extends JDBCMainConfiguration implements IWorkerService{
    
    private static final Logger log = Logger.getLogger(WorkerJDBCImpl.class);
    Statement statement;


    @Override
    public void addWorker(Worker worker) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateWorker(Worker worker) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Worker getWorker(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Worker> getAllWorker() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteWorker(Class<?> Worker, String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addWorkerJDBC(Worker worker) throws Exception {
        
        try {
            
                  
        String insertWorker = "INSERT INTO worker(f_name, l_name, telephone, email) "
                + "values('" + worker.getFirstname() + 
                "', '" + worker.getLastname() +
                "', '" + worker.getTelephoneNumber()   +//getTelephoneNumber() +
                "', '" + worker.getEmail() +"')";    
       
         statement = this.getConnection().createStatement();        
        statement.execute(insertWorker);      
        
        this.getConnection().close(); 
        
         } catch (Exception e) {
             log.info(e.getMessage());
        }
    }

    @Override
    public void updateWorkerJDBC(Worker worker) throws Exception {
        
        try {
            
                String updateWorker = "UPDATE worker SET worker_id = '" + worker.getId() + 
                "', f_name = '" + worker.getFirstname() +
                "', l_name ='" + worker.getLastname() +
                "', telephone ='" + worker.getTelephoneNumber() +
                "', email ='" + worker.getEmail()+"')";

        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateWorker);
        if (rowsUpdated > 0) {
            System.out.println("Worker Update Successful");
        }
        
        this.getConnection().close(); 
        } catch (Exception e) {
            
            log.info(e.getMessage());
        }
    }

    @Override
    public Worker getWorkerJDBC(String id) throws Exception {
        
        Worker worker = new Worker();
        
        try {
            
          
        String selectWorker = "Select * From worker Where worker_id = " + id;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectWorker);
        
        while(rs.next()){
        worker.setId(id);
        worker.setFirstname("f_name");
        worker.setLastname("l_name");
        worker.setTelephoneNumber("telephone");
        worker.setEmail("email");
        }
                
         } catch (Exception e) {
             log.info(e.getMessage());
        }
        return worker;
    }

    @Override
    public ResultSet getAllWorkerJDBC() throws Exception {
        ResultSet rs=null;
        PreparedStatement ps;
        
        try {
            
       
        String SelectAll="Select * From worker";
        //statement=this.getConnection().createStatement();
        ps=this.getConnection().prepareStatement(SelectAll, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=ps.executeQuery(SelectAll);
        
         } catch (Exception e) {
             
        }
        return  rs; 
    }

    @Override
    public void deleteWorkerJDBC(String id) throws Exception {
        try {
            
        statement=this.getConnection().createStatement();
        statement.execute("Delete From worker Where worker_id  = " + id);  
        
        } catch (Exception e) {
            
            log.info(e.getMessage());
        }
    }
    
    @Override
    public Worker getworkerLoginJDBC(Worker user) throws Exception {
        
        //Method to authenticate Worker User
    	 
	Worker worker = new Worker();			
	String password = user.getLastname();
	String name = user.getId();
        
        try {
            
       
			   
	String loginQuery = " select * from  worker where l_name  = '" + name + "' and worker_id = '" + password +"'";
	//WorkerLogin work = null; 
	  	
                //String selectWorkerLogin = "Select * From worker_log Where worker_id = " + user.getWorkerId();
                statement=this.getConnection().createStatement();
                    
                    ResultSet rs=statement.executeQuery(loginQuery);
                    if(rs==null){
                        worker.setLastname("unknown");
                        worker.setId("unknown");
                        }
                    
                    else if(rs!=null) 
                    {
                        while(rs.next()){
                        worker.setLastname(rs.getString("l_name"));
                        worker.setId(rs.getString("work_id"));
                        System.out.println(rs.getString("l_name"));
                        System.out.println(rs.getString("work_id"));
                         }
                    }
                                  
                   } catch (Exception e) {
                       log.info(e.getMessage());
        }
                return worker; 
        
        
        
    }

    @Override
    public Worker getworkerLogin(Worker user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
