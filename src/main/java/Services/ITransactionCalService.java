/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.TransactionCal;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author OraceMundle
 */
public interface ITransactionCalService extends IService{
    
    //ORM
    public final String NAME = "ITransactionCal";
    
    public void addTransaction(TransactionCal transaction ) throws Exception;
    
    public void updateTransaction(TransactionCal transaction) throws Exception;
    
    public TransactionCal getTransaction(int transactionId)throws Exception;
    
    public List<TransactionCal> getAllTransactions() throws Exception;
    
    public void deleteTransaction(Class<?> Transaction, int transactionId) throws Exception;
    
    
    
    
    
    //JDBC
    public void addTransactionJDBC(TransactionCal transaction ) throws Exception;
    
    public void updateTransactionJDBC(TransactionCal transaction) throws Exception;
    
    public TransactionCal getTransactionJDBC(int transactionId)throws Exception;
    
    public ResultSet getAllTransactionsJDBC() throws Exception;
    
    public void deleteTransactionJDBC(int transactionId) throws Exception;
    
    
    
}
