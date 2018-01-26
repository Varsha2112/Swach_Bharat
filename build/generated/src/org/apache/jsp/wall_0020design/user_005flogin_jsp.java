package org.apache.jsp.wall_0020design;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/user_login.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String email=(String)request.getSession().getAttribute("email");
        String mobile=(String)request.getSession().getAttribute("mobile");
        String username=(String)request.getSession().getAttribute("username");
        String name=(String)request.getSession().getAttribute("name");
        String dob=(String)request.getSession().getAttribute("birthday");
        String town=(String)request.getSession().getAttribute("town");
        String state=(String)request.getSession().getAttribute("state");
        String country=(String)request.getSession().getAttribute("country");
        String pincode=(String)request.getSession().getAttribute("pincode");
     
        
      out.write("\n");
      out.write("   <div id=\"top\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"../wall design/index.html\">HOME</a></li>\n");
      out.write("                    <li><a href=\"../wall design/complaint.jsp\">COMPLAINT</a></li>\n");
      out.write("                    <li><a href=\"../wall design/user_login.jsp\">PROFILE</a></li>\n");
      out.write("                    <li><a href=\"../wall design/chatbox.jsp\">CHATBOX</a></li>\n");
      out.write("                    <li><a href=\"../wall design/contact_us.jsp\">CONTACT US</a></li>\n");
      out.write("                    <li><a href=\"../wall design/signin.jsp\">LOGOUT</a></li>\n");
      out.write("                </ul>\n");
      out.write("</div>        \n");
      out.write("<div id=\"Uname\">\n");
      out.write("    <h1>User Profile</h1>\n");
      out.write("</div>\n");
      out.write("    <div id=\"back\">\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            <img id=\"img1\" src=\"../image/user_login/account-profile-use.png\">\n");
      out.write("            \n");
      out.write("            <h2 style=\"margin-top: 3%;\">Name</h2>\n");
      out.write("<!--            <ul>\n");
      out.write("                <li><a href=\"#\">General</a></li>\n");
      out.write("                <li><a href=\"#\">Home</a></li>\n");
      out.write("            </ul>-->\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"Pro_id\">\n");
      out.write("<!--        profile photo    -->\n");
      out.write("<img id=\"img2\" src=\"../image/user_login/account-profile-use.png\">\n");
      out.write("        </div>\n");
      out.write("        <div id=\"info\">\n");
      out.write("<!--        personal data-->\n");
      out.write("            <div id=\"con_info\">\n");
      out.write("<!--                user information-->\n");
      out.write("                <h3 style=\"font-family:Arial;\">Contact Information</h3>\n");
      out.write("                <form>\n");
      out.write("                    E-Mail : &nbsp;&nbsp;&nbsp;<input type=\"email\" name=\"Email\" placeholder=\"");
 out.print(email);
      out.write("\" required=\"\"><br><br>\n");
      out.write("                Phone &nbsp;: &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"Phone\" placeholder=\"");
 out.print(mobile);
      out.write("\" required=\"\" maxlength=\"10\"><br><br>\n");
      out.write("                <h3 style=\"font-family:arial;\">General Information</h3>\n");
      out.write("                User Name : &nbsp; <input type=\"text\" name=\"Uname\" placeholder=\"");
out.print(username);
      out.write("\" required=\"\"><br><br>\n");
      out.write("                Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"Name\" placeholder=\"");
out.print(name);
      out.write("\" required=\"\"><br><br>\n");
      out.write("                D.O.B &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"DOB\" placeholder=\"");
out.print(dob);
      out.write("\" required=\"\"><br><br>\n");
      out.write("                Town &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"Town\" placeholder=\"");
out.print(town);
      out.write("\" required=\"\"><br><br> \n");
      out.write("                State &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"State\" placeholder=\"");
out.print(state);
      out.write("\" required=\"\"><br><br>\n");
      out.write("                Country &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"Country\" placeholder=\"");
out.print(country);
      out.write("\" required=\"\"><br><br> \n");
      out.write("                Pincode &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"Pincode\" placeholder=\"");
out.print(pincode);
      out.write("\" required=\"\"><br><br> \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"update\">\n");
      out.write("<!--            Edit Profile-->\n");
      out.write("                \n");
      out.write("                <h3 style=\"font-family:Arial; margin-left:15%;\">Actions</h3>\n");
      out.write("                \n");
      out.write("                <ol>\n");
      out.write("                    <img id=\"img3\" src=\"../image/user_login/pencil.PNG\">\n");
      out.write("                    \n");
      out.write("                    <li><a style=\"display: block;\" href=\"#\">Edit</a></li>\n");
      out.write("                    <li><a style=\"display: block;\" href=\"#\">Update</a></li>\n");
      out.write("                    <li style=\"padding-left: 40px;width: 75%;\"><a href=\"../wall design/user_login.jsp\">Reset</a></li>\n");
      out.write("                </ol>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
