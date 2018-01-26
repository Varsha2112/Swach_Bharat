/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author DesmonD
 */
public class model {
    
    
    
    public static boolean data_insert(bean_signup b1)
    {
       Connection con=Database_connectivity.Connect();
       
        try{
        PreparedStatement ps=con.prepareStatement("insert into signup(name,email,username,password,birthday,aadhar,mobile,town,district,state,country,pincode) values(?,?,?,?,?,?,?,?,?,?,?,?)");
        
        ps.setString(1,b1.getName());
        ps.setString(2,b1.getEmail());
        ps.setString(3,b1.getUsername());
        ps.setString(4,b1.getPassword());
        ps.setString(5,b1.getBday());
        ps.setString(6,b1.getAadhar());
        ps.setString(7,b1.getMobile());
        ps.setString(8,b1.getTown());
        ps.setString(9,b1.getDistrict());
        ps.setString(10,b1.getState());
        ps.setString(11,b1.getCountry());
        ps.setString(12,b1.getPincode());
        
        ps.executeUpdate();
        
        }
        
        catch(Exception e)
        {
        }
        
     return false;   
    }
    
    public static boolean data_insert2(bean_signup b2){
    
        Connection con=Database_connectivity.Connect();
        
        try{
        
            PreparedStatement ps1=con.prepareStatement("select email,password from signup where email=? and password=?");
           
            ps1.setString(1,b2.getEmail());
            ps1.setString(2,b2.getPassword());
            
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
    
    public static bean_signup getalldata(String email)
    {
        
        bean_signup b2=new bean_signup();
        
        Connection con=Database_connectivity.Connect();
        
        try{
         PreparedStatement ps1=con.prepareStatement("select email,mobile,username,name,birthday,town,state,country,pincode from signup where email=?");
         
          ps1.setString(1,email);
          ResultSet rs=ps1.executeQuery();
            
            if(rs.next())
            {
                b2.setEmail(rs.getString(1));
//                System.err.print("hello");
//                System.err.println(rs.getString(1));
                b2.setMobile(rs.getString(2));
                b2.setUsername(rs.getString(3));
                b2.setName(rs.getString(4));
                b2.setBday(rs.getString(5));
                b2.setTown(rs.getString(6));
                b2.setState(rs.getString(7));
                b2.setCountry(rs.getString(8));
                b2.setPincode(rs.getString(9));
            }
        
        }
        catch(Exception e)
        {
        
        }
        return b2;
    }
}
