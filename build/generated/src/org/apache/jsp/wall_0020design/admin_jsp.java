package org.apache.jsp.wall_0020design;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Login Form</title>\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/admin.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"login\">\n");
      out.write("  <h2>Admin LogIn</h2>\n");
      out.write("  <form action=\"http://localhost:8080/Swach_Bharat/wall%20design/admin.jsp\" method=\"POST\">\n");
      out.write("  <fieldset>\n");
      out.write("      <input type=\"text\" name=\"Username\" placeholder=\"Username\" required=\"\" />\n");
      out.write("      <input type=\"password\" name=\"Password\" placeholder=\"Password\" required=\"\"/>\n");
      out.write("  </fieldset>\n");
      out.write("  <input type=\"submit\" value=\"Log In\" />\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("  ");

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
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
