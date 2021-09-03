/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import CrudManager.CustomerJDBCManager;
import CrudManager.CustomerManager;
import Domain.Customer;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @customeror OraceMundle
 */
public class AppPresentationConsole {
    
     public static void main(String[] args)
    {
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
                   System.out.println(ex.getMessage());
               } 
               catch (Exception ex) {
                   Logger.getLogger(AppPresentationConsole.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           else if(choice==2)
           {
               try {
                   //call ORM Menu
                   ORMMenu();
               } catch (IOException ex) {
                  System.out.println(ex.getMessage());
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
        System.out.println("1: Add Customer");
        System.out.println("2: Update Customer");
        System.out.println("3: Delete Customer");
        System.out.println("4: Select a Customer");
        System.out.println("5: Select all Customers");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Customer anCustomer=new Customer();
            CustomerManager customerJDBC = new CustomerManager();
            
             Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter TRN: ");
            anCustomer.setTrn(aScanner.nextLine());
            
                       
            System.out.println("Enter first name: ");
            anCustomer.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anCustomer.setLastname(aScanner.nextLine());
            
            System.out.println("Enter Date of Birth: ");
            anCustomer.setDob(aScanner.nextLine());
            
            System.out.println("Enter Email: ");
            anCustomer.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anCustomer.setTelephoneNum(aScanner.nextLine());
            
            customerJDBC.addCustomerJDBC(anCustomer);
            System.out.println("Customer Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Customer anCustomer=new Customer();
            CustomerJDBCManager customerJDBC = new CustomerJDBCManager();
            
            Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter TRN: ");
            anCustomer.setTrn(aScanner.nextLine());
            
                       
            System.out.println("Enter first name: ");
            anCustomer.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anCustomer.setLastname(aScanner.nextLine());
            
            System.out.println("Enter Date of Birth: ");
            anCustomer.setDob(aScanner.nextLine());
            
            System.out.println("Enter Email: ");
            anCustomer.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anCustomer.setTelephoneNum(aScanner.nextLine());
            
            customerJDBC.updateCustomerJDBC(anCustomer);
            System.out.println("Customer updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            CustomerJDBCManager customerJDBC = new CustomerJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter TRN: ");
            
            customerJDBC.deleteCustomer(aScanner.nextLine());
            System.out.println("Customer deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Customer anCustomer=new Customer();
            CustomerJDBCManager customerJDBC = new CustomerJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter TRN: ");
            String trn = aScanner.nextLine();
            anCustomer = customerJDBC.getCustomerJDBC(trn);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Customer return using JDBC\n");
            System.out.println("TRN: " + anCustomer.getTrn()+"\n");
            System.out.println("First Name: " + anCustomer.getFirstname()+"\n");
            System.out.println("Last Name: " + anCustomer.getLastname()+"\n");
            System.out.println("Date of Birth: " + anCustomer.getDob()+"\n");
            System.out.println("Email: " + anCustomer.getEmail()+"\n");
            System.out.println("Telephone Number: " + anCustomer.getTelephoneNum()+"\n");
            
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            CustomerJDBCManager customerJDBC = new CustomerJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = customerJDBC.getAllCustomerJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of Customers return using JDBC\n");
            
            while(rs.next()){
            System.out.println("TRN: " + rs.getString("trn")+"\n");
            System.out.println("First Name: " + rs.getString("f_name")+"\n");
            System.out.println("Last Name: " + rs.getString("l_name")+"\n");
            System.out.println("Date of Birth: " + rs.getString("dob")+"\n");
            System.out.println("Email: " + rs.getString("email")+"\n");
            System.out.println("Telephone Number: " + rs.getString("telephone_number")+"\n");
            
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
        System.out.println("1: Add Customer");
        System.out.println("2: Update Customer");
        System.out.println("3: Delete Customer");
        System.out.println("4: Select an Customer");
        System.out.println("5: Select all Customers");
        System.out.println("6: Exit\n"); 
        
        int ormChoice=scanORM.nextInt();
        if(ormChoice==1)
        {
            Customer anCustomer=new Customer();
            CustomerManager customerORM = new CustomerManager();
            
             Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter TRN: ");
            String trn=aScanner.nextLine();
            anCustomer.setTrn(trn);
            
            System.out.println("Enter first name: ");
            anCustomer.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anCustomer.setLastname(aScanner.nextLine());
            
            System.out.println("Enter Date of Birth: ");
            anCustomer.setDob(aScanner.nextLine());
            
            System.out.println("Enter Email: ");
            anCustomer.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anCustomer.setTelephoneNum(aScanner.nextLine());
            
            customerORM.addCustomer(anCustomer);
            System.out.println("Customer Added Using ORM");
        }
        else if(ormChoice==2)
        {
            Customer anCustomer=new Customer();
            CustomerManager customerORM = new CustomerManager();
            
               Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter TRN: ");
            String trn=aScanner.nextLine();
            anCustomer.setTrn(trn);
            
            System.out.println("Enter first name: ");
            anCustomer.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anCustomer.setLastname(aScanner.nextLine());
            
            System.out.println("Enter Date of Birth: ");
            anCustomer.setDob(aScanner.nextLine());
            
            System.out.println("Enter Email: ");
            anCustomer.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anCustomer.setTelephoneNum(aScanner.nextLine());
            
            customerORM.updateCustomer(anCustomer);
            System.out.println("Customer Added Using ORM");
        }
        else if(ormChoice==3)
        {
            CustomerManager customerORM = new CustomerManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter TRN: ");
            
            customerORM.deleteCustomer(Customer.class, aScanner.nextLine());
            System.out.println("Customer deleted using ORM");
        }
        else if(ormChoice==4)
        {
            Customer anCustomer=new Customer();
            CustomerManager customerORM = new CustomerManager();            
            Scanner aScanner = new Scanner(System. in);
            
            System.out.println("Enter TRN: ");
            anCustomer = customerORM.getCustomer(aScanner.nextLine());
            
            //Runtime.getRuntime().exec("cls");
            //System.out.flush();
            
            System.out.println("Customer return using ORM\n");
            System.out.println("ID: " + anCustomer.getTrn()+"\n");
            System.out.println("First Name: " + anCustomer.getFirstname()+"\n");
            System.out.println("Last Name: " + anCustomer.getLastname()+"\n");
            System.out.println("Date of Birth: " + anCustomer.getDob()+"\n");
            System.out.println("Email: " + anCustomer.getEmail()+"\n");
            System.out.println("Telephone Number: " + anCustomer.getTelephoneNum()+"\n");
            
        }
        else if(ormChoice==5)
        {
            List<Customer> customer =new ArrayList();
            CustomerManager customerORM = new CustomerManager();            
            Scanner aScanner = new Scanner(System. in);
            
            
            customer = customerORM.getAllCustomer();
            
            //Runtime.getRuntime().exec("cls");
            //System.out.flush();
            
            System.out.println("List of customer return using ORM\n");
            
            for(int i=0; i<customer.size(); i++){
            System.out.println("TRN: " + customer.get(i).getTrn()+"\n");
            System.out.println("First Name: " + customer.get(i).getFirstname()+"\n");
            System.out.println("Last Name: " + customer.get(i).getLastname()+"\n");
            System.out.println("Date of Birth: " + customer.get(i).getDob()+"\n");
            System.out.println("Email: " + customer.get(i).getEmail()+"\n");
            System.out.println("Telephone Number: " + customer.get(i).getTelephoneNum()+"\n");
            
            
            }
        }
        else if(ormChoice==6)
        {
            return;
        }
        
        
        
    }
    
    
    
    
    
    
    
}
