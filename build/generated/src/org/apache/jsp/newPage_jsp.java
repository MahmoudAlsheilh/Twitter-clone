package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"bootstrap-3.3.7-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap-3.3.7-dist/css/newCSS.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Twitter.com</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" style=\"  position: absolute  ;width: 50%; height: 93%; background-image: url(img/th.jpg);background-repeat: no-repeat; background-size: 100% 100% ; margin-top: 0px; margin-right: 25px ;margin-bottom: 10px\">\n");
      out.write("            <div class=\"container\" style=\"margin:auto\">\n");
      out.write("                <!--                <label>Follow your interests.</label>\n");
      out.write("                                <label>Hear what people are talking about. </label>\n");
      out.write("                                <label>Join the conversation.</label>\n");
      out.write("                -->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"d\">\n");
      out.write("                    <div class=\"a\"> <span class=\" g glyphicon glyphicon-search\"></span>\n");
      out.write("                        Follow your interests.</div>\n");
      out.write("                    <div class=\"a\"> <span class=\"g glyphicon glyphicon-user\"></span> <tr/>Hear what people are talking about.</div>\n");
      out.write("                    <div class=\"a\"> <span class=\"g glyphicon glyphicon-comment\"></span> <tr/> Join the conversation</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\" style=\" position: absolute ;\n");
      out.write("             width: 50%; height: 93%; background-color: white;\n");
      out.write("             margin-top: 0px; margin-left:682px; margin-bottom: 10px\">\n");
      out.write("<!--            \n");
      out.write("            <form action=\"https://twitter.com/sessions\" class=\"LoginForm js-front-signin\" method=\"post\" data-component=\"login_callout\" data-element=\"form\">\n");
      out.write("              <div class=\"LoginForm-input LoginForm-username\">\n");
      out.write("                <input type=\"text\" class=\"text-input email-input js-signin-email\" name=\"session[username_or_email]\" autocomplete=\"username\" placeholder=\"Phone, email, or username\">\n");
      out.write("              </div>\n");
      out.write("            <div class=\"LoginForm-input LoginForm-password\">\n");
      out.write("                <input type=\"password\" class=\"text-input\" name=\"session[password]\" placeholder=\"Password\" autocomplete=\"current-password\">\n");
      out.write("                            <div class=\"LoginForm-staticForgot\">\n");
      out.write("                          <a class=\"forgot\" href=\"/account/begin_password_reset\" rel=\"noopener\">Forgot password?</a>\n");
      out.write("                        </div>\n");
      out.write("             </div>-->\n");
      out.write("   <div class=\" n container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <input class=\" form-control\" type=\"text\"  placeholder=\"name,username,phone\"></div>\n");
      out.write("                    <div class=\"col-sm-4\" > <input class=\" form-control\" type=\"password\"  placeholder=\"Password\" ></div>\n");
      out.write("                    <div class=\"col-sm-4\"><button class=\"s btn-primary\">login</button></div>\n");
      out.write("                    <!-- <span class=\"Icon Icon--bird\"></span> -->\n");
      out.write("                </div>\n");
      out.write("                <a style=\"margin: 200px;\" href=\"#\">forget Password?</a>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"margin-left:15%; margin-top: 5%\"  > \n");
      out.write("                <img style=\" align-content: center\"      src=\"img/Screenshot (110).png\" alt=\"\"/><h2>See what’s happening in <br> the world right now</h2></div>\n");
      out.write("            <div class=\"col-sm-6\" style=\"margin-left: 200px; margin-top: 5%; \">\n");
      out.write("                <div style=\"margin-bottom: 7px;\">Join Twitter today.</div>\n");
      out.write("                <div><button class=\"btn-primary  form-control\" style=\"border-radius: 30px; margin-bottom: 5px;\">Sing up</button></div>\n");
      out.write("                <div><button class=\"btn-sm  form-control\" style=\"border-radius: 30px; margin-bottom: 5px;\">Login</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"position: absolute; \n");
      out.write("             width: auto; height: auto;\" ></div>\n");
      out.write("        <nav class=\"navbar navbar-nav navbar-fixed-bottom\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                    <li><a href=\"#\">About</a></li>\n");
      out.write("                    <li><a href=\"#\">Help Center</a></li>\n");
      out.write("                    <li><a href=\"#\">Blog</a></li>\n");
      out.write("                    <li><a href=\"#\">Status</a></li>\n");
      out.write("                    <li><a href=\"#\">Jobs</a></li>\n");
      out.write("                    <li><a href=\"#\">Terms</a></li>\n");
      out.write("                    <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                    <li><a href=\"#\">Marketing</a></li>\n");
      out.write("                    <li><a href=\"#\">Businesses</a></li>\n");
      out.write("                    <li><a href=\"#\">Developers</a></li>\n");
      out.write("                    <li><a href=\"#\">Directory</a></li>\n");
      out.write("                    <li><a href=\"#\">Settings</a></li>\n");
      out.write("                /'</ul> 24\n");
      out.write("\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">© 2018 Twitter</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("<script src=\"bootstrap-3.3.7-dist/css/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"bootstrap-3.3.7-dist/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
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
