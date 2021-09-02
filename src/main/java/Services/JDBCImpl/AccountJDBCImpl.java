/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

import Domain.Account;
import Services.IAccountService;
import Services.ICustomerService;
import Services.IService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Dinham
 */
public class AccountJDBCImpl extends JDBCMainConfiguration implements IAccountService {
    
    Statement statement;

    @Override
    public void addAccount(Account account) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAccount(Account account) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account getAccount(String accountnumber) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Account> getAllAccount() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAccount(Class<?> Account, String accountnumber) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAccountJDBC(Account account) throws Exception {

     String insertAccount = "INSERT INTO account(balance, loan_amount, monthly_install, date_open, date_closed, trn, worker_id) "
                + "values('" + account.getBalance() + 
                "', '" + account.getLoanAmount() +
                "', '" + account.getMonthlyInstalment() + 
                "', '" + account.getDateOpened() + 
                "', '" + account.getDateClosed() + 
                "', '" + account.getCustomerTRN() + 
                "', '" + account.getWorkerId() +"')";    
    
       
         statement = this.getConnection().createStatement();        
        statement.execute(insertAccount);      
        
        this.getConnection().close();
        
        
    }

    @Override
    public void updateAccountJDBC(Account account) throws Exception {
        
        String updateAccount = "UPDATE account SET account_number = '" + account.getAccountnumber() + 
                "', trn = '" + account.getCustomerTRN() +
                "', date_opened ='" + account.getDateOpened() + 
                "', date_closed ='" + account.getDateClosed() +
                "', worker_id ='" + account.getWorkerId() + 
                "', balance ='" + account.getBalance() +
                "', loan_amount ='" + account.getLoanAmount() + 
                "', monthly_install ='" + account.getMonthlyInstalment()+"')";    
          
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateAccount);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();        
        
    }

    @Override
    public Account getAccountJDBC(String accountnumber) throws Exception {
        
            String selectAccount = "Select * From account Where account_number = " + accountnumber;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectAccount);
        
        Account account=new Account();
        account.setAccountnumber("account_number");
        account.setBalance(rs.getFloat("balance"));
        account.setCustomerTRN("trn");
        account.setDateClosed("date_closed");
        account.setDateOpened("date_open");
        account.setLoanAmount(rs.getFloat("loan_amount"));
        account.setMonthlyInstalment(rs.getFloat("monthly_install"));
        account.setWorkerId("worker_id");
                
        return account;        
    }

    @Override
    public List<Account> getAllAccountJDBC() throws Exception {

        ResultSet rs=null;
        PreparedStatement ps;
        
        String SelectAll="Select * From account";
        //statement=this.getConnection().createStatement();
        ps=this.getConnection().prepareStatement(SelectAll, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=ps.executeQuery(SelectAll);
        
        
        return (List<Account>) rs;
        
    }

    @Override
    public void deleteAccountJDBC(String accountnumber) throws Exception {

        statement=this.getConnection().createStatement();
        statement.execute("Delete From account Where account_number  = " + accountnumber);
    }
    
}