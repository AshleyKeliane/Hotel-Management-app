/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-03-30 01:48:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.demo.SearchService;
import com.demo.Room;
import com.demo.UserService;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class employee_005fsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(8);
    _jspx_imports_classes.add("com.demo.UserService");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.time.LocalDate");
    _jspx_imports_classes.add("java.time.format.DateTimeFormatter");
    _jspx_imports_classes.add("com.demo.SearchService");
    _jspx_imports_classes.add("com.demo.Room");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Employee</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"MainStyle.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("        <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("        <li><a href=\"customer_search.jsp\">Search Rooms</a></li>\r\n");
      out.write("        <li><a href=\"about.jsp\">About Us</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>\r\n");

    if (session.getAttribute("type").equals("customer")){
        response.sendRedirect("customer.jsp");
    } else if(session.getAttribute("type").equals("employee")){

    } else if (session.getAttribute("type").equals("admin")){
        response.sendRedirect("admin.jsp");
    } else {
        response.sendRedirect("index.jsp");
    }

    if (session.getAttribute("filter1").equals("no")){
        response.sendRedirect("employee_filter.jsp");
    }

    Date outDate = (Date) session.getAttribute("outdate1");
    String room = (String) session.getAttribute("room1");
    double price = (double) session.getAttribute("price1");
    String username = (String) session.getAttribute("name");

    if ("any".equals(room)) {
     room = null;
    }

    SearchService service1 = new SearchService();
    UserService service2 = new UserService();
    int employeeid = -1;
    ArrayList<Room> rooms = null;

    try {
        employeeid = service2.findEmployeeID(username);
        rooms = service1.employeeSearch(employeeid, outDate, room, price);
    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect("employee_error_display.jsp");
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2>Room Information</h2>\r\n");
      out.write("<div>\r\n");
      out.write("    ");

        if (rooms != null && !rooms.isEmpty()) {
            for (Room availableRoom : rooms) {
    
      out.write("\r\n");
      out.write("    <div class=\"room-container\">\r\n");
      out.write("        <ul class=\"room-info\">\r\n");
      out.write("            <li><span>Room ID: </span> ");
      out.print( availableRoom.getRoomID() );
      out.write("</li>\r\n");
      out.write("            <li><span>Hotel ID: </span> ");
      out.print( availableRoom.getHotelID() );
      out.write("</li>\r\n");
      out.write("            <li><span>Price: </span> ");
      out.print( availableRoom.getPrice() );
      out.write("</li>\r\n");
      out.write("            <li><span>Capacity: </span> ");
      out.print( availableRoom.getCapacity() );
      out.write("</li>\r\n");
      out.write("            <li><span>View: </span> ");
      out.print( availableRoom.getSea_mountainView() );
      out.write("</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <a href=\"employee_renting.jsp?roomIDs=");
      out.print( availableRoom.getRoomID() );
      out.write("\" class=\"book-button\">Rent Room</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");

            }
        } else {
            out.println("<p>No available rooms found.</p>");
        }
    
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"button-container1\">\r\n");
      out.write("        <form action=\"employee_filter.jsp\">\r\n");
      out.write("            <button type=\"submit\" class=\"button1\">Enter a new Search</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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