package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.oop.util.DbConnect;

public final class checkmarks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(".course {\n");
      out.write("    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 1000px;\n");
      out.write("    margin-top: 50px;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".course td, #course th {\n");
      out.write("    border: 1px solid black;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".course tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write(".course tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write(".course th {\n");
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
      out.write("<table class=\"course\" align=\"center\" >\n");
      out.write("  <tr>\n");
      out.write("    <th>Student ID</th>\n");
      out.write("    <th>Course Name</th>\n");
      out.write("    <th>Number of completely updated Subjects</th>\n");
      out.write("    <th>Number of Subjects</th>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      ");

  try{
      DbConnect db=new DbConnect();
      Connection connection = db.getDBConnection();
      Statement myStm=connection.createStatement();
      String query ="SELECT m.StudentId,r.course,count((m.SubjectName),count(s.SubjectName) FROM marks m,subject s,register r where m.StudentId=r.StudentRegNo and r.course=s.CourseName and (MidMarks!='' or MidMarks is not null) and (Assignment!=''or Assignment is not null) and (FinalMarks!=''or FinalMarks is not null) group by m.StudentId,r.course ";
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
      out.write("<td>");
      out.print(resultSet.getString(4) );
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
