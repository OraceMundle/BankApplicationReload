/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.JDBCImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KRichards
 */
public class JDBCMainConfiguration {
    private static final String conString = "jdbc:mysql://localhost:3306/bankapp";
    private static final String dbUser = "root";
    private static final String dbUserPWD = "Cparasingh@83";
    
    private Connection con;
    
    protected Connection getConnection() throws SQLException
    {
        try {
            con=DriverManager.getConnection(conString,dbUser,dbUserPWD);
            } 
                       
        catch (Exception e) {
        }
        
        
        return con;
    }
}
