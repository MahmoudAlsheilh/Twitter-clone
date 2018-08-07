package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Page2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"bootstrap-3.3.7-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap-3.3.7-dist/css/newcss2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body  style=\"background-color:#e6ecf0;\">\n");
      out.write("        <div class=\"ss\" style=\"margin-left: 1000px;margin-top: 11px;\"><button  style=\"border-radius: 100px;\"class=\"btn-primary\">Tweet\n");
      out.write("            </button></div>\n");
      out.write("        <nav class=\"navbar navbar-nav navbar-fixed-top\" style=\"background-color: white\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <!--  <div class=\" navbar-header\" style=\"float: none; margin-left:1000px; margin-top: 30spx;\">\n");
      out.write("                              <button class=\"navbar-header\">Tweet</button>         \n");
      out.write("                </div> -->\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav\"  style=\"padding-left:120px;\">\n");
      out.write("                    <li ><a href=\"#\">  <span class=\"g glyphicon glyphicon-home\"/><tr/>  Home</a></li>\n");
      out.write("                    <li><a href=\"#\">  <span class=\"g glyphicon glyphicon-bell\"/><tr/> Notifications</a></li>\n");
      out.write("                    <li><a href=\"#\"> <span class=\"g glyphicon glyphicon-envelope\"/> <tr/>Messages</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"> <img src=\"img/images.png\"  style=\"width: 30px; height: 30px; margin-left: 150px;\"alt=\"\"/></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-group has-success has-feedback\">\n");
      out.write("                    <div class=\"col-sm-2\" style=\"margin-top: 10px; margin-left: 100px;\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"inputSuccess\" style=\"border-radius: 50px; \"placeholder=\"Search Twitter\" >\n");
      out.write("                        <span  style=\" margin-right: 10px;\"class=\"glyphicon glyphicon-search form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"newPage.jsp\"> <img  style=\"height: 35px; margin-top: 3px;\"src=\"img/Screenshot (114).png\" alt=\"\"/></a>\n");
      out.write("                    <button style=\" margin-top: 10px  ; border-radius: 50px;background-color: #4AB3F4\" type=\"button\"class=\"btn btn-primary\"> Tweet</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--                <div class=\"input-group\" style=\" float: right;width:200px; padding-top: 9px ; margin-right:350px;\">\n");
      out.write("                                    <input   style=\" border-radius:50px;\"type=\"search\"  class=\" glyphicon-search , form-control\" name=\"search\" placeholder=\"search\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-search\"></i></span>\n");
      out.write("                                </div>-->\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!--Box one-->\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\" position: fixed; width: 20%; height:100px ;background-color: white; margin-left: 10% ; margin-top: 50px\">\n");
      out.write("            <div>\n");
      out.write("                <img style=\"width:250px;height:100px; margin:0%\"src=\"img/mah.png\" alt=\"\"/></div>\n");
      out.write("            <div class=\"navbar-bottom\" style=\"margin-top: 25%;\"><h3>Mahmoud_Alsheikh</h3></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Box two-->\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\" position: fixed; width: 20%; height:390px ;background-color: white; margin-left: 10% ; margin-top: 160px\">\n");
      out.write("            <!--            <nav class=\"navbar navbar-left\">\n");
      out.write("                            Trends for you <sub/><a> -Change</a>\n");
      out.write("                            <div class=\"form-control\">\n");
      out.write("                                <ul class=\"nav navbar-link\">\n");
      out.write("                                    <li class=\"list-unstyled\"><a href=\"#\">Home</a></li>\n");
      out.write("                                    <li><a href=\"#\">About</a></li>\n");
      out.write("                                    <li><a href=\"#\">Help Center</a></li>\n");
      out.write("                                    <li><a href=\"#\">Blog</a></li>\n");
      out.write("                                    <li><a href=\"#\">Status</a></li>\n");
      out.write("                                    <li><a href=\"#\">Directory</a></li>\n");
      out.write("                                    <li><a href=\"#\">Settings</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>      -->\n");
      out.write("\n");
      out.write("            <br> <b/> Trends for you <sub/><a> -Change</a><br/>\n");
      out.write("            <a href=\"#\"><h4>#السعوديه_تطرد_السفير_الكندي</h4></a>@Ayed_Alosaimi and @khaberni are Tweeting about this<br/>\n");
      out.write("            <a href=\"#\"><h4>#اخبارالاردن_24</h4></a>#jordan the news in aqaba......<br/>\n");
      out.write("            <a href=\"#\"><h4>#اعتزال_محمد_عبده</h4>\n");
      out.write("            </a>3,519 Tweets....<br/>\n");
      out.write("            <a href=\"#\"><h4>#وش_يعني_اسمك</h4></a><br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Box three-->\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"position: fixed;width: 30%; height:1000px ;background-color: white; margin-left: 31% ; margin-top: 50px\">\n");
      out.write("\n");
      out.write("            <a href=\"#\"><img style=\"height: 50px;  margin-top: 15px;width: 50px\"src=\"img/ali.png\" alt=\"\"/></a> <a style=\"font-size: 10px;\">Ali mousa </a>#امس كنت اجري بحث بسيط وهنا خلاصة بحثي: \n");
      out.write("            تسهيل أدارتك للشبكة لا يعني عدم تطبيق اساسيات امن المعلومات، او ترك تطبيق افضل الممارسات في مجال امن المعلومات. \n");
      out.write("            خطأ بسيط قد يؤدي بحيات اشخاص او تعطيل مصالحهم، او حتى الاضرار بممتلكات.\n");
      out.write("            <img  style=\"width: 250px; height: 150px;\"src=\"img/Screenshot (18).png\" alt=\"\"/>\n");
      out.write("            <!--<span style=\"margin-left: 40px;\"class=\" glyphicon glyphicon-envelope\"><a style=\"margin-left:10px;\">Promoted</a></span><hr/>-->\n");
      out.write("            <hr/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <a href=\"#\"><img style=\"height: 50px;  margin-top: 15px;width: 50px\"src=\"img/ali.png\" alt=\"\"/></a> <a style=\"font-size: 10px;\">Ali mousa </a>\n");
      out.write("            صمم منزلك الآن مـع فـريق الـبـدر لـلإسـتـشـارات الـهـنـدسـيـة لــلـتـواصـل مـوبــايــل 790853703-00962 <hr/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Box four-->\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"position: fixed; width: 20%; height:400px ;background-color: white; margin-left: 62% ; margin-top: 50px \">\n");
      out.write("            <h4> How to follow <sub> - <a href=\"#\">Refresh</a> <tr/> <tr/> -<a href=\"#\">View all</a></sub><h4/> \n");
      out.write("                <a href=\"#\"><img src=\"img/Screenshot (114).png\" alt=\"\"/></a> <a style=\"font-size: 10px;\">Mahmoud_Alsheikh</a>\n");
      out.write("                <button class=\" btn btn-outline-primary\" type=\"button\" style=\" background-color:#1da1f2; border-radius: 50px;\">follow</button>\n");
      out.write("                <span  style=\"margin-left: 40px; margin-top: 5px;\"class=\" glyphicon glyphicon-envelope\"><a style=\"margin-left: 10px;\">Promoted</a></span><hr/>\n");
      out.write("                <a href=\"#\"><img style=\"height: 50px; width: 50px\"src=\"img/ali.png\" alt=\"\"/></a> <a style=\"font-size: 10px;\">Ali mousa</a>\n");
      out.write("                <button class=\" btn btn-outline-primary\" type=\"button\" style=\" background-color:#1da1f2; border-radius: 50px;\">follow</button>\n");
      out.write("                <span style=\"margin-left: 40px;\"class=\" glyphicon glyphicon-envelope\"><a style=\"margin-left:10px;\">Promoted</a></span><hr/>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Box five-->\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"position: fixed; width: 20%; height:100px ;background-color: white; margin-left: 62% ; margin-top: 455px \">\n");
      out.write("            <p>© 2018 TwitterAboutHelp CenterTermsPrivacy policyCookiesAds infoBrandBlogStatusAppsJobsMarketing <br/>BusinessesDevelopers . </p>\n");
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
