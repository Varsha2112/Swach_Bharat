package org.apache.jsp.wall_0020design;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chatbox_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>chatbox</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/chatbox.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"div1\">\n");
      out.write("            <a href=\"index.html\"><img src=\"../image/icons/logo.png\"></a>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"div2\">\n");
      out.write("<!--                <ol>\n");
      out.write("                    <li><a href=\"../wall_design/chatbox.jsp\">HOME</a></li>\n");
      out.write("                    <li><a href=\"\">PROFILE</a></li>\n");
      out.write("                    <li><a href=\"../wall_design/contact_us.jsp\">CONTACT US</a></li>\n");
      out.write("                    <li><a href=\"../wall_design/about.jsp\">ABOUT</a></li>\n");
      out.write("                    <li><a href=\"../wall_design/index.jsp\">LOGOUT</a></li>\n");
      out.write("                </ol>-->\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        <div class=\"div3\">\n");
      out.write("            <div class=\"chat\">\n");
      out.write("                <label class=\"Inbox\">Inbox</label><br><br>\n");
      out.write("                <br>     <p style=\"font-size: 15px;font-weight: bold;color:green\">Name:Abhishek</p>  \n");
      out.write("                <p style=\"font-size: 15px;font-weight: bold;color:yellow\">Message :Hi I am Harshit.</p>  \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"div4\">\n");
      out.write("            <div class=\"div5\">\n");
      out.write("                <div class=\"div6\">\n");
      out.write("                    <form action=\"http://localhost:8080/Swach_Bharat/wall%20design/chatbox.jsp\" method=\"POST\">\n");
      out.write("                        <input class=\"i1\" type=\"text\" placeholder=\"Your Name\" name=\"name\" maxlength=\"16\" required=\"\" style=\"position: relative;left: 1%;\">\n");
      out.write("                        <input class=\"i1\" type=\"text\" placeholder=\"Your Number\" name=\"mobile\" maxlength=\"10\" required=\"\" style=\"position: relative;left: 2%;\">\n");
      out.write("                        <input class=\"i1\" type=\"email\" placeholder=\"Your Email\" name=\"email\" required=\"\" style=\"position: relative;left: 3%;\"> <br>\n");
      out.write("                        <textarea class=\"t1\" placeholder=\"Message\" name=\"msg\" required=\"\"></textarea>\n");
      out.write("                        <input class=\"i2\" type=\"text\" placeholder=\"Your Address\" name=\"address\" maxlength=\"50\" required=\"\">\n");
      out.write("                        <input class=\"i3\" type=\"submit\" value=\"Send Message\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("           </div>\n");
      out.write("         ");

        
if(request.getMethod()=="POST"){

String name= request.getParameter("name");
String mobile= request.getParameter("mobile");
String email= request.getParameter("email");
String msg= request.getParameter("msg");
String address= request.getParameter("address");

bean_model.chatbox_bean b1=new bean_model.chatbox_bean();

b1.setName(name);
b1.setMobile(mobile);
b1.setEmail(email);
b1.setMsg(msg);
b1.setAddress(address);

app.expert_chat tu=new app.expert_chat();

boolean b=tu.chat(b1);

                   if(b)
               {
//                    out.println("success");
//                   response.sendRedirect("contact_us_response.jsp");
     
                  }
                 else{
//                    out.println("unsuccess");
                  }

            
            }
        
      out.write("\n");
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
