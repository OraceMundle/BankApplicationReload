/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import CrudManager.AccountManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.table.AbstractTableModel;
import org.jboss.logging.Logger;




/**
 *
 * @author Dinham
 */
public class ResultSetTblModel extends AbstractTableModel{
    
    private Boolean connectToDatabase=false;
    private AccountManager am;
    private int numberOfRows, numberOfCols;
    
    private ResultSet rs;
    private ResultSetMetaData rsmd;

    public ResultSetTblModel() {
    }
    
    public void viewAll (String objectType)
    {
        try{
            if(objectType.equals("Account"))
            {
                am = new AccountManager();
                System.out.println("Getting ResultSet");
                rs = am.getAllAccountJDBC();
                System.out.println("Got ResultSet");
                connectToDatabase = true;
                System.out.println("Connected to database set to true");
            }
            
            //Obtain metadata for resutlset.
            rsmd = rs.getMetaData();
            //determine number of rows in ResultSet.
            rs.last();
            numberOfRows = resultSet.getRow(); //get row number
            //notify JTable that model has chaged
            fireTableStructureChanged();
            
        }catch (SQLException ex){
            Logger.getLogger(ResultSetTableModel.class.getName()).log(Level.SEVERE, null, ex);
        
        }catch (Exception ex){
            Logger.getLogger(ResultSetTableModel.class.getName ()).log(Level.SEVERE, null, ex);
        }
    }


    
    @Override
    public int getRowCount() {
        return numberOfRows;
    }

    @Override
    public int getColumnCount() {
        numberOfCols =0;
        try{
            numberOfCols = rsmd.getColumnCount();
        }catch (SQLException ex){
            Logger.getLogger(ResultSetTblModel.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ResultSetTblModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
        
    }
    
}
