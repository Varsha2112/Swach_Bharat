<%-- 
    Document   : user_login
    Created on : 23 Sep, 2017, 1:09:40 PM
    Author     : DesmonD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" type="text/css" href="../css/user_login.css">
    </head>
    <body>
        <%
        String email=(String)request.getSession().getAttribute("email");
        String mobile=(String)request.getSession().getAttribute("mobile");
        String username=(String)request.getSession().getAttribute("username");
        String name=(String)request.getSession().getAttribute("name");
        String dob=(String)request.getSession().getAttribute("birthday");
        String town=(String)request.getSession().getAttribute("town");
        String state=(String)request.getSession().getAttribute("state");
        String country=(String)request.getSession().getAttribute("country");
        String pincode=(String)request.getSession().getAttribute("pincode");
     
        %>
   <div id="top">
                <ul>
                    <li><a href="../wall design/index.html">HOME</a></li>
                    <li><a href="../wall design/complaint.jsp">COMPLAINT</a></li>
                    <li><a href="../wall design/user_login.jsp">PROFILE</a></li>
                    <li><a href="../wall design/chatbox.jsp">CHATBOX</a></li>
                    <li><a href="../wall design/contact_us.jsp">CONTACT US</a></li>
                    <li><a href="../wall design/signin.jsp">LOGOUT</a></li>
                </ul>
</div>        
<div id="Uname">
    <h1>User Profile</h1>
</div>
    <div id="back">
        <header>
            
            <img id="img1" src="../image/user_login/account-profile-use.png">
            
            <h2 style="margin-top: 3%;">Name</h2>
<!--            <ul>
                <li><a href="#">General</a></li>
                <li><a href="#">Home</a></li>
            </ul>-->
        </header>
        
        
        <div id="Pro_id">
<!--        profile photo    -->
<img id="img2" src="../image/user_login/account-profile-use.png">
        </div>
        <div id="info">
<!--        personal data-->
            <div id="con_info">
<!--                user information-->
                <h3 style="font-family:Arial;">Contact Information</h3>
                <form>
                    E-Mail : &nbsp;&nbsp;&nbsp;<input type="email" name="Email" placeholder="<% out.print(email);%>" required=""><br><br>
                Phone &nbsp;: &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Phone" placeholder="<% out.print(mobile);%>" required="" maxlength="10"><br><br>
                <h3 style="font-family:arial;">General Information</h3>
                User Name : &nbsp; <input type="text" name="Uname" placeholder="<%out.print(username);%>" required=""><br><br>
                Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type="text" name="Name" placeholder="<%out.print(name);%>" required=""><br><br>
                D.O.B &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type="text" name="DOB" placeholder="<%out.print(dob);%>" required=""><br><br>
                Town &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type="text" name="Town" placeholder="<%out.print(town);%>" required=""><br><br> 
                State &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type="text" name="State" placeholder="<%out.print(state);%>" required=""><br><br>
                Country &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type="text" name="Country" placeholder="<%out.print(country);%>" required=""><br><br> 
                Pincode &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type="text" name="Pincode" placeholder="<%out.print(pincode);%>" required=""><br><br> 
                </form>
            </div>
            <div id="update">
<!--            Edit Profile-->
                
                <h3 style="font-family:Arial; margin-left:15%;">Actions</h3>
                
                <ol>
                    <img id="img3" src="../image/user_login/pencil.PNG">
                    
                    <li><a style="display: block;" href="#">Edit</a></li>
                    <li><a style="display: block;" href="#">Update</a></li>
                    <li style="padding-left: 40px;width: 75%;"><a href="../wall design/user_login.jsp">Reset</a></li>
                </ol>
            </div>
        </div>
    </div>
</body>
</html>