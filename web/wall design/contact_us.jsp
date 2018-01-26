<%-- 
    Document   : contact_us
    Created on : 23 Sep, 2017, 2:11:05 PM
    Author     : DesmonD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" type="text/css" href="../css/contact_us.css">
    </head>
    <body>
      <div class ="icon">
          <a href="../wall design/index.html"><img src="../image/icons/logo.png"></a>
        </div>
        <div class="heading">
            <h1>Contact Us</h1>
        </div>
        <form action="http://localhost:8080/Swach_Bharat/wall%20design/contact_us.jsp" method="POST">
            <div>
  <div class="left">
      <input type="text" name="Name" id="name" placeholder="Name" required="" /> 
      <input type="email" name="Email" id="email" placeholder="Email" required=""/> 
      <input type="text" name="Subject" id="subject" placeholder="Subject" required="" /> 
  </div>
            <div class="right">
                <textarea style="" name="Message" placeholder="Message" cols="35" rows="7" required="" ></textarea>
  </div>
            </div>
            
            <div class="middle">
                <div class="submit">
                <input style="color:#e52f53;cursor: pointer;border: 2px solid white" 
                       type="submit" value="Submit">     
                </div>
            </div>
   
        </form> 
        <% 
            if(request.getMethod()=="POST"){
            
            String name=request.getParameter("Name");
            String email=request.getParameter("Email");
            String subject=request.getParameter("Subject");
            String message=request.getParameter("Message");
            
            bean_model.contact_us_bean b1=new bean_model.contact_us_bean();
            b1.setName(name);
            b1.setEmail(email);
            b1.setSubject(subject);
            b1.setMessage(message);
            
            app.contact_us_message rs=new app.contact_us_message();
            
            boolean b=rs.sending_message(b1);
            
            if(b)
               {
//                    out.println("success");
                   response.sendRedirect("contact_us_response.jsp");
     
                  }
                 else{
                    out.println("unsuccess");
                  }

            
            }
            
            %>
    </body>
</html>
