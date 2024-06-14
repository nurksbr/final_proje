/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje;

import java.sql.*;

/**
 *
 * @author FEVZİYE NUR KS1
 */
public class Connectionprovider {
    public static Connection getCon(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_connection", "root","nur1234");  
            return con; 
        } 
          catch (Exception e) {
              System.out.println(e);
              return null;
        }   
        
    }
    
    
}
