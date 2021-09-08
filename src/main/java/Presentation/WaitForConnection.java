/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.apache.log4j.Logger;
/**
 *
 * @author DELL
 */


public class WaitForConnection {
    
    public static final Logger log = Logger.getLogger(WaitForConnection.class);
    
    public static void main(String args[])
    {
     
        try {
                    ConnectToServer connect=new ConnectToServer();
                    connect.start();
            
        } catch (Exception e) {
            log.info(e.getMessage());
        }
     
        
    }
}
