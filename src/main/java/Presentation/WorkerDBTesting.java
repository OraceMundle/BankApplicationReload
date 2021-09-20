/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

//import CrudManager.WorkerManager;
import CrudManager.WorkerManager;
import Domain.Worker;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author OraceMundle
 */
public class WorkerDBTesting {
    
    //private static Logger logger = new Logger(); 
    
    private static Logger log = Logger.getLogger(AppPresentationConsole.class);
    //String url = ClassLoader.
    
    
     public static void main(String[] args)
    {
       PropertyConfigurator.configure("C:\\Users\\orace\\Documents\\NetBeansProjects\\BankApplicationReload\\src\\main\\resources\\log4j.properties");
        
        Scanner scan = new Scanner(System.in);
        
        int selectMethod=0;        
        while(selectMethod!=-1){
           System.out.println("What method, \n 1: JDBC \n 2: ORM \n 3: Exit");
           int choice = scan.nextInt();
           
           if(choice==1){
               try {
                   //call JDBC Menu
                   JDBCMenu();
               } catch (IOException ex) {
                   //System.out.println(ex.getMessage());
                   log.info(ex.getMessage());
               } 
               catch (Exception ex) {
                   log.info(ex.getMessage());
//Logger.getLogger(AppPresentationConsole.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           else if(choice==2)
           {
               try {
                   //call ORM Menu
                   ORMMenu();
               } catch (IOException ex) {
                  //System.out.println(ex.getMessage());
                  log.info(ex.getMessage());
               }
           }
           else if(choice==3)
           {
               //program Exit
               System.exit(0);
           }
        }
        
        
    }
    
    public static void JDBCMenu() throws IOException, SQLException
    {
        Scanner scanJDBC = new Scanner(System.in);
        
      //  Runtime.getRuntime().exec("cls");
        
        System.out.println("JDBC\n");
        System.out.println("1: Add Worker");
        System.out.println("2: Update Worker");
        System.out.println("3: Delete Worker");
        System.out.println("4: Select a Worker");
        System.out.println("5: Select all Workers");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Worker anWorker=new Worker();
            WorkerManager workerJDBC = new WorkerManager();
            
            
             Scanner aScanner = new Scanner(System.in);
            
            /*
            System.out.println("Enter TRN: ");
            anWorker.setTrn(aScanner.nextLine());
           */ 
                       
            System.out.println("Enter first name: ");
            anWorker.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anWorker.setLastname(aScanner.nextLine());
                                    
            System.out.println("Enter Email: ");
            anWorker.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anWorker.setTelephoneNumber(aScanner.nextLine());
            
            System.out.println("Enter Acount Number");
            anWorker.setAccountNumber(aScanner.nextInt());
            
            workerJDBC.addWorkerJDBC(anWorker);
            System.out.println("Worker Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Worker anWorker=new Worker();
            WorkerManager workerJDBC = new WorkerManager();
            
            Scanner aScanner = new Scanner(System.in);
            /*
             System.out.println("Enter Id: ");
            anWorker.setId(aScanner.nextInt());
            */
            
            System.out.println("Enter Id");
            anWorker.setId(aScanner.nextInt());
            
            System.out.println("Enter first name: ");
            anWorker.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anWorker.setLastname(aScanner.nextLine());
                                    
            System.out.println("Enter Email: ");
            anWorker.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anWorker.setTelephoneNumber(aScanner.nextLine());
            
            System.out.println("Enter Acount Number");
            anWorker.setAccountNumber(aScanner.nextInt());
            
            workerJDBC.updateWorkerJDBC(anWorker);
            System.out.println("Worker updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            WorkerManager workerJDBC = new WorkerManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter TRN: ");
            
            workerJDBC.deleteWorkerJDBC(aScanner.nextInt());
            System.out.println("Worker deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Worker anWorker=new Worker();
            WorkerManager workerJDBC = new WorkerManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter Id: ");
            int id = aScanner.nextInt();
            anWorker = workerJDBC.getWorkerJDBC(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Worker return using JDBC\n");
            System.out.println("Id: " + anWorker.getId()+"\n");
            System.out.println("First Name: " + anWorker.getFirstname()+"\n");
            System.out.println("Last Name: " + anWorker.getLastname()+"\n");
            System.out.println("Account Number: " + anWorker.getAccountNumber()+"\n");
            System.out.println("Email: " + anWorker.getEmail()+"\n");
            System.out.println("Telephone Number: " + anWorker.getTelephoneNumber()+"\n");
            
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            WorkerManager workerJDBC = new WorkerManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = workerJDBC.getAllWorkerJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of Workers return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getString("worker_id")+"\n");
            System.out.println("First Name: " + rs.getString("f_name")+"\n");
            System.out.println("Last Name: " + rs.getString("l_name")+"\n");
            System.out.println("Account Number: " + rs.getString("account_number")+"\n");
            System.out.println("Email: " + rs.getString("email")+"\n");
            System.out.println("Telephone Number: " + rs.getString("telephone")+"\n");
            
        }
        }
        else if(jdbcChoice==6)
        {
            return;
        }
        
        
    }
    
    public static void ORMMenu() throws IOException
    {
        Scanner scanORM = new Scanner(System.in);
        
       // Runtime.getRuntime().exec("cls");
       //System.out.flush();
        
       System.out.println("ORM\n");
        System.out.println("1: Add Worker");
        System.out.println("2: Update Worker");
        System.out.println("3: Delete Worker");
        System.out.println("4: Select an Worker");
        System.out.println("5: Select all Workers");
        System.out.println("6: Exit\n"); 
        
        int ormChoice=scanORM.nextInt();
        if(ormChoice==1)
        {
            Worker anWorker=new Worker();
            
            WorkerManager workerORM = new WorkerManager();
            
             Scanner aScanner = new Scanner(System.in);
            /*
             System.out.println("Enter Id: ");
            String trn=aScanner.nextLine();
            anWorker.setTrn(trn);
            */
            
            System.out.println("Enter first name: ");
            anWorker.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anWorker.setLastname(aScanner.nextLine());
                                    
            System.out.println("Enter Email: ");
            anWorker.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anWorker.setTelephoneNumber(aScanner.nextLine());
            
            System.out.println("Enter Acount Number");
            anWorker.setAccountNumber(aScanner.nextInt());
            
            workerORM.addWorker(anWorker);
            System.out.println("Worker Added Using ORM");
        }
        else if(ormChoice==2)
        {
            Worker anWorker=new Worker();
            WorkerManager workerORM = new WorkerManager();
            
               Scanner aScanner = new Scanner(System.in);
               /*
            System.out.println("Enter TRN: ");
            String trn=aScanner.nextLine();
            anWorker.setTrn(trn);

*/
            
            System.out.println("Enter first name: ");
            anWorker.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anWorker.setLastname(aScanner.nextLine());
                                    
            System.out.println("Enter Email: ");
            anWorker.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anWorker.setTelephoneNumber(aScanner.nextLine());
            
            System.out.println("Enter Acount Number");
            anWorker.setAccountNumber(aScanner.nextInt());
            
            workerORM.updateWorker(anWorker);
            System.out.println("Worker Updated Using ORM");
        }
        else if(ormChoice==3)
        {
            WorkerManager workerORM = new WorkerManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter TRN: ");
            
            workerORM.deleteWorker(Worker.class, aScanner.nextInt());
            System.out.println("Worker deleted using ORM");
        }
        else if(ormChoice==4)
        {
            Worker anWorker=new Worker();
            WorkerManager workerORM = new WorkerManager();            
            Scanner aScanner = new Scanner(System. in);
            
            System.out.println("Enter ID: ");
            anWorker = workerORM.getWorker(aScanner.nextInt());
            
            //Runtime.getRuntime().exec("cls");
            //System.out.flush();
            
            System.out.println("Worker return using ORM\n");
            System.out.println("ID: " + anWorker.getId()+"\n");
            System.out.println("First Name: " + anWorker.getFirstname()+"\n");
            System.out.println("Last Name: " + anWorker.getLastname()+"\n");
            System.out.println("Account Number: " + anWorker.getAccountNumber()+"\n");
            System.out.println("Email: " + anWorker.getEmail()+"\n");
            System.out.println("Telephone Number: " + anWorker.getTelephoneNumber()+"\n");
            
        }
        else if(ormChoice==5)
        {
            List<Worker> worker =new ArrayList();
            WorkerManager workerORM = new WorkerManager();            
            Scanner aScanner = new Scanner(System. in);
            
            
            worker = workerORM.getAllWorker();
            
            //Runtime.getRuntime().exec("cls");
            //System.out.flush();
            
            System.out.println("List of worker return using ORM\n");
            
            for(int i=0; i<worker.size(); i++){
            System.out.println("TRN: " + worker.get(i).getId()+"\n");
            System.out.println("First Name: " + worker.get(i).getFirstname()+"\n");
            System.out.println("Last Name: " + worker.get(i).getLastname()+"\n");
            System.out.println("Acount Number: " + worker.get(i).getAccountNumber()+"\n");
            System.out.println("Email: " + worker.get(i).getEmail()+"\n");
            System.out.println("Telephone Number: " + worker.get(i).getTelephoneNumber()+"\n");
            
            
            }
        }
        else if(ormChoice==6)
        {
            return;
        }
        
        
        
    }
    
    
    
    
    
    
    
    
}
