/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dell75
 */
public class ConnectionProvider {
    public static Connection getCon()
    {    Connection con = null;

         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/club",
                    "root",
                    "Mymysqlpasswordsumapaljava@" );  // put your MySQL password here
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return con;   // ⭐ THIS IS REQUIRED
}
}