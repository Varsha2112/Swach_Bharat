<%-- 
    Document   : complaint
    Created on : 23 Sep, 2017, 9:49:04 PM
    Author     : DesmonD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>complaint form</title>
        <link rel="stylesheet" href="../css/complaint.css">
   
</head>

<body>
  <div id="boxForm">
  <h2 id="title">Complaint Form</h2>
  <form action="http://localhost:8080/Swach_Bharat/wall%20design/complaint.jsp" method="POST">
    <input class='text' type='text' name='username' placeholder='Username' required>
    <br>
    <input class='text' type='text' name="fname" placeholder='First Name' required>
    <br>
    <input class='text' type='text' name="lname" placeholder='Last Name' required>
    <br>
    <input class='text' type='text' name="phone" placeholder='Mobile Number' maxlength="10" required>
    <br>
    
    <select class='text' required="" style="width:270px;" name="comp_type">Water supply

        <option value="Select Complaint type" selected />Select Complaint type
        <option value="Any/Other"/>Any/Other
        <option value="Cleanliness"/>Cleanliness
        <option value="Drains are Full"/>Drains are Full
        <option value="Dumping of Furniture"/>Dumping of Furniture
        <option value="Garbage vehicle"/>Garbage vehicle
        <option value="Improper garbage disposal"/>Improper garbage disposal
        <option value="No dustbin"/>No dustbin
        <option value="Poor Cleanliness and Hygiene"/>Poor Cleanliness and Hygiene
        <option value="Road Garbage"/>Road Garbage
        <option value="Sochalay Nirman"/>Sochalay Nirman
        <option value="Unorganized house"/>Unorganized house
        <option value="Urinating in Public"/>Urinating in Public
               
    </select>
    
    <input class='text' type='text' style="height: 50px;" name="description" placeholder='Description' required>
    <br>
    
<!--    <input id='rememberMe' name='rememberMe' type='checkbox'> <label>Remember me</label>
    <br>-->
    
    <input class='button' type='submit' value='Submit'>
  </form>
</div>
  
    <script  src="../js(complaint)/index.js"></script>

    <%
    if(request.getMethod()=="POST"){
    
 String username= request.getParameter("username");
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String phone=request.getParameter("phone");
    String comp_type=request.getParameter("comp_type");
    String description=request.getParameter("description");
    
   
bean_model.Complaint_bean b1=new bean_model.Complaint_bean();
    b1.setUsername(username);
    b1.setFname(fname);
    b1.setLname(lname);
    b1.setPhone(phone);
    b1.setComp_type(comp_type);
    b1.setDescription(description);
    
    String complaint=app.model.getrandom();
    b1.setComp_no(complaint);
    
   app.register_complaint mm=new app.register_complaint();
   
  boolean b= mm.complaint_no(b1);
//  out.print("hello");
  if(b)
  {
      request.getSession().setAttribute("complaint_no", complaint);
      // request.getSession().getAttribute("complain_no");
      
      response.sendRedirect("complaint_response.jsp");
  }
  else{
  out.println("unsuccess");
  }

    }
    %>
</body>
</html>

