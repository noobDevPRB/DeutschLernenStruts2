/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.38
 * Generated at: 2019-04-14 13:48:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<title>Modal Popup Box</title>\r\n");
      out.write("<style>\r\n");
      out.write("*{margin:0px; padding:0px; font-family:Helvetica, Arial, sans-serif;}\r\n");
      out.write("\r\n");
      out.write("/* Full-width input fields */\r\n");
      out.write("input[type=text], input[type=password], input[type=email] {\r\n");
      out.write("    width: 90%;\r\n");
      out.write("    padding: 12px 20px;\r\n");
      out.write("    margin: 8px 26px;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("\tfont-size:16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Set a style for all buttons */\r\n");
      out.write("button {\r\n");
      out.write("    background-color: #4CAF50;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 14px 20px;\r\n");
      out.write("    margin: 8px 26px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    width: 90%;\r\n");
      out.write("\tfont-size:20px;\r\n");
      out.write("}\r\n");
      out.write("button:hover {\r\n");
      out.write("    opacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Center the image and position the close button */\r\n");
      out.write(".imgcontainer {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin: 24px 0 12px 0;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write(".avatar {\r\n");
      out.write("    width: 200px;\r\n");
      out.write("\theight:200px;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The Modal (background) */\r\n");
      out.write(".modal {\r\n");
      out.write("\tdisplay:none;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    overflow: auto;\r\n");
      out.write("    background-color: rgba(0,0,0,0.4);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Modal Content Box */\r\n");
      out.write(".modal-content {\r\n");
      out.write("    background-color: #fefefe;\r\n");
      out.write("    margin: 4% auto 15% auto;\r\n");
      out.write("    border: 1px solid #888;\r\n");
      out.write("    width: 40%; \r\n");
      out.write("\tpadding-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The Close Button (x) */\r\n");
      out.write(".close {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    right: 25px;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    color: #000;\r\n");
      out.write("    font-size: 35px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".close:hover,.close:focus {\r\n");
      out.write("    color: red;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add Zoom Animation */\r\n");
      out.write(".animate {\r\n");
      out.write("    animation: zoom 0.6s\r\n");
      out.write("}\r\n");
      out.write("@keyframes zoom {\r\n");
      out.write("    from {transform: scale(0)} \r\n");
      out.write("    to {transform: scale(1)}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body background=\"../background1.png\">\r\n");
      out.write("\r\n");
      out.write("<h1 style=\"text-align:center; font-size:50px; color:#fff\">Modal Popup Box Login Form</h1>\r\n");
      out.write("\r\n");
      out.write("<button onclick=\"document.getElementById('modal-wrapper').style.display='block'\" style=\"width:200px; margin-top:200px; margin-left:160px;\">\r\n");
      out.write("Open Popup</button>\r\n");
      out.write("\r\n");
      out.write("<div id=\"modal-wrapper\" class=\"modal\">\r\n");
      out.write("  \r\n");
      out.write("  <form class=\"modal-content animate\" action=\"signup\" method = \"post\">\r\n");
      out.write("        \r\n");
      out.write("    <div class=\"imgcontainer\">\r\n");
      out.write("      <span onclick=\"document.getElementById('modal-wrapper').style.display='none'\" class=\"close\" title=\"Close PopUp\">&times;</span>\r\n");
      out.write("      <img src=\"1.png\" alt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("      <h1 style=\"text-align:center\">Modal Popup Box</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Username\" name=\"loginform\">\r\n");
      out.write("      <input type=\"email\" placeholder=\"Enter E-mail\" name=\"mailform\"> \r\n");
      out.write("      <input type=\"password\" placeholder=\"Enter Password\" name=\"passform\">      \r\n");
      out.write("      <button type=\"submit\">Register</button>\r\n");
      out.write("      \r\n");
      out.write("      <input type=\"checkbox\" style=\"margin:26px 30px;\"> Remember me      \r\n");
      out.write("      <a href=\"#\" style=\"text-decoration:none; float:right; margin-right:34px; margin-top:26px;\">Forgot Password ?</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("// If user clicks anywhere outside of the modal, Modal will close\r\n");
      out.write("\r\n");
      out.write("var modal = document.getElementById('modal-wrapper');\r\n");
      out.write("window.onclick = function(event) {\r\n");
      out.write("    if (event.target == modal) {\r\n");
      out.write("        modal.style.display = \"none\";\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
