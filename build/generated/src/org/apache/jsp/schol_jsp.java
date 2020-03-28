package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.oop.util.DbConnect;

public final class schol_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("   <style type=\"text/css\">\n");
      out.write("  .container {\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color:#00BF9A;\n");
      out.write("    font-family: Arial;\n");
      out.write("    padding:0px;\n");
      out.write("    height:200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container a {\n");
      out.write("    float: left;\n");
      out.write("    font-size: 20px;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 10px 12px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    float: left;\n");
      out.write("    overflow: hidden;\n");
      out.write("      \n");
      out.write("     \n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown .dropbtn {\n");
      out.write("    font-size: 20px;    \n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    background-color:inherit;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container a:hover, .dropdown:hover .dropbtn {\n");
      out.write("    background-color:#ABEBC6  ;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color:#7DCEA0;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    float: none;\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".centered {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 559px;\n");
      out.write("    left:1000px;\n");
      out.write("    transform: translate(-50%, -50%);\n");
      out.write("    color:white;\n");
      out.write("    font-size:30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" .button  {\n");
      out.write("  padding: 19px 39px 18px 39px;\n");
      out.write("  color: #FFF;\n");
      out.write("  background-color: #00BF9A;\n");
      out.write("  font-size: 18px;\n");
      out.write("  text-align: center;\n");
      out.write("  font-style: normal;\n");
      out.write(" width: 500px;\n");
      out.write("\n");
      out.write("  box-shadow: 0 -1px 0 rgba(255,255,255,0.1) inset;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("table {\n");
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
      out.write("    text-align: center;\n");
      out.write("    padding: 15px;\n");
      out.write("    width:50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #dddddd;\n");
      out.write("}\n");
      out.write(".footer {\n");
      out.write("           position:absolute;\n");
      out.write("           background-color:black;\n");
      out.write("        \n");
      out.write("           \n");
      out.write("        }   \n");
      out.write("\n");
      out.write("   </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("       \n");
      out.write("\n");
      out.write("     <div class=\"container\">   \n");
      out.write("      <img src=\"images/imageedit_2_5408162098.png\" width=\"250px\" height=\"150px\"style=\"  padding:0; margin-bottom:5px; margin-left:5px; margin-top:10px; float:left\">\n");
      out.write("      \n");
      out.write("       \n");
      out.write("    \n");
      out.write("\n");
      out.write("     \n");
      out.write("  <a href=\"index.jsp\" style=\"margin-left:700px; margin-top:60px;margin-right:30px;\">Home</a>\n");
      out.write("  \n");
      out.write("    <a href=\"courses.jsp\" style=\" margin-top:60px\">Courses</a>\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\" style=\"margin-left:10px; margin-top:57px\">ApplyFor</button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"schol.jsp\">Scholarship</a>\n");
      out.write("      <a href=\"transcript.jsp\">Transcript</a>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div> \n");
      out.write("  \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("    \t\n");
      out.write("<div>\n");
      out.write(" \n");
      out.write("  <img src=\"images/35-books-macbook_th.jpg\" style=\"width:1500px;height:700px; border:0px; padding:2px;\"/>\n");
      out.write("   <div class=\"centered\"><h2> Welcome To AVI Institute</h2>\n");
      out.write("     <h2 style=\"margin-left:25px;\">Make Your Dreams Happen</h2>\n");
      out.write("      \n");
      out.write("  <a href=\"signup.html\"><button class=\"button\" style=\"margin-left:19px;\">Create Account</button></a>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("</div> \n");
      out.write("\t \n");
      out.write("</div>\n");
      out.write("                             <div>      <h1 style=\"text-align:center; color:MediumSeaGreen; margin-top:4%;\">Scholarship Request Form</h1>\n");
      out.write("               <form method=\"POST\" action=\"AddScholarshipServlet\">\n");
      out.write("  <table>\n");
      out.write("  <tr>\n");
      out.write("  <td>Name with initials:</td>\n");
      out.write("  <td><input type=\"text\" name=\"Name\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("  <td>Student Registration Number :</td>\n");
      out.write("  <td><input type=\"text\" name=\"RegNum\" value=\"IT\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("  <td>Your Email:</td>\n");
      out.write("  <td><input type=\"mail\" name=\"Email\"></td>\n");
      out.write("  </tr>\n");
      out.write("   <tr><td>NIC num :</td>\n");
      out.write("  <td><input type=\"text\" name=\"NIC\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr><td>Study Programme:</td>\n");
      out.write("      <td>\n");

  try{
      DbConnect db=new DbConnect();
      Connection connection = db.getDBConnection();
      Statement myStm=connection.createStatement();
      String query ="SELECT * FROM course";
     ResultSet resultSet = myStm.executeQuery(query);
     while(resultSet.next()){

      out.write("\n");
      out.write("      \n");
      out.write("   <input type=\"radio\" name=\"StudyProgram\" value=\"");
      out.print(resultSet.getString(2));
      out.write('"');
      out.write('>');
      out.print(resultSet.getString(2));
      out.write(" <br>\n");
      out.write("  \n");
      out.write("   ");

      }
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }
   
      out.write("\n");
      out.write("  </td></tr><tr><td>Your GPA:</td>\n");
      out.write("  <td> <input type=\"text\" name=\"gpa\"> <br>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("  <input type=\"submit\" value=\"Submit\" style=\"float:right; margin-right:20%; margin-top:-10%; width:15%; height:5%;\">\n");
      out.write("\n");
      out.write("</form> \n");
      out.write("  </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<br/><br/><br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"color:white ; background-color:#00BF9A; width:1500px; height:290px;\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div style=\"margin-right:3px;float:left\">\n");
      out.write("\t\t\t<img src=\"images/imageedit_2_5408162098.png\" width=\"350px\" height=\"250px\" style=\"margin:0px; padding:0; border:0; margin-top:14px;\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<pre style=\"color:white;float:right; margin-right:10px;  font-size:20px; line-height:1.8;\"> \n");
      out.write("                            Our Location\n");
      out.write("                            36 De Kretser Pl, \n");
      out.write("                            Colombo 00400.\n");
      out.write("                            <B>Email:aviinfo@avicampus.edu.lk</B>\n");
      out.write("                            <B>Call:94112375689</B>\n");
      out.write("                       </pre>\n");
      out.write("\t\t</div>\n");
      out.write("                 \n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write(" </body>\n");
      out.write(" </html>\n");
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
