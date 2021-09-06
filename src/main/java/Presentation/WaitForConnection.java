/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author DELL
 */


public class WaitForConnection {
    
    public static void main(String args[])
    {
     
    
     ConnectToServer connect=new ConnectToServer();
     connect.start();
        
    }
}
