<%-- 
    Document   : complaint_response
    Created on : 23 Sep, 2017, 9:47:02 PM
    Author     : DesmonD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>complaint_response</title>
    <style>
  .bordered {
    width: 96.5%;
    height: 650px;
    padding: 20px;
    border: 10px double yellowgreen;
  }
</style>
    </head>
    <body>
        <div class="bordered">
            <p style="font-family:cursive;margin-left:25%;">Username . Your Complaint is Successfully Registered</p>
            <h3 style="margin-left:25%;"><%=request.getSession().getAttribute("complaint_no")%></h3>
        </div>
    </body>
</html>

