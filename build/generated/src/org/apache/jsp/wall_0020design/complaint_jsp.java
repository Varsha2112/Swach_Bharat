package org.apache.jsp.wall_0020design;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class complaint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>complaint form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/complaint.css\">\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div id=\"boxForm\">\n");
      out.write("  <h2 id=\"title\">Complaint Form</h2>\n");
      out.write("  <form action=\"http://localhost:8080/Swach_Bharat/wall%20design/complaint.jsp\" method=\"POST\">\n");
      out.write("    <input class='text' type='text' name='username' placeholder='Username' required>\n");
      out.write("    <br>\n");
      out.write("    <input class='text' type='text' name=\"fname\" placeholder='First Name' required>\n");
      out.write("    <br>\n");
      out.write("    <input class='text' type='text' name=\"lname\" placeholder='Last Name' required>\n");
      out.write("    <br>\n");
      out.write("    <input class='text' type='text' name=\"phone\" placeholder='Mobile Number' maxlength=\"10\" required>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <select class='text' required=\"\" style=\"width:270px;\" name=\"comp_type\">Water supply\n");
      out.write("\n");
      out.write("        <option value=\"Select Complaint type\" selected />Select Complaint type\n");
      out.write("        <option value=\"Any/Other\"/>Any/Other\n");
      out.write("        <option value=\"Cleanliness\"/>Cleanliness\n");
      out.write("        <option value=\"Drains are Full\"/>Drains are Full\n");
      out.write("        <option value=\"Dumping of Furniture\"/>Dumping of Furniture\n");
      out.write("        <option value=\"Garbage vehicle\"/>Garbage vehicle\n");
      out.write("        <option value=\"Improper garbage disposal\"/>Improper garbage disposal\n");
      out.write("        <option value=\"No dustbin\"/>No dustbin\n");
      out.write("        <option value=\"Poor Cleanliness and Hygiene\"/>Poor Cleanliness and Hygiene\n");
      out.write("        <option value=\"Road Garbage\"/>Road Garbage\n");
      out.write("        <option value=\"Sochalay Nirman\"/>Sochalay Nirman\n");
      out.write("        <option value=\"Unorganized house\"/>Unorganized house\n");
      out.write("        <option value=\"Urinating in Public\"/>Urinating in Public\n");
      out.write("               \n");
      out.write("    </select>\n");
      out.write("    \n");
      out.write("    <input class='text' type='text' style=\"height: 50px;\" name=\"description\" placeholder='Description' required>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("<!--    <input id='rememberMe' name='rememberMe' type='checkbox'> <label>Remember me</label>\n");
      out.write("    <br>-->\n");
      out.write("    \n");
      out.write("    <input class='button' type='submit' value='Submit'>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("    <script  src=\"../js(complaint)/index.js\"></script>\n");
      out.write("\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
