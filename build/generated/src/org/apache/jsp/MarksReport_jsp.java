package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.oop.util.DbConnect;

public final class MarksReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write(".creport {\n");
      out.write("    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 1000px;\n");
      out.write("    margin-top: 50px;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".creport td, #creport th {\n");
      out.write("    border: 1px solid black;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".creport tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write(".creport tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write(".creport th {\n");
      out.write("    padding-top: 12px;\n");
      out.write("    padding-bottom: 12px;\n");
      out.write("    text-align: left;\n");
      out.write("    background-color: #00BF9A;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<table class=\"creport\" align=\"center\" >\n");
      out.write("  <tr>\n");
      out.write("    <th>Course ID</th>\n");
      out.write("    <th>Course Name</th>\n");
      out.write("    <th>Number of student enrolled</th>\n");
      out.write("    <th></th>\n");
      out.write("    <th></th>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      ");

  try{
      
      Connection connection = DbConnect.getDBConnection();
      Statement myStm=connection.createStatement();
      String query ="SELECT c.CourseName,m.SubjectName,sum(Assignment,MidMarks,FinalMarks) as total from marks m,subject s where s.SubjectName=m.SubjectName and total>45";
     ResultSet resultSet = myStm.executeQuery(query);
     while(resultSet.next()){

      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString(1) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString(2) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString(3) );
      out.write("</td>\n");
      out.write("\n");
      out.write("      \t\t\t\t\t\t       \n");
      out.write("       \t\t\t\t\t\t   \n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("    ");

      }
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }
      out.write("\n");
      out.write("   </table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("                 \n");
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
