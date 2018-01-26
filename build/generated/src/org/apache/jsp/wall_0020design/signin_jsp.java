package org.apache.jsp.wall_0020design;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/signin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id=\"img-main\">\n");
      out.write("        <div id=\"div2\">\n");
      out.write("            <a href=\"../wall design/index.html\"><img src=\"../image/signin/logo.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        <div id=\"div3\">\n");
      out.write("        <form id=\"login-form\" action=\"http://localhost:8080/Swach_Bharat/wall%20design/signin.jsp\" method=\"POST\">\n");
      out.write("  <div class=\"heading\">Login to Swachhta Abhiyan</div>\n");
      out.write("  <div class=\"left\">\n");
      out.write("    <label for=\"email\">Email</label> <br />\n");
      out.write("    <input type=\"email\" name=\"email\" id=\"email\" required=\"\"/> <br />\n");
      out.write("    <label for=\"password\">Password</label> <br />\n");
      out.write("    <input type=\"password\" name=\"password\" id=\"pass\" required=\"\"/> <br />\n");
      out.write("       <button style=\"width:10%;height:auto;float:left;\" type=\"submit\" >Login</button>\n");
      out.write("  </div>\n");
      out.write("</form> \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
