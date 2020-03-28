package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class UserProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");


    String url = "jdbc:mysql://localhost:3306/login";
    String username = "root";
    String password = "";
    try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();

    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .container {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color:MediumSeaGreen;\n");
      out.write("                font-family: Arial;\n");
      out.write("                padding:0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container a {\n");
      out.write("                float: left;\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 10px 12px;\n");
      out.write("                text-decoration: none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown {\n");
      out.write("                float: left;\n");
      out.write("                overflow: hidden;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown .dropbtn {\n");
      out.write("                font-size: 20px;    \n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                background-color:inherit;\n");
      out.write("                margin-top:5%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container a:hover, .dropdown:hover .dropbtn {\n");
      out.write("                background-color:#ABEBC6  ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color:#7DCEA0;\n");
      out.write("                min-width: 160px;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a {\n");
      out.write("                float: none;\n");
      out.write("                color: black;\n");
      out.write("                padding: 12px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                font-family:cursive;\n");
      out.write("                font-style:italic;\n");
      out.write("                color:#00BF9A;\n");
      out.write("                font-size: 100px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                width: 50%;\n");
      out.write("                height: 80%;\n");
      out.write("            }\n");
      out.write("            a1{\n");
      out.write("                size: 50%,50%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">   \n");
      out.write("            <img src=\"images/imageedit_2_5408162098.png\" width=\"15%\" height=\"15%\"style=\"  padding:0; margin-bottom:1%; margin-left:1%; margin-top:1%; float:left\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <a href=\"#home\" style=\"margin-left:50%; margin-right:4%; margin-top:4%\">Home</a>\n");
      out.write("\n");
      out.write("            <a href=\"coursepage-std.html\" style=\"margin-right:3%; margin-top:4%\">Courses</a>\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <button class=\"dropbtn\" style=\"margin-left:2%; margin-top:45%\">ApplyFor</button>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"scholarship-std.html\">Scholarship</a>\n");
      out.write("                    <a href=\"transcript-std.html\">Transcript</a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Student Details</h1>\n");
      out.write("        <div class=\"a1\">\n");
      out.write("            <form action=\"\">\n");
      out.write("                <table style=\"height:50%; width:50%;\">\n");
      out.write("                    ");

                        try {
                            
	                    String Id = (String) session.getAttribute("Username");
                            Connection myCon = DriverManager.getConnection(url, username, password);
                            Statement myStm = myCon.createStatement();
                             if (session != null) {
			    if (session.getAttribute("Username") != null) {
                            String query = "SELECT* FROM register where StudentRegNo='"+Id+"'";
                         
                            ResultSet resultSet = myStm.executeQuery(query);

                            while (resultSet.next()) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>    \n");
      out.write("                        <td>  Name:</td>\n");
      out.write("                        <td> ");
      out.print(resultSet.getString("name"));
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> Student Registration Number:</td>\n");
      out.write("                        <td> ");
      out.print(resultSet.getString("StudentRegNo"));
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>  Email:</td>\n");
      out.write("                        <td> ");
      out.print(resultSet.getString("email"));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> NIC Number:</td>\n");
      out.write("                        <td> ");
      out.print(resultSet.getString("nic"));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> Student Contact Number::</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("contactNo"));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Course:</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("course"));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <td><a href=\"Register.jsp?.name=");
      out.print(resultSet.getString("name"));
      out.write("\"><button class=\"update\" type=\"button\">Update</button></a></td>\n");
      out.write("                    <td><a href=\"UserDelete?.name=");
      out.print(resultSet.getString("name"));
      out.write("\"><button class=\"delete\" type=\"button\">Delete</button></a></td>\n");
      out.write("\n");
      out.write("                    ");

                            }}}
                            myCon.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
