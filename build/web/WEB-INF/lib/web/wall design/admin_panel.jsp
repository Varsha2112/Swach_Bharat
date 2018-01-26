<%-- 
    Document   : admin_panel
    Created on : 26 Sep, 2017, 7:49:22 AM
    Author     : DesmonD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" type="text/css" href="../css/admin_panel.css">
    </head>
   <body>
    <div id="main">
    <header>
        <img id="logo1" src="../image/icons/logo.png">
    <input id="input1" name="search" type="text" placeholder="Search...">
        <div id="msg">
            <a href="#"><img class="logo2" src="../image/admin_panel/bell1.png"></a>
            <a href="#"><img class="logo2" src="../image/admin_panel/message1.png"></a>
        </div>
        <div id="user">
            <img id="img1" src="../image/admin_panel/abhik.jpg">
        </div>
    </header>
        <div id="dashboard">
        <div id="profile">
            <img style="height:60%; float:left;margin-left: 1%;border-radius: 50%; " id="" src="../image/admin_panel/abhik.jpg">
            <h3 style="float:left; color:white;font-family:Bell MT;margin-bottom:0%;margin-left:7%;">Welcome</h3>
            <h3 style="float:left; color:white;font-family:Bell MT;margin-left:7%;margin-top:5%;">Mr. Abhishek</h3>
        </div>
        <ul>
        <li><a href="#">Dashboard</a></li>
        <li><a href="#">Home</a></li>
        <li><a href="chatbox.jsp">Chat</a></li>
        <li><a href="#">Query</a></li>
        <!--<li><a href="#">Gallery</a></li>-->
    
    </ul>
        </div>
        <div id="content_box">
        <img id="logo2" src="../image/admin_panel/home1.png" style="height:30px;margin:6px; float:left;border: 0.1px solid blue">
        <a href="#" style="text-decoration:none; line-height:50px;">Home ></a>
    </div>
<div id="left">
    
    <a href="#"><img style="margin-top:9%;margin-left:1%;float:left;height: 110px;width:100px;" src="../image/admin_panel/mid_sec/Hamzasaleem-Stock-Style-2-Mission-Control.ico"></a>
    
    <h1> 8 Unread Messages</h1>
<!--Left Side Contents    -->
    </div>
    <div id="mid">
        <a href="#"><img style="margin-top:9%;margin-left:1%;float:left;height: 110px;width:115px;" src="../image/admin_panel/mid_sec/18c1ba51.png"></a>
        <h1 style="margin-top:15%">Visitors</h1>
        <h1 style="margin-top: 2%;">22</h1>
<!--    Mid side Contents-->
    </div>
    <div id="right">
        <a href="#"><img style="margin-top:9%;margin-left:3%;float:left;height: 110px;width:115px;" src="../image/admin_panel/mid_sec/33308.png"></a>
        <h1 style="margin-top:15%">Users</h1>
        <h1 style="margin-top: 2%">9</h1>
<!--    Right Side Contents-->
    </div>
    <div id="complaint">
        <a href="#"><img style="margin-top:12%;margin-left:3%;float:left;height: 110px;width:115px;" src="../image/admin_panel/mid_sec/89569-200.png"></a>
        <h1 style="margin-top:19%">Complaints</h1>
        <h1 style="margin-top: 2%">5</h1>
        
    <!--<h1>Graph</h1>-->

    </div>
    <div id="sub_gf">
        
        <a href="#"><img style="margin-top:15%;margin-left:3%;float:left;height: 110px;width:115px;" src="../image/admin_panel/mid_sec/notification-circle-blue-512.png"></a>
        <h1 style="margin-top:21%">Notifications</h1>
        <h1 style="margin-top:2%">11</h1>

    </div>

    </div>
</body>
</html>
