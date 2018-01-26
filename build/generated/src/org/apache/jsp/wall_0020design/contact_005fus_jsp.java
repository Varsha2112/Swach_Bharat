package org.apache.jsp.wall_0020design;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/contact_us.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class =\"icon\">\n");
      out.write("          <a href=\"../wall design/index.html\"><img src=\"../image/icons/logo.png\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <h1>Contact Us</h1>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"http://localhost:8080/Swach_Bharat/wall%20design/contact_us.jsp\" method=\"POST\">\n");
      out.write("            <div>\n");
      out.write("  <div class=\"left\">\n");
      out.write("      <input type=\"text\" name=\"Name\" id=\"name\" placeholder=\"Name\" required=\"\" /> \n");
      out.write("      <input type=\"email\" name=\"Email\" id=\"email\" placeholder=\"Email\" required=\"\"/> \n");
      out.write("      <input type=\"text\" name=\"Subject\" id=\"subject\" placeholder=\"Subject\" required=\"\" /> \n");
      out.write("  </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <textarea style=\"\" name=\"Message\" placeholder=\"Message\" cols=\"35\" rows=\"7\" required=\"\" ></textarea>\n");
      out.write("  </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"middle\">\n");
      out.write("                <div class=\"submit\">\n");
      out.write("                <input style=\"color:#e52f53;cursor: pointer;border: 2px solid white\" \n");
      out.write("                       type=\"submit\" value=\"Submit\">     \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("   \n");
      out.write("        </form> \n");
      out.write("        ");
 
            if(request.getMethod()=="POST"){
            
            String name=request.getParameter("Name");
            String email=request.getParameter("Email");
            String subject=request.getParameter("Subject");
            String message=request.getParameter("Message");
            
            bean_model.contact_us_bean b1=new bean_model.contact_us_bean();
            b1.setName(name);
            b1.setEmail(email);
            b1.setSubject(subject);
            b1.setMessage(message);
            
            app.contact_us_message rs=new app.contact_us_message();
            
            boolean b=rs.sending_message(b1);
            
            if(b)
               {
//                    out.println("success");
                   response.sendRedirect("contact_us_response.jsp");
     
                  }
                 else{
                    out.println("unsuccess");
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
