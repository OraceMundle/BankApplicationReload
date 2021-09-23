/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import CrudManager.AccountManager;
import CrudManager.CustomerJDBCManager;
import CrudManager.TransactionCalManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
//import java.util.logging.Level;
import javax.swing.table.AbstractTableModel;
//import org.jboss.logging.Logger;
import org.apache.log4j.Logger;



/**
 *
 * @author Dinham
 */
public class ResultSetTblModel extends AbstractTableModel{
    
    //private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AccountManager.class);
    private static final Logger log = Logger.getLogger(ResultSetTblModel.class);
    
    private Boolean connectToDatabase=false;
    private AccountManager am;
    private int numberOfRows, numberOfCols;
    private CustomerJDBCManager cm;
    private TransactionCalManager t;
    
    private ResultSet rs;
    private ResultSetMetaData rsmd;

    public ResultSetTblModel() {
    }
    
    public void viewAll (String objectType)
    {
        try{
            if(objectType.equals("account"))
            {
                am = new AccountManager();
                System.out.println("Getting ResultSet");
                rs = am.getAllAccountJDBC();
                System.out.println("Got Account ResultSet");
                connectToDatabase =true;
                System.out.println("Connected to database set to true");
            }
            
            else if(objectType.equals("customer"))
            {
                cm = new CustomerJDBCManager();
                System.out.println("Getting ResultSet");
                rs = cm.getAllCustomerJDBC();
                System.out.println("Got Customer ResultSet");
                connectToDatabase = true;
                System.out.println("Connected to database set to true");
            }
            
            else if (objectType.equals("transaction"))
            {
                t = new TransactionCalManager();
                System.out.println("Getting ResultSet");
                rs = t.getAllTransactionCalJDBC();
                System.out.println("Got Customer ResultSet");
                connectToDatabase = true;
                System.out.println("Connected to database set to true");
            }
            System.out.println ("column count is");
               int test = rs.getFetchSize();
            System.out.println ("column count is"+ test);
            //Obtain metadata for resutlset.
            rsmd = rs.getMetaData();
            
            int columnCount = rsmd.getColumnCount();
            
            System.out.println ("column count is"+ columnCount);

                     
            
            //determine number of rows in ResultSet.
            rs.last();
            numberOfRows = rs.getRow(); //get row number
            //notify JTable that model has chaged
            fireTableStructureChanged();
            
        }catch (SQLException ex){
            //Logger.getLogger(ResultSetTblModel.class.getName()).log(Level.SEVERE, null, ex);
            log.info(ex.getMessage());
        
        }catch (Exception ex){
            //Logger.getLogger(ResultSetTableModel.class.getName ()).log(Level.SEVERE, null, ex);
            log.info(ex.getMessage());
        }
    }


    
    @Override
    public int getRowCount() {
        return numberOfRows;
    }

    @Override
    public int getColumnCount() {
        numberOfCols =5;
        try{
            numberOfCols = rsmd.getColumnCount();
        }catch (SQLException ex){
            //Logger.getLogger(ResultSetTblModel.class.getName()).log(Level.SEVERE, null, ex);
            log.info(ex.getMessage());
        }
        return numberOfCols;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Object obj=new Object();
        try{
            rs.absolute(rowIndex + 1);
            obj = rs.getObject(columnIndex +1);
        }catch (SQLException ex){
            //Logger.getLogger(ResultSetTblModel.class.getName()).log(Level.SEVERE, null, ex);
            log.info(ex.getMessage());
        }
        return obj;
        
    }
    
}
