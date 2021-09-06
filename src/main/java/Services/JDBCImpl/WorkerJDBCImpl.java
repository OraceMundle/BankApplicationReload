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

/**
 *
 * @author Dinham
 */
public class WorkerJDBCImpl extends JDBCMainConfiguration implements IWorkerService{
    
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
        String insertWorker = "INSERT INTO worker(f_name, l_name, telephone, email) "
                + "values('" + worker.getFirstname() + 
                "', '" + worker.getLastname() +
                "', '" + worker.getTelephoneNumber()   +//getTelephoneNumber() +
                "', '" + worker.getEmail() +"')";    
       
         statement = this.getConnection().createStatement();        
        statement.execute(insertWorker);      
        
        this.getConnection().close(); 
    }

    @Override
    public void updateWorkerJDBC(Worker worker) throws Exception {
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
    }

    @Override
    public Worker getWorkerJDBC(String id) throws Exception {
        String selectWorker = "Select * From worker Where worker_id = " + id;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectWorker);
        
        Worker worker = new Worker();
        worker.setFirstname("f_name");
        worker.setLastname("l_name");
        worker.setTelephoneNumber("telephone");
        worker.setEmail("email");
                
        return worker;
    }

    @Override
    public List<Worker> getAllWorkerJDBC() throws Exception {
        ResultSet rs=null;
        PreparedStatement ps;
        
        String SelectAll="Select * From worker";
        //statement=this.getConnection().createStatement();
        ps=this.getConnection().prepareStatement(SelectAll, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=ps.executeQuery(SelectAll);
        
        
        return (List<Worker>) rs; 
    }

    @Override
    public void deleteWorkerJDBC(String id) throws Exception {
        statement=this.getConnection().createStatement();
        statement.execute("Delete From worker Where worker_id  = " + id);  
    }
    
    @Override
    public Worker getworkerLoginJDBC(Worker user) throws Exception {
        
        //Method to authenticate Worker User
    
	//Session session = this.getSession();//hibernate.getSessionFactory();
	//session.beginTransaction(); 
				
	String password = user.getLastname();
	String name = user.getId();
			   
	String loginQuery = " select * from  worker where l_name  = '" + name + "' and worker_id = '" + password +"'";
	//WorkerLogin work = null; 
		       
	//TypedQuery< WorkerLogin> typedQuery = session.createQuery(loginQuery,  WorkerLogin.class);
	//work = loginQuery.get
	           
		        	
                //String selectWorkerLogin = "Select * From worker_log Where worker_id = " + user.getWorkerId();
                statement=this.getConnection().createStatement();
        
                //ResultSet rs=statement.executeQuery(selectWorkerLogin);
                    
                    Worker worker = new Worker();
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
                  /*  workerLogin.getWorkerId();
                    workerLogin.getAttempts();
                    workerLogin.getMessage();
                    workerLogin.getPassword();
                    workerLogin.getWorkerIdNumbere();
                    workerLogin.getWorkerUserName();
                    */
                return worker; 
        
        
        
    }

    @Override
    public Worker getworkerLogin(Worker user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
