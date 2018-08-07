package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Page3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"bootstrap-3.3.7-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #e6ecf0;\">\n");
      out.write("        <div class=\"container\" style=\"width: 100%; height: 300px; background-image: url(img/login.jpg) ;padding: 0%\">\n");
      out.write("            <div class=\"container\" style=\"width:100%; height: 50px; background-color: white\">\n");
      out.write("                <nav class=\"navbar navbar-nav navbar-fixed-top\" style=\"background-color: white\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <!--  <div class=\" navbar-header\" style=\"float: none; margin-left:1000px; margin-top: 30spx;\">\n");
      out.write("                                                             <button class=\"navbar-header\">Tweet</button>         \n");
      out.write("                                               </div> -->\n");
      out.write("                        <ul class=\"nav navbar-nav\"  style=\"padding-left:120px;\">\n");
      out.write("                            <li ><a href=\"#\">  <span class=\"g glyphicon glyphicon-home\"/><tr/>  Home</a></li>\n");
      out.write("                            <li><a href=\"#\">  <span class=\"g glyphicon glyphicon-bell\"/><tr/> Notifications</a></li>\n");
      out.write("                            <li><a href=\"#\"> <span class=\"g glyphicon glyphicon-envelope\"/> <tr/>Messages</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <a class=\"navbar-brand\" href=\"#\"> <img src=\"img/images.png\"  style=\"width: 30px; height: 30px; margin-left: 150px;\"alt=\"\"/></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group has-success has-feedback\">\n");
      out.write("                            <div class=\"col-sm-2\" style=\"margin-top: 10px; margin-left: 100px;\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputSuccess\" style=\"border-radius: 50px; \"placeholder=\"Search Twitter\" >\n");
      out.write("                                <span  style=\" margin-right: 10px;\"class=\"glyphicon glyphicon-search form-control-feedback\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"newPage.jsp\"> <img  style=\"height: 35px; margin-top: 3px;\"src=\"img/Screenshot (114).png\" alt=\"\"/></a>\n");
      out.write("                            <button style=\" margin-top: 10px  ; border-radius: 50px;background-color: #4AB3F4\" type=\"button\"class=\"btn btn-primary\"> Tweet</button>\n");
      out.write("                        </div>\n");
      out.write("                        <!--                <div class=\"input-group\" style=\" float: right;width:200px; padding-top: 9px ; margin-right:350px;\">\n");
      out.write("                                                                <input   style=\" border-radius:50px;\"type=\"search\"  class=\" glyphicon-search , form-control\" name=\"search\" placeholder=\"search\">\n");
      out.write("                                                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-search\"></i></span>\n");
      out.write("                                                            </div>-->\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" style=\"width:100%; height: 60px; margin-top: 200px; background-color: white;\">\n");
      out.write("                <nav class=\"navbar navbar-bottom\">\n");
      out.write("                    <div style=\"margin-left: 500px;\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li><a href=\"#\">Tweets<br/>11</a></li>\n");
      out.write("                            <li><a href=\"#\">Following<br/>15</a></li>\n");
      out.write("                            <li><a href=\"#\">Followers<br/>2</a></li>\n");
      out.write("                            <li><a href=\"#\">Likes<br/>110</a></li>\n");
      out.write("                            <li><a href=\"#\">Lists<br/>1</a></li>\n");
      out.write("                            <li><a href=\"#\">Moments<br/>111</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <button style=\"margin-top: 10px; margin-left: 30px ; border-radius: 50px\" type=\"button\" class=\"btn btn-default\">Edit Profile</button>\n");
      out.write("                </nav>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-8\" style=\"margin-top: -120px; margin-left: 170px;\">\n");
      out.write("            <img style=\"width: 120px; height: 120px; border-radius: 50%\" src=\"img/zzz.jpg\" alt=\"\"/>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"background-color:  #e6ecf0; width: 20%;height: 250px;margin-left: 200px; margin-top: 20px;\">\n");
      out.write("            <h4><a href=\"#\" style=\"color: black\"><b/>Mahmoud_Alsheikh</a></h4>\n");
      out.write("            <a  href=\"#\" style=\"color: black\">@mahmoud201420504</a>\n");
      out.write("            <br/>Information security technology\n");
      out.write("            <span class=\"glyphicon glyphicon-home\"> <tr/> Jordan _amman</span>\n");
      out.write("            <span class=\" glyphicon glyphicon-calendar\"> <tr/> Joined June 2016</span>\n");
      out.write("            <span class=\" glyphicon glyphicon-bold\"> Born on July 4, 1996 </span>\n");
      out.write("            <span class=\"glyphicon glyphicon-picture\"><a href=\"#\" style=\"color: black\"> <tr/>Photos and videos</a></span>\n");
      out.write("            <img src=\"img/zxc.png\" alt=\"\"/>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"background-color: white; width: 35%;height: 550px;margin-top:-250px;margin-left: 510px;\">\n");
      out.write("            <br/> <b>Tweets</b><a style=\"padding-left: 40px;\"href=\"#\">Tweets & replies</a>\n");
      out.write("            <a style=\"padding-left: 40px;\"href=\"#\">Media</a><hr/>\n");
      out.write("\n");
      out.write("            <img  style=\"width: 60px;height: 60px; border-radius: 50px;\"src=\"img/zzz.jpg\" alt=\"\"/>\n");
      out.write("            <a href=\"#\" style=\"color: black\">@Mahmoud61024033</a>\n");
      out.write("            31 Mar 2017\n");
      out.write("            ‏More\n");
      out.write("            Just posted a photo <a href=\"#\"> https://www.instagram.com/p/BSVWJoyABtwnwvnBO6I3kBBzIu-n3IBVBwFLDU0/ …</a><hr/>\n");
      out.write("\n");
      out.write("            <img  style=\"width: 60px;height: 60px; border-radius: 50px;\"src=\"img/zzz.jpg\" alt=\"\"/>\n");
      out.write("            <a href=\"#\" style=\"color: black\">@Mahmoud61024033</a>\n");
      out.write("            31 Mar 2017\n");
      out.write("            ‏More\n");
      out.write("            Just posted a photo <a href=\"#\"> https://www.instagram.com/p/BSVWJoyABtwnwvnBO6I3kBBzIu-n3IBVBwFLDU0/ …</a><hr/>\n");
      out.write("\n");
      out.write("            <img  style=\"width: 60px;height: 60px; border-radius: 50px;\"src=\"img/zzz.jpg\" alt=\"\"/>\n");
      out.write("            <a href=\"#\" style=\"color: black\">@Mahmoud61024033</a>\n");
      out.write("            31 Mar 2017\n");
      out.write("            ‏More\n");
      out.write("            Just posted a photo <a href=\"#\"> https://www.instagram.com/p/BSVWJoyABtwnwvnBO6I3kBBzIu-n3IBVBwFLDU0/ …</a><hr/>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"background-color:white; width: 20%;height: 250px;margin-left: 1000px; margin-top : -550px;\">\n");
      out.write("            <h4> How to follow <sub> - <a href=\"#\">Refresh</a> <tr/> <tr/> -<a href=\"#\">View all</a></sub><h4/> \n");
      out.write("                <a href=\"#\"><img src=\"img/Screenshot (114).png\" alt=\"\"/></a> <a style=\"font-size: 10px;\">Mahmoud_Alsheikh</a>\n");
      out.write("                <button class=\" btn btn-outline-primary\" type=\"button\" style=\" background-color:#1da1f2; border-radius: 50px;\">follow</button>\n");
      out.write("                <span  style=\"margin-left: 40px; margin-top: 5px;\"class=\" glyphicon glyphicon-envelope\"><a style=\"margin-left: 10px;\">Promoted</a></span><hr/>\n");
      out.write("                <a href=\"#\"><img style=\"height: 50px; width: 50px\"src=\"img/ali.png\" alt=\"\"/></a> <a style=\"font-size: 10px;\">Ali mousa</a>\n");
      out.write("                <button class=\" btn btn-outline-primary\" type=\"button\" style=\" background-color:#1da1f2; border-radius: 50px;\">follow</button>\n");
      out.write("                <span style=\"margin-left: 40px;\"class=\" glyphicon glyphicon-envelope\"><a style=\"margin-left:10px;\">Promoted</a></span>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"background-color:white; width: 20%;height: 250px;margin-left: 1000px; margin-top : 10px;\">\n");
      out.write("\n");
      out.write("            <br> <b/> Trends for you <sub/><a> -Change</a><br/>\n");
      out.write("            <a href=\"#\"><h4>#السعوديه_تطرد_السفير_الكندي</h4></a>@Ayed_Alosaimi and @khaberni are Tweeting about this<br/>\n");
      out.write("            <a href=\"#\"><h4>#اخبارالاردن_24</h4></a>#jordan the news in aqaba......<br/>\n");
      out.write("            <a href=\"#\"><h4>#اعتزال_محمد_عبده</h4>\n");
      out.write("            </a>3,519 Tweets....<br/>\n");
      out.write("            <a href=\"#\"><h4>#وش_يعني_اسمك</h4></a><br/>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"background-color:#e6ecf0; width: 20%;height: 150px;margin-left: 1000px; margin-top : 10px;\">\n");
      out.write("            © 2018 Twitter About Help Center Terms Privacy policy Cookies Ads info\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"bootstrap-3.3.7-dist/css/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"bootstrap-3.3.7-dist/js/bootstrap.js\" type=\"text/javascript\"></script>     \n");
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
