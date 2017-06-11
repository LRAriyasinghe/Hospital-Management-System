/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class DBConnect {
    
   public static Statement getStatemennt(){
    
            Connection con;
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db","root","");
           Statement stat= con.createStatement();
            return stat;
       } 
       catch (SQLException ex) {
           Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
           return null;
       }
   }
}
            
        
    
    
    
   

