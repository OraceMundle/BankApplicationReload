/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

import Domain.TransactionCal;
import Services.ITransactionCalService;
import java.sql.ResultSet;
import java.util.List;
import Services.IService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import org.apache.log4j.Logger;
/**
 *
 * @author OraceMundle
 */
public class TransactionCalJDBCImpl extends JDBCMainConfiguration implements ITransactionCalService{

     private static final Logger log = Logger.getLogger(TransactionCalJDBCImpl.class);    
    Statement statement;
    
    //ORM
    @Override
    public void addTransaction(TransactionCal transaction) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTransaction(TransactionCal transaction) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    @Override
    public List<TransactionCal> getAllTransactions() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTransaction(Class<?> Transaction, int transactionId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    //JDBC
    @Override
    public void addTransactionJDBC(TransactionCal transaction) throws Exception {
        
        try{
        String insertTransaction = "INSERT INTO transaction(previous_balance, current_balance, payment_amount, transaction_date, worker_id, account_number"
                + "values('" + transaction.getPrevious_balance()+ 
                "', '" + transaction.getCurrent_balance()+
                "', '" + transaction.getPayment_amount() + 
              "', '" + transaction.getTransaction_date()+ 
                "', '" + transaction.getWorker_id() + 
                "', '" + transaction.getAccount_number()+"')";    
    
       
         statement = this.getConnection().createStatement();        
        statement.execute(insertTransaction);      
        
        this.getConnection().close();   
        
        } catch (Exception e) {
            //log.info(e.getMessage());
        }

        
    }

    @Override
    public void updateTransactionJDBC(TransactionCal transaction) throws Exception {
        try {
          
        String updateTransation = "UPDATE transaction SET"   + 
                
                 " previous_balance = '" + transaction.getPrevious_balance()+
                "', current_balance = '" + transaction.getCurrent_balance() + 
                "', payment_amount =  '" + transaction.getPayment_amount() +
                "', transaction_date = '" + transaction.getTransaction_date() + 
                "' WHERE transaction_id = '" + transaction.getTransactionid() +"'"; 
         
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateTransation);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
        
        
        } catch (Exception e) {
            //log.info(e.getMessage());
        }
    
    }

    @Override
    public TransactionCal getTransactionJDBC(int transactionId) throws Exception {
     
               
        
         TransactionCal transaction =new TransactionCal();
        
         
         try {
            
        
            String selectTransaction = "SELECT * FROM transaction WHERE transaction_id = " + transactionId ;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectTransaction);
                        
        while(rs.next()){
        transaction.setPrevious_balance(rs.getFloat("previous_balance")); 
        transaction.setCurrent_balance(rs.getFloat("current_balance"));
        transaction.setPayment_amount(rs.getFloat("payment_amount"));
        transaction.setTransaction_date("transaction_date");
        transaction.setWorker_id(rs.getString("worker_id"));
        transaction.setAccount_number(rs.getInt("account_number"));
       
        }
        
        } catch (Exception e) {
            log.info(e.getMessage());
        }
        
        
        return transaction;
        
        
        
    }

    @Override
    public ResultSet getAllTransactionsJDBC() throws Exception {
        
         ResultSet rs=null;
        PreparedStatement ps;
        
        try {
            
        
        String SelectAll="SELECT * FROM transaction";
        //statement=this.getConnection().createStatement();
        ps=this.getConnection().prepareStatement(SelectAll, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=ps.executeQuery(SelectAll);
        
        } catch (Exception e) {
            log.info(e.getMessage());
        }
        return rs;
        
        
        
        
    }

    @Override
    public void deleteTransactionJDBC(int transactionId) throws Exception {
        
        
        statement=this.getConnection().createStatement();
        statement.execute("Delete From customer Where trn  = " + transactionId);
        
        
    }

    @Override
    public TransactionCal getTransaction(int transactionId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
