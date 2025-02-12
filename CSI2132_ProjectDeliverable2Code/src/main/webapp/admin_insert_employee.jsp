<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.demo.AdminService" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin</title>
    <link rel="stylesheet" href="MainStyle.css">
</head>
<body>
<nav>
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="login.jsp">Login</a></li>
        <li><a href="customer_search.jsp">Search Rooms</a></li>
        <li><a href="about.jsp">About Us</a></li>
    </ul>
</nav>

<%

    if (session.getAttribute("type").equals("customer")) {
        response.sendRedirect("customer.jsp");
    } else if (session.getAttribute("type").equals("employee")){
        response.sendRedirect("employee.jsp");
    } else if (session.getAttribute("type").equals("admin")){

    } else {
        response.sendRedirect("index.jsp");
    }
    try {
        if ("POST".equalsIgnoreCase(request.getMethod())) {
            // Retrieve form parameters
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            int chainid = Integer.parseInt(request.getParameter("chainid"));
            String address = request.getParameter("address");
            String role = request.getParameter("role");
            int ssn = Integer.parseInt(request.getParameter("ssn"));

            AdminService service = new AdminService();
            try {
                boolean worked = service.createEmployee(username, password, ssn, address, chainid, role);
                response.sendRedirect("admin_success.jsp");
            } catch (Exception e){
                e.printStackTrace();
                response.sendRedirect("admin_error.jsp");
            }
        }
    } catch (Exception e){
        response.sendRedirect("admin_error3.jsp");
    }
%>

<form method="post" class="login-form">
    <div class="form-group">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
    </div>
    <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
    </div>
    <div class="form-group">
        <label for="chainid">Hotel ID:</label>
        <input type="text" id="chainid" name="chainid" required>
    </div>
    <div class="form-group">
        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required>
    </div>
    <div class="form-group">
        <label for="role">Role:</label>
        <input type="text" id="role" name="role" required>
    </div>
    <div class="form-group">
        <label for="ssn">SSN:</label>
        <input type="text" id="ssn" name="ssn" required>
    </div>
    <button type="submit">Create employee</button>
</form>

<form action="admin_view_empkoyee.jsp" method="get" class="signup-button">
    <button type="submit">Go back</button>
</form>

</body>
</html>