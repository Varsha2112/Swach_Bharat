<%-- 
    Document   : admin
    Created on : 24 Sep, 2017, 10:26:57 AM
    Author     : DesmonD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Form</title>
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
  <link rel="stylesheet" href="../css/admin.css">

  
</head>

<body>
  <div class="login">
  <h2>Admin LogIn</h2>
  <form action="http://localhost:8080/Swach_Bharat/wall%20design/admin.jsp" method="POST">
  <fieldset>
      <input type="text" name="Username" placeholder="Username" required="" />
      <input type="password" name="Password" placeholder="Password" required=""/>
  </fieldset>
  <input type="submit" value="Log In" />
  </form>

</div>
  
  <%
    if(request.getMethod()=="POST"){
    
 String Username=   request.getParameter("Username");
    String Password = request.getParameter("Password");
    
    bean_model.admin_bean b1=new bean_model.admin_bean();
    b1.setUsername(Username);
    b1.setPassword(Password);
    
   app.database_model_admin mm=new app.database_model_admin();
   
  boolean b= mm.check_admin_login(b1);
  
  if(b)
  {
     response.sendRedirect("admin_panel.jsp");
  }
  else{
  out.print("unsuccess");
  }

    }
    %>
</body>
</html>
