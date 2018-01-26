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
 * @author DesmonD
 */
public class contact_us_message {
    
    public boolean sending_message(bean_model.contact_us_bean d1){
    
    boolean c=false;
    
    Connection con = database_connectivity.Connect();
    
    try{
        
        PreparedStatement ps=con.prepareStatement("insert into contact_us(Name,Email,Subject,Message) values(?,?,?,?)");
        
        ps.setString(1,d1.getName());
        ps.setString(2,d1.getEmail());
        ps.setString(3,d1.getSubject());
        ps.setString(4,d1.getMessage());
        
        
        int i=ps.executeUpdate();
        
        if(i>0)
        {
        c=true;
        }
    }
    
    catch(Exception e){
    
      System.err.print(e); 
    }
    
    
    return c;
    }
    
}
