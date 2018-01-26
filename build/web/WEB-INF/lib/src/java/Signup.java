/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author DesmonD
 */

public class Signup extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
              String name= request.getParameter("fname");
         
         String email= request.getParameter("email");
         
         String username= request.getParameter("uname");
         
         String password= request.getParameter("password");
         
         String bday= request.getParameter("bday");
         
         String aadhar= request.getParameter("aadhar");
         
         String mobile= request.getParameter("mobile");
         
         String town= request.getParameter("town");
         
         String district= request.getParameter("district");
         
         String state= request.getParameter("state");
         
         String country= request.getParameter("country");
         
         String pincode= request.getParameter("pincode");
         
         bean_signup b1=new bean_signup();
         b1.setName(name);
         b1.setEmail(email);
         b1.setUsername(username);
         b1.setPassword(password);
         b1.setBday(bday);
         b1.setAadhar(aadhar);
         b1.setMobile(mobile);
         b1.setTown(town);
         b1.setDistrict(district);
         b1.setState(state);
         b1.setCountry(country);
         b1.setPincode(pincode);
         
         model.data_insert(b1);
      
         response.sendRedirect("http://localhost:8080/Swach_Bharat/wall%20design/signup_reply.jsp");
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
