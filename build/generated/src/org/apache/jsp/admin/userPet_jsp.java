package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import Database.database;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class userPet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Custom styles for this template -->\n");
      out.write("  <link href=\"css/simple-sidebar.css\" rel=\"stylesheet\">\n");
      out.write("  <style>\n");
      out.write(".first{\n");
      out.write("width:900px;\n");
      out.write("height:500px;\n");
      out.write("margin:50px auto;\n");
      out.write("padding:50px;\n");
      out.write("background-color:whitesmoke;\n");
      out.write("color:#333;\n");
      out.write("border:2px solid background;\n");
      out.write("border-radius:40px 40px 40px 40px;\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"first\">\n");
      out.write("          <div class=\"d-flex\" id=\"wrapper\">\n");
      out.write("       ");

              
        
            Connection con = null;
            PreparedStatement pr = null;
            ResultSet rs = null;
            String sql= null;
            int uid  = Integer.parseInt(request.getParameter("id"));
            try{
                con = database.getConnection();
                sql = "select * from pet where uid=?";
                pr = con.prepareStatement(sql);
                pr.setInt(1, uid);
                rs = pr.executeQuery();
            
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        
      out.write("\n");
      out.write("        \n");
      out.write("         <table align=\"center\" class=\"table table-sm\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th>Image</th>\n");
      out.write("                <th>Name</th> \n");
      out.write("                <th>Type</th>\n");
      out.write("                 <th>Breed</th>\n");
      out.write("                <th>Sex</th> \n");
      out.write("                <th>Color</th>\n");
      out.write("                <th>Veterinarian</th>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("       \n");
      out.write("          \n");
      out.write("             ");
 while(rs.next()) { 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><img class=\"rounded\" src=\"getPetImage.jsp?id=");
      out.print(rs.getInt("pid") );
      out.write("\" alt=\"\" height=\"100px\" width=\"150px\"/></td>     \n");
      out.write("                <td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("type") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("breed") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("sex") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("color") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("veterinarian") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("              <tr></tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </table>\n");
      out.write("           \n");
      out.write("          </div>     \n");
      out.write("        </div>    \n");
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
