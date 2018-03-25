/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_reg;
import java.sql.*;
import javax.swing.*;
//import javax.swing.JOptionPane;

/**
 *
 * @author Piranavan
 */
public class DataBaseConnection {
    
    Connection conn = null;
    
     
    
    public static Connection Java_db(){
        
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Piranavan\\Documents\\NetBeansProjects\\Student_Reg\\Student_Db.sqlite");
            return conn;
        
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
             
        }
    }
    
}
