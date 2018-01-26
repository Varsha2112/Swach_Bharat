/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harshit
 */

import java.sql.*;
import java.sql.DriverManager;


public class database_connectivity {
    
     public static Connection Connect()
    {
    
    Connection con=null;
          try
          {
              
             Class.forName("com.mysql.jdbc.Driver");
            
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swach_bharat","root","");
         
         } 
         catch(Exception e)
         {}
          
         
     return con;     
    
}

}