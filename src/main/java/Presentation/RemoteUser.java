/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

//Updates and correction to be made to ConnecttoServer, RemoteUser, WaitforConnection


import Domain.Customer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author DELL
 */
public class RemoteUser {
    private static final Logger log = Logger.getLogger(AddAccountPrompt.class);
    
    
private static ObjectInputStream is;
    private static ObjectOutputStream os;
    private Socket connection;
    
    public RemoteUser()
    {
        this.createConnection();
        this.getStreams();
    }
    
    public void createConnection()
    {
        try
        {
            this.connection = new Socket("127.0.0.1", 59999);
            System.out.println("Client Connection Established with Server");
        }
        catch(UnknownHostException ex)
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
    
    public void getStreams()
    {
        try
        {
            this.os = new ObjectOutputStream(connection.getOutputStream());
            this.is = new ObjectInputStream(connection.getInputStream());
            System.out.println("Client Streams Established with Server Streams");
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
            System.out.println("Client ends connection with server");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
            log.info(ex.getMessage());
        }
    }
    
    public void sendUser(Customer customer)
    {
       
        try
        {
            System.out.println("creating Customer on client");
            os.writeObject(customer);
            
            System.out.println("Customer sent to server");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
            log.info(ex.getMessage());
        }
    }
    
    /*public void sendInteger(int num)
    {
        try
        {
            os.writeObject(num);
            System.out.println("Client sends integer to server");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }*/
    
    public String receiveResponse()
    {
        String response="";
        try
        {
            response = (String)is.readObject();
            System.out.println("Server's response "+response);
            
        }
        catch(ClassCastException ex)
        {
            ex.printStackTrace();
            log.info(ex.getMessage());
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
            log.info(ex.getMessage());
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
            log.info(ex.getMessage());
        }
       return response;
    }
    
}
