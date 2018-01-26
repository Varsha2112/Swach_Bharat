package org.apache.jsp.wall_0020design;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/admin_panel.css\">\n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("    <div id=\"main\">\n");
      out.write("    <header>\n");
      out.write("        <img id=\"logo1\" src=\"../image/icons/logo.png\">\n");
      out.write("    <input id=\"input1\" name=\"search\" type=\"text\" placeholder=\"Search...\">\n");
      out.write("        <div id=\"msg\">\n");
      out.write("            <a href=\"#\"><img class=\"logo2\" src=\"../image/admin_panel/bell1.png\"></a>\n");
      out.write("            <a href=\"#\"><img class=\"logo2\" src=\"../image/admin_panel/message1.png\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"user\">\n");
      out.write("        <img id=\"img1\" src=\"../image/admin_panel/Vishal2.png\">\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("        <div id=\"dashboard\">\n");
      out.write("        <div id=\"profile\">\n");
      out.write("        <img style=\"height:80%; float:left;\" id=\"img2\" src=\"../image/admin_panel/Vishal2.png\">\n");
      out.write("            <h3 style=\"float:left; color:white;font-family:Bell MT;margin-bottom:0%;margin-left:7%;\">Welcome</h3>\n");
      out.write("            <h3 style=\"float:left; color:white;font-family:Bell MT;margin-left:7%;margin-top:5%;\">Mr. Abhishek</h3>\n");
      out.write("        </div>\n");
      out.write("        <ul>\n");
      out.write("        <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("        <li><a href=\"#\">Home</a></li>\n");
      out.write("        <li><a href=\"chatbox.jsp\">Chat</a></li>\n");
      out.write("        <li><a href=\"#\">Query</a></li>\n");
      out.write("        <!--<li><a href=\"#\">Gallery</a></li>-->\n");
      out.write("    \n");
      out.write("    </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"content_box\">\n");
      out.write("        <img id=\"logo2\" src=\"../image/admin_panel/home1.png\" style=\"height:30px;margin:6px; float:left;border: 0.1px solid blue\">\n");
      out.write("        <a href=\"#\" style=\"text-decoration:none; line-height:50px;\">Home ></a>\n");
      out.write("    </div>\n");
      out.write("<div id=\"left\">\n");
      out.write("    \n");
      out.write("    <a href=\"#\"><img style=\"margin-top:9%;margin-left:1%;float:left;height: 110px;width:100px;\" src=\"../image/admin_panel/mid_sec/Hamzasaleem-Stock-Style-2-Mission-Control.ico\"></a>\n");
      out.write("    \n");
      out.write("    <h1> 12 Unread Messages</h1>\n");
      out.write("<!--Left Side Contents    -->\n");
      out.write("    </div>\n");
      out.write("    <div id=\"mid\">\n");
      out.write("        <a href=\"#\"><img style=\"margin-top:9%;margin-left:1%;float:left;height: 110px;width:115px;\" src=\"../image/admin_panel/mid_sec/18c1ba51.png\"></a>\n");
      out.write("        <h1 style=\"margin-top:15%\">Visitors</h1>\n");
      out.write("        <h1 style=\"margin-top: 2%;\">30</h1>\n");
      out.write("<!--    Mid side Contents-->\n");
      out.write("    </div>\n");
      out.write("    <div id=\"right\">\n");
      out.write("        <a href=\"#\"><img style=\"margin-top:9%;margin-left:3%;float:left;height: 110px;width:115px;\" src=\"../image/admin_panel/mid_sec/33308.png\"></a>\n");
      out.write("        <h1 style=\"margin-top:15%\">Users</h1>\n");
      out.write("        <h1 style=\"margin-top: 2%\">7</h1>\n");
      out.write("<!--    Right Side Contents-->\n");
      out.write("    </div>\n");
      out.write("    <div id=\"complaint\">\n");
      out.write("        <a href=\"#\"><img style=\"margin-top:12%;margin-left:3%;float:left;height: 110px;width:115px;\" src=\"../image/admin_panel/mid_sec/89569-200.png\"></a>\n");
      out.write("        <h1 style=\"margin-top:19%\">Complaints</h1>\n");
      out.write("        <h1 style=\"margin-top: 2%\">3</h1>\n");
      out.write("        \n");
      out.write("    <!--<h1>Graph</h1>-->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div id=\"sub_gf\">\n");
      out.write("        \n");
      out.write("        <a href=\"#\"><img style=\"margin-top:15%;margin-left:3%;float:left;height: 110px;width:115px;\" src=\"../image/admin_panel/mid_sec/notification-circle-blue-512.png\"></a>\n");
      out.write("        <h1 style=\"margin-top:21%\">Notifications</h1>\n");
      out.write("        <h1 style=\"margin-top:2%\">19</h1>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
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
