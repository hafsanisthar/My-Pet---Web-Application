package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.SQLException;
import java.io.OutputStream;
import java.sql.Blob;
import Database.database;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class getAllImage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            if(session.getAttribute("username") != null){
            
            PreparedStatement pr= null;
            ResultSet rs=null;
            Connection con = database.getConnection();
            int uid = Integer.parseInt(session.getAttribute("uid").toString());
            byte arr[] = null;
            OutputStream ot = null;
            
            try{
                
                pr=con.prepareStatement("select image from photogallery where userId=?");
                pr.setInt(1, uid);
                rs = pr.executeQuery();
              while(rs.next()){  
              
                   
                    Blob b1= rs.getBlob("image");
                    arr = b1.getBytes(1,(int)b1.length());
               
              }            
                    response.setContentType("image/gif");
                    ot = response.getOutputStream();
                    
                    
      out.write("\n");
      out.write("              \n");
      out.write("            ");
while(rs.next()) { 
      out.write("      \n");
      out.write("                    <img =\"");
 ot.write(arr); 
      out.write("\" >\n");
      out.write("             \n");
      out.write("              \n");
      out.write("           ");
     }         
                    ot.flush();
                    ot.close();
                   
               
                   
               
             
            }catch(Exception e){
                e.getMessage();
            }
               
           
        
      out.write("\n");
      out.write("       \n");
      out.write("        ");
 while(rs.next()){ 
      out.write("\n");
      out.write("              \n");
      out.write("      ");
 }}else
                response.sendRedirect("signUp.jsp");
      out.write("\n");
      out.write("        \n");
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
