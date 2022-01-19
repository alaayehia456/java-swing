/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author alaa yehia
 */
public class databaseConnection {
    
    final static String jdbc_driver="com.mysql.jdbc.Driver";
    
    final static String DB_URL="jdbc:mysql://localhost:3306/student";
    
    
    
    final static String USER="root";
    final static String Pass="";
    
    
    
    public static Connection con(){
        
        
        try {
            Class.forName(jdbc_driver);
            
            Connection conn=DriverManager.getConnection(DB_URL,USER,Pass);
            
            System.out.println("databaseConnection.con()");
            return conn;
            
            
        } catch (Exception e) {
            
            
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
    
    
    
}
