/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.38
 * Generated at: 2019-04-17 21:16:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<title>menu</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-family: Helvetica, Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Full-width input fields */\r\n");
      out.write("input[type=text], input[type=password], input[type=email] {\r\n");
      out.write("\twidth: 90%;\r\n");
      out.write("\tpadding: 12px 20px;\r\n");
      out.write("\tmargin: 8px 26px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Center the image and position the close button */\r\n");
      out.write(".imgcontainer {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tmargin: 24px 0 12px 0;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".avatar {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\tborder-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The Modal (background) */\r\n");
      out.write(".modal {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tz-index: 1;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("\tbackground-color: rgba(0, 0, 0, 0.4);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The Close Button (x) */\r\n");
      out.write(".close {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tright: 25px;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\tfont-size: 35px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".close:hover, .close:focus {\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add Zoom Animation */\r\n");
      out.write(".animate {\r\n");
      out.write("\tanimation: zoom 0.6s\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@\r\n");
      out.write("keyframes zoom {\r\n");
      out.write("\tfrom {transform: scale(0)\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("to {\r\n");
      out.write("\ttransform: scale(1)\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav id=\"menu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><button\r\n");
      out.write("\t\t\t\t\tonclick=\"document.getElementById('modal-wrapper-register').style.display='block'\">\r\n");
      out.write("\t\t\t\t\tRegister</button>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t<li><button\r\n");
      out.write("\t\t\t\t\tonclick=\"document.getElementById('modal-wrapper-login').style.display='block'\">\r\n");
      out.write("\t\t\t\t\tSign in</button>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"modal-wrapper-register\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t\t<form class=\"modal-content animate\" action=\"signUp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"imgcontainer\">\r\n");
      out.write("\t\t\t\t<span\r\n");
      out.write("\t\t\t\t\tonclick=\"document.getElementById('modal-wrapper-register').style.display='none'\"\r\n");
      out.write("\t\t\t\t\tclass=\"close\" title=\"Close PopUp\">&times;</span> <img src=\"1.png\"\r\n");
      out.write("\t\t\t\t\talt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("\t\t\t\t<h1 style=\"text-align: center\">JOIN US!</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Enter Username\" name=\"loginForm\">\r\n");
      out.write("\t\t\t\t<input type=\"email\" placeholder=\"Enter E-mail\" name=\"emailForm\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"Enter Password\" name=\"passwordForm\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"Confirm Password\" name=\"passConfirmform\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\">Register</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"modal-wrapper-login\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t\t<form class=\"modal-content animate\" action=\"login\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"imgcontainer\">\r\n");
      out.write("\t\t\t\t<span\r\n");
      out.write("\t\t\t\t\tonclick=\"document.getElementById('modal-wrapper-login').style.display='none'\"\r\n");
      out.write("\t\t\t\t\tclass=\"close\" title=\"Close PopUp\">&times;</span> <img src=\"1.png\"\r\n");
      out.write("\t\t\t\t\talt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("\t\t\t\t<h1 style=\"text-align: center\">WELCOME</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Enter Username\" name=\"loginForm\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"Enter Password\" name=\"passwordForm\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\">Sign in</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" style=\"margin: 26px 30px;\"> Remember\r\n");
      out.write("\t\t\t\tme <a href=\"#\"\r\n");
      out.write("\t\t\t\t\tstyle=\"text-decoration: none; float: right; margin-right: 34px; margin-top: 26px;\">Forgot\r\n");
      out.write("\t\t\t\t\tPassword ?</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t// If user clicks anywhere outside of the modal, Modal will close\r\n");
      out.write("\t\r\n");
      out.write("\tvar modalLogin = document.getElementById('modal-wrapper-login');\r\n");
      out.write("\tvar modalRegister = document.getElementById('modal-wrapper-register');\r\n");
      out.write("\t\t\r\n");
      out.write("\twindow.onclick = function(event) {\r\n");
      out.write("\t    if (event.target == modalLogin) {\r\n");
      out.write("\t    \tmodalLogin.style.display = \"none\";\r\n");
      out.write("\t    } else {\r\n");
      out.write("\t    \tif (event.target == modalRegister) {\r\n");
      out.write("\t    \t\tmodalRegister.style.display = \"none\";\r\n");
      out.write("\t \t    }\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}