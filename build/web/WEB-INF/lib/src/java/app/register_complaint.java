/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author Harshit
 */
public class register_complaint {
    
    public  boolean  complaint_no(bean_model.Complaint_bean c1)
    {
        boolean c=false;
        Connection con=database_connectivity.Connect();
 
          try{
        
            PreparedStatement ps1=con.prepareStatement("insert into complaint_form(Username,First_Name,Last_Name,Mobile,Com_type,Description,Complaint_no,Status) values(?,?,?,?,?,?,?,?)");
           
            ps1.setString(1,c1.getUsername());
            ps1.setString(2,c1.getFname());
            ps1.setString(3,c1.getLname());
            ps1.setString(4,c1.getPhone());
            ps1.setString(5,c1.getComp_type());
            ps1.setString(6,c1.getDescription());
            ps1.setString(7,c1.getComp_no());
            ps1.setInt(8,0);
            
            
    int i=ps1.executeUpdate();
    if(i>0)
    {
       c=true;
    }
        
        }
        catch(Exception e)
        {
            
            System.err.print(e);
        }
        
    
        return c;
}
}
