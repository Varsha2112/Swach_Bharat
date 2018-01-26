/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Harshit
 */
public class database_model_admin {
  public  boolean check_admin_login(bean_model.admin_bean b1)
    {
        
    Connection con=database_connectivity.Connect();
    
    try{
        
            PreparedStatement ps1=con.prepareStatement("select Username,Password from admin where Username=? and Password=?");
           
            ps1.setString(1,b1.getUsername());
            ps1.setString(2,b1.getPassword());
            
            ResultSet rs=ps1.executeQuery();
            
            if(rs.next())
            {
                return true;
            }
        
        }
        catch(Exception e)
        {
            
            System.out.println(e);
        }
        
    
        return false;
    
    }
}
