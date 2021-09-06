/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

//import CrudManager.AccountJDBCManager;
import CrudManager.AccountManager;
import Domain.Account;
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
public class AppPresentationAccountConsole {
    
    
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
        System.out.println("1: Add Account");
        System.out.println("2: Update Account");
        System.out.println("3: Delete Account");
        System.out.println("4: Select a Account");
        System.out.println("5: Select all Accounts");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Account anAccount=new Account();
            AccountManager accountJDBC = new AccountManager();
            
             Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter Account Number: ");
            anAccount.setAccountnumber(aScanner.nextLine());
            
                       
            System.out.println("Enter Balance: ");
            anAccount.setBalance(aScanner.nextFloat());
            
            System.out.println("Enter Loan Amount: ");
            anAccount.setLoanAmount(aScanner.nextFloat());
            
            System.out.println("Enter Monthly Installment: ");
            anAccount.setMonthlyInstalment(aScanner.nextFloat());
            
            System.out.println("Enter Date Opened: ");
            anAccount.setDateOpened(aScanner.nextLine());
            
            System.out.println("Enter Date Closed: ");
            anAccount.setDateClosed(aScanner.nextLine());
            
            accountJDBC.addAccountJDBC(anAccount);
            System.out.println("Account Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Account anAccount=new Account();
            AccountManager customerJDBC = new AccountManager();
            
            Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter TRN: ");
            anAccount.setTrn(aScanner.nextLine());
            
                       
            System.out.println("Enter first name: ");
            anAccount.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAccount.setLastname(aScanner.nextLine());
            
            System.out.println("Enter Date of Birth: ");
            anAccount.setDob(aScanner.nextLine());
            
            System.out.println("Enter Email: ");
            anAccount.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anAccount.setTelephoneNum(aScanner.nextLine());
            
            customerJDBC.updateAccountJDBC(anAccount);
            System.out.println("Account updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            AccountJDBCManager customerJDBC = new AccountJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter TRN: ");
            
            customerJDBC.deleteAccount(aScanner.nextLine());
            System.out.println("Account deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Account anAccount=new Account();
            AccountJDBCManager customerJDBC = new AccountJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter TRN: ");
            String trn = aScanner.nextLine();
            anAccount = customerJDBC.getAccountJDBC(trn);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Account return using JDBC\n");
            System.out.println("TRN: " + anAccount.getTrn()+"\n");
            System.out.println("First Name: " + anAccount.getFirstname()+"\n");
            System.out.println("Last Name: " + anAccount.getLastname()+"\n");
            System.out.println("Date of Birth: " + anAccount.getDob()+"\n");
            System.out.println("Email: " + anAccount.getEmail()+"\n");
            System.out.println("Telephone Number: " + anAccount.getTelephoneNum()+"\n");
            
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            AccountJDBCManager customerJDBC = new AccountJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = customerJDBC.getAllAccountJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of Accounts return using JDBC\n");
            
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
        System.out.println("1: Add Account");
        System.out.println("2: Update Account");
        System.out.println("3: Delete Account");
        System.out.println("4: Select an Account");
        System.out.println("5: Select all Accounts");
        System.out.println("6: Exit\n"); 
        
        int ormChoice=scanORM.nextInt();
        if(ormChoice==1)
        {
            Account anAccount=new Account();
            AccountManager customerORM = new AccountManager();
            
             Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter TRN: ");
            String trn=aScanner.nextLine();
            anAccount.setTrn(trn);
            
            System.out.println("Enter first name: ");
            anAccount.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAccount.setLastname(aScanner.nextLine());
            
            System.out.println("Enter Date of Birth: ");
            anAccount.setDob(aScanner.nextLine());
            
            System.out.println("Enter Email: ");
            anAccount.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anAccount.setTelephoneNum(aScanner.nextLine());
            
            customerORM.addAccount(anAccount);
            System.out.println("Account Added Using ORM");
        }
        else if(ormChoice==2)
        {
            Account anAccount=new Account();
            AccountManager customerORM = new AccountManager();
            
               Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter TRN: ");
            String trn=aScanner.nextLine();
            anAccount.setTrn(trn);
            
            System.out.println("Enter first name: ");
            anAccount.setFirstname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAccount.setLastname(aScanner.nextLine());
            
            System.out.println("Enter Date of Birth: ");
            anAccount.setDob(aScanner.nextLine());
            
            System.out.println("Enter Email: ");
            anAccount.setEmail(aScanner.nextLine());
            
            System.out.println("Enter Telephone Number: ");
            anAccount.setTelephoneNum(aScanner.nextLine());
            
            customerORM.updateAccount(anAccount);
            System.out.println("Account Added Using ORM");
        }
        else if(ormChoice==3)
        {
            AccountManager customerORM = new AccountManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter TRN: ");
            
            customerORM.deleteAccount(Account.class, aScanner.nextLine());
            System.out.println("Account deleted using ORM");
        }
        else if(ormChoice==4)
        {
            Account anAccount=new Account();
            AccountManager customerORM = new AccountManager();            
            Scanner aScanner = new Scanner(System. in);
            
            System.out.println("Enter TRN: ");
            anAccount = customerORM.getAccount(aScanner.nextLine());
            
            //Runtime.getRuntime().exec("cls");
            //System.out.flush();
            
            System.out.println("Account return using ORM\n");
            System.out.println("ID: " + anAccount.getTrn()+"\n");
            System.out.println("First Name: " + anAccount.getFirstname()+"\n");
            System.out.println("Last Name: " + anAccount.getLastname()+"\n");
            System.out.println("Date of Birth: " + anAccount.getDob()+"\n");
            System.out.println("Email: " + anAccount.getEmail()+"\n");
            System.out.println("Telephone Number: " + anAccount.getTelephoneNum()+"\n");
            
        }
        else if(ormChoice==5)
        {
            List<Account> customer =new ArrayList();
            AccountManager customerORM = new AccountManager();            
            Scanner aScanner = new Scanner(System. in);
            
            
            customer = customerORM.getAllAccount();
            
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
