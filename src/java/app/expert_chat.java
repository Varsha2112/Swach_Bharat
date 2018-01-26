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
public class expert_chat {
    
    public boolean chat(bean_model.chatbox_bean e1){
    
    boolean c=false;
    
    Connection con = database_connectivity.Connect();
    
    try{
        
        PreparedStatement ps=con.prepareStatement("insert into chatbox(name,mobile,email,msg,address) values(?,?,?,?,?)");
        
        ps.setString(1,e1.getName());
        ps.setString(2,e1.getMobile());
        ps.setString(3,e1.getEmail());
        ps.setString(4,e1.getMsg());
        ps.setString(5,e1.getAddress());
        
        
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
