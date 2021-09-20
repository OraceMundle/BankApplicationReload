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
            //System.out.println("Enter Account Number: ");
            //anAccount.setAccountnumber(aScanner.nextLine());
            
                       
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
            
            System.out.println("Enter TRN: ");
            anAccount.setCustomerTRN(aScanner.nextInt());
            
            System.out.println("Enter Worker ID: ");
            anAccount.setWorkerId(aScanner.nextInt());
                        
            accountJDBC.addAccountJDBC(anAccount);
            System.out.println("Account Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Account anAccount=new Account();
            AccountManager accountJDBC = new AccountManager();
            
              Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter Account Number: ");
            anAccount.setAccountnumber(aScanner.nextInt());
            
                       
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
            
            System.out.println("Enter TRN: ");
            anAccount.setCustomerTRN(aScanner.nextInt());
            
            System.out.println("Enter Worker ID: ");
            anAccount.setWorkerId(aScanner.nextInt());
            
            accountJDBC.updateAccountJDBC(anAccount);
            System.out.println("Account updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            AccountManager accountJDBC = new AccountManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter TRN: ");
            
            accountJDBC.deleteAccount(aScanner.nextLine());
            System.out.println("Account deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Account anAccount=new Account();
            AccountManager accountJDBC = new AccountManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter Account Number: ");
            String accountNumber = aScanner.nextLine();
            anAccount = accountJDBC.getAccountJDBC(accountNumber);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Account return using JDBC\n");
            System.out.println("Account: " + anAccount.getAccountnumber()+"\n");
            System.out.println("Balance: " + anAccount.getBalance()+"\n");
            System.out.println("Loan Amount: " + anAccount.getLoanAmount()+"\n");
            System.out.println("Monthly Installment: " + anAccount.getMonthlyInstalment()+"\n");
            System.out.println("Date Opened: " + anAccount.getDateOpened()+"\n");
            System.out.println("Date Closed: " + anAccount.getDateClosed()+"\n");
            System.out.println("Customer TRN: " + anAccount.getCustomerTRN()+"\n");
            System.out.println("Worker ID: " + anAccount.getWorkerId()+"\n");
            
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            AccountManager accountJDBC = new AccountManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = accountJDBC.getAllAccountJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of Accounts return using JDBC\n");
            
            while(rs.next()){
            /*    
            System.out.println("TRN: " + rs.getString("trn")+"\n");
            System.out.println("First Name: " + rs.getString("f_name")+"\n");
            System.out.println("Last Name: " + rs.getString("l_name")+"\n");
            System.out.println("Date of Birth: " + rs.getString("dob")+"\n");
            System.out.println("Email: " + rs.getString("email")+"\n");
            System.out.println("Telephone Number: " + rs.getString("telephone_number")+"\n");
            */
            
            System.out.println("Account: " + rs.getString("account_number")+"\n");
            System.out.println("Balance: " + rs.getString("balance")+"\n");
            System.out.println("Loan Amount: " + rs.getString("loan_amount")+"\n");
            System.out.println("Monthly Installment: " + rs.getString("monthly_install")+"\n");
            System.out.println("Date Opened: " + rs.getString("date_opened")+"\n");
            System.out.println("Date Closed: " + rs.getString("date_closed")+"\n");
            System.out.println("Customer TRN: " + rs.getString("trn")+"\n");
            System.out.println("Worker ID: " + rs.getString("worker_id")+"\n");
            
           
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
            AccountManager accountORM = new AccountManager();
            
             Scanner aScanner = new Scanner(System.in);
            //System.out.println("Enter Account Number: ");
            //anAccount.setAccountnumber(aScanner.nextLine());
            
                       
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
            
            System.out.println("Enter TRN: ");
            anAccount.setCustomerTRN(aScanner.nextInt());
            
            System.out.println("Enter Worker ID: ");
            anAccount.setWorkerId(aScanner.nextInt());
            
            accountORM.addAccount(anAccount);
            System.out.println("Account Added Using ORM");
        }
        else if(ormChoice==2)
        {
            Account anAccount=new Account();
            AccountManager accountORM = new AccountManager();
            
               Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter Account Number: ");
            anAccount.setAccountnumber(aScanner.nextInt());
            
                       
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
            
            System.out.println("Enter TRN: ");
            anAccount.setCustomerTRN(aScanner.nextInt());
            
            System.out.println("Enter Worker ID: ");
            anAccount.setWorkerId(aScanner.nextInt());
            
            accountORM.updateAccount(anAccount);
            System.out.println("Account Added Using ORM");
        }
        else if(ormChoice==3)
        {
            AccountManager accountORM = new AccountManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter Account Number: ");
                        
            accountORM.deleteAccount(Account.class, aScanner.nextLine());
            System.out.println("Account deleted using ORM");
        }
        else if(ormChoice==4)
        {
            Account anAccount=new Account();
            AccountManager accountORM = new AccountManager();            
            Scanner aScanner = new Scanner(System. in);
            
            System.out.println("Enter Account: ");
            anAccount = accountORM.getAccount(aScanner.nextLine());
            
            //Runtime.getRuntime().exec("cls");
            //System.out.flush();
            
            System.out.println("Account return using ORM\n");
            System.out.println("Account: " + anAccount.getAccountnumber()+"\n");
            System.out.println("Balance: " + anAccount.getBalance()+"\n");
            System.out.println("Loan Amount: " + anAccount.getLoanAmount()+"\n");
            System.out.println("Monthly Installment: " + anAccount.getMonthlyInstalment()+"\n");
            System.out.println("Date Opened: " + anAccount.getDateOpened()+"\n");
            System.out.println("Date Closed: " + anAccount.getDateClosed()+"\n");
            System.out.println("Customer TRN: " + anAccount.getCustomerTRN()+"\n");
            System.out.println("Worker ID: " + anAccount.getWorkerId()+"\n");
            
        }
        else if(ormChoice==5)
        {
            List<Account> account =new ArrayList();
            AccountManager accountORM = new AccountManager();            
            Scanner aScanner = new Scanner(System. in);
            
            
            account = accountORM.getAllAccount();
            
            //Runtime.getRuntime().exec("cls");
            //System.out.flush();
            
            System.out.println("List of account return using ORM\n");
            
            for(int i=0; i<account.size(); i++){
                
                /*
            System.out.println("TRN: " + customer.get(i).getTrn()+"\n");
            System.out.println("First Name: " + customer.get(i).getFirstname()+"\n");
            System.out.println("Last Name: " + customer.get(i).getLastname()+"\n");
            System.out.println("Date of Birth: " + customer.get(i).getDob()+"\n");
            System.out.println("Email: " + customer.get(i).getEmail()+"\n");
            System.out.println("Telephone Number: " + customer.get(i).getTelephoneNum()+"\n");
            */
            
            System.out.println("Account: " + account.get(i).getAccountnumber()+"\n");
            System.out.println("Balance: " + account.get(i).getBalance()+"\n");
            System.out.println("Loan Amount: " + account.get(i).getLoanAmount()+"\n");
            System.out.println("Monthly Installment: " + account.get(i).getMonthlyInstalment()+"\n");
            System.out.println("Date Opened: " + account.get(i).getDateOpened()+"\n");
            System.out.println("Date Closed: " + account.get(i).getDateClosed()+"\n");
            System.out.println("Customer TRN: " + account.get(i).getCustomerTRN()+"\n");
            System.out.println("Worker ID: " + account.get(i).getWorkerId()+"\n");
    
            }
        }
        else if(ormChoice==6)
        {
            return;
        }
        
        
        
    }
    
    
    
    
}
