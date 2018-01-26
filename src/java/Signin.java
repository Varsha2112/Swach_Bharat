/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.*;
/**
 *
 * @author DesmonD
 */

public class Signin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String email=request.getParameter("email");
            
            String password=request.getParameter("password");
            
            bean_signup b2=new bean_signup();
            b2.setEmail(email);
            b2.setPassword(password);
            
          
            
            if(model.data_insert2(b2))
            {
//                out.print("login success");
                HttpSession s=request.getSession();
                s.setAttribute("email",email);
                
             bean_signup b= model.getalldata(email);
             
             s.setAttribute("email", b.getEmail());
             s.setAttribute("mobile",b.getMobile());
             s.setAttribute("username",b.getUsername());
             s.setAttribute("name",b.getName());
             s.setAttribute("birthday",b.getBday());
             s.setAttribute("town",b.getTown());
             s.setAttribute("state",b.getState());
             s.setAttribute("country",b.getCountry());
             s.setAttribute("pincode",b.getPincode());
            
             
             
                response.sendRedirect("http://localhost:8080/Swach_Bharat/wall%20design/user_login.jsp");
               
                
            }
            
            else{
            
                out.print("email and password incorrect");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
