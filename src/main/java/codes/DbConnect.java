/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tharu
 */
public class DbConnect {
    public static Connection connect(){
         
        Connection comn = null;
         
        try {
            System.out.println("Inside connect method");
            Class.forName("com.mysql.cj.jdbc.Driver");
            comn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system","root","admin");
            System.out.println("Found connection");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Failed connection");
            JOptionPane.showMessageDialog(null,e);
        }
         
         return comn;
         
     }
     
}
             
             

    

