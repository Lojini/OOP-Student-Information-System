package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.*;
import com.oop.util.DbConnect;

public final class PaySheet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    <style>\n");
      out.write("        table {\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 70%;\n");
      out.write("   margin-left:15%;\n");
      out.write("  margin-bottom:15%;\n");
      out.write(" margin-top:5%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("    border: 1px solid #dddddd;\n");
      out.write("    \n");
      out.write("    padding: 20px;\n");
      out.write("    width:50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #dddddd;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            \n");
      out.write("            <table> \n");
      out.write("            <tr colspan=\"2\">\n");
      out.write("               ");

  try{
      
	String Id = (String) session.getAttribute("Username");
       DbConnect db=new DbConnect();
      Connection connection = db.getDBConnection();
      Statement myStm1=connection.createStatement();
      if (session != null) {
			if (session.getAttribute("Username") != null) {
            String qry="select * from register where StudentRegNo='"+Id+"'";
            ResultSet result=myStm1.executeQuery(qry);
         while(result.next()){

      out.write("\n");
      out.write("                <td align=\"left\"><h4>Student Name: ");
      out.print(result.getString(1) );
      out.write(" <br><br><br> Student Id: ");
      out.print(result.getString(2) );
      out.write("</h4></td>\n");
      out.write("                <td><h4>Course Name: ");
      out.print(result.getString(7) );
      out.write("</h4></td> ");
}
      out.write("\n");
      out.write("            </tr> \n");
      out.write("          \n");
      out.write("            </table> \n");
      out.write("        </div>\n");
      out.write("            <table>\n");
      out.write("                        <tr> \n");
      out.write("                   ");
  Statement myStm=connection.createStatement();
                       String query ="SELECT gpa,Fees FROM scholarship s,course c where s.StudyProgram=c.CourseName and s.RegNum='"+Id+"'";
                     ResultSet resultSet = myStm.executeQuery(query);
                    
                      
                      double finalfee=0;
                         while(resultSet.next()){
      out.write("\n");
      out.write("                         <td>Course Fee:</td>   \n");
      out.write("                         <td> ");
      out.print(resultSet.getString("Fees") );
      out.write("</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Scholarship Type</td>\n");
      out.write("                            <td>");
  double gpa=Double.parseDouble(resultSet.getString("gpa"));
                                    double Fees=Double.parseDouble(resultSet.getString("Fees"));
                                    
                                  if(gpa==4.0){
                                     
                                      out.println("Full");
                                       finalfee=00.00; }
                                  else if(gpa>=3.7 && gpa<4.0){
                                      
                                     out.println("Half");
                                      finalfee=Fees*0.5;}
                                 
      out.write("</tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Final fees Amount:</td>\n");
      out.write("                            <td>");
      out.print( finalfee );
      out.write("</td>\n");
      out.write("                                  \n");
      out.write("                                 </tr></table>\n");
      out.write("                   ");
  }}}
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }
   
      out.write("\n");
      out.write("          \n");
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
