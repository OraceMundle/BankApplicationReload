/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

//Updates and correction to be made to ConnecttoServer, RemoteUser, WaitforConnection

//import CrudManager.ConnectionManager;
import CrudManager.CustomerManager;
import Domain.Customer;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StreamCorruptedException;
import java.net.ServerSocket;
import java.net.Socket;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;


/**
 *
 * @author DELL
 */


public class ConnectToServer implements Runnable{
  
    private static final Logger log = Logger.getLogger(ConnectToServer.class);
    private ServerSocket servSock;
    private Socket connection;
    private static ObjectInputStream is;
    private static ObjectOutputStream os;  
    private CustomerManager customerMgr;  
  
    
    
    public ConnectToServer()
    {     
        
    }
    
    @Override
   public void run()
    {
        new Thread(this).start();
        start();
    }
    
    public void start()
    { 
       
        this.createConnection();          
        this.waitForRequests();
       
    }
    
   
    
    public void createConnection()
    {
        try
        {
            this.servSock = new ServerSocket(59999);
            System.out.println("Server socket established");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
            log.info(ex.getMessage());
        }
    }
    
    public void getStreams()
    {
        try
        {
            
            this.os = new ObjectOutputStream(connection.getOutputStream());
            this.is = new ObjectInputStream(connection.getInputStream());
            System.out.println("Server streams connected to client streams");
          
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
            log.info(ex.getMessage());
        }
    }
    
    
    public void closeStreams()
    {
        try
        {
            os.close();
            is.close();
            connection.close();
            System.out.println("Server streams closed");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
            log.info(ex.getMessage());
        }
    }
    
    public void waitForRequests()
    {
        Customer customer=new Customer();
        try
        {
            while(true)
            {
                this.connection = servSock.accept();// server waits for connection from the client
                this.getStreams();
               //do
                //{
                    try
                    {                     
                        customer= (Customer) is.readObject();                  
                        if(!customer.getLastname().equals(""))
                        {
                           System.out.println("Customer's username is "+customer.getLastname());
                           //System.out.println("Student's email is "+student.getEmail());
                           //System.out.println("Student's school is "+student.getSchoolname());
                           customerMgr=new CustomerManager();
                           Boolean exist = customerMgr.validateUsernameAndPwd(customer);
                                                      
                           if(exist==true)
                           {
                               os.writeObject("User validated sucessfully");
                               Dashboard bankAppGUI=new Dashboard();
                               bankAppGUI.show();
                               
                               os.writeObject("Validation success");
                           }
                           else if(exist==false)
                           {
                               os.writeObject("User name or password incorrect");
                           }
                                   
                        }
                       
                    
                    }
                    catch(ClassNotFoundException ex)
                    {
                        ex.printStackTrace();
                        log.info(ex.getMessage());
                    }
                    catch(ClassCastException ex)
                    {
                        ex.printStackTrace();
                    } catch (Exception ex) {
                        log.info(ex.getMessage());
                    //Logger.getLogger(ConnectToServer.class.getName()).log(Level.SEVERE, null, ex);
                }
               // }while(student!=null);
                this.closeStreams();
            }
        }
        catch(StreamCorruptedException sce)
        {
            System.out.println(sce.getMessage());
        }
        catch(EOFException ex)
        {
                ex.printStackTrace();
                log.info(ex.getMessage());
        }
        catch(IOException ex)
        {
                ex.printStackTrace();
                log.info(ex.getMessage());
        }
           
    }
        
    }    
    
    

