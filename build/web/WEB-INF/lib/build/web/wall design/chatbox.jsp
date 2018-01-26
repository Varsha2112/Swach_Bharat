<%-- 
    Document   : chatbox
    Created on : 24 Sep, 2017, 7:51:49 AM
    Author     : DesmonD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>chatbox</title>
        <link rel="stylesheet" type="text/css" href="../css/chatbox.css">
    </head>
    <body>
        <div class="div1">
            <a href="index.html"><img src="../image/icons/logo.png"></a>
            </div>
        <div class="div2">
<!--                <ol>
                    <li><a href="../wall_design/chatbox.jsp">HOME</a></li>
                    <li><a href="">PROFILE</a></li>
                    <li><a href="../wall_design/contact_us.jsp">CONTACT US</a></li>
                    <li><a href="../wall_design/about.jsp">ABOUT</a></li>
                    <li><a href="../wall_design/index.jsp">LOGOUT</a></li>
                </ol>-->
                
            </div>
        <div class="div3">
            <div class="chat">
                <label class="Inbox">Inbox</label><br><br>
                <br>     <p style="font-size: 15px;font-weight: bold;color:green">Name:Abhishek</p>  
                <p style="font-size: 15px;font-weight: bold;color:yellow">Message :Hi I am Harshit.</p>  
            
            </div>
        </div>
        <div class="div4">
            <div class="div5">
                <div class="div6">
                    <form action="http://localhost:8080/Swach_Bharat/wall%20design/chatbox.jsp" method="POST">
                        <input class="i1" type="text" placeholder="Your Name" name="name" maxlength="16" required="" style="position: relative;left: 1%;">
                        <input class="i1" type="text" placeholder="Your Number" name="mobile" maxlength="10" required="" style="position: relative;left: 2%;">
                        <input class="i1" type="email" placeholder="Your Email" name="email" required="" style="position: relative;left: 3%;"> <br>
                        <textarea class="t1" placeholder="Message" name="msg" required=""></textarea>
                        <input class="i2" type="text" placeholder="Your Address" name="address" maxlength="50" required="">
                        <input class="i3" type="submit" value="Send Message">
                    </form>
                </div>
              </div>
           </div>
         <%
        
if(request.getMethod()=="POST"){

String name= request.getParameter("name");
String mobile= request.getParameter("mobile");
String email= request.getParameter("email");
String msg= request.getParameter("msg");
String address= request.getParameter("address");

bean_model.chatbox_bean b1=new bean_model.chatbox_bean();

b1.setName(name);
b1.setMobile(mobile);
b1.setEmail(email);
b1.setMsg(msg);
b1.setAddress(address);

app.expert_chat tu=new app.expert_chat();

boolean b=tu.chat(b1);

                   if(b)
               {
//                    out.println("success");
//                   response.sendRedirect("contact_us_response.jsp");
     
                  }
                 else{
//                    out.println("unsuccess");
                  }

            
            }
        %>
    </body>
</html>
