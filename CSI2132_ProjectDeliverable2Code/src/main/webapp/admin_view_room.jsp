<%@ page import="com.demo.AdminService" %>
<%@ page import="com.demo.Room" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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


 %>

 <%
     AdminService service = new AdminService();
     ArrayList<Room> listy = null;

     try {
         listy = service.roomList();
     } catch (Exception e) {
         e.printStackTrace();
         response.sendRedirect("admin_error2.jsp");
     }
 %>

 <h2>All Rooms</h2>
 <div>
     <%
         if (listy != null && !listy.isEmpty()) {
             for (Room thing : listy) {
     %>
     <div class="room-container">
         <ul class="room-info">
             <li><span>Room ID: </span> <%= thing.getRoomID() %></li>
             <li><span>Hotel ID: </span> <%= thing.getHotelID() %></li>
             <li><span>Price: </span> <%= thing.getPrice() %></li>
             <li><span>Type: </span> <%= thing.getCapacity() %></li>
             <li><span>View: </span> <%= thing.getSea_mountainView() %></li>
             <li><span>Extension: </span> <%= thing.getExtension() %></li>
             <li><span>Damage: </span> <%= thing.getDamage() %></li>
         </ul>
         <a href="admin_edit_room.jsp?objectid=<%= thing.getRoomID() %>" class="book-button">Edit</a>
         <a href="admin_delete_room.jsp?objectid=<%= thing.getRoomID() %>" class="book-button">Delete</a>
     </div>
     <%
             }
         } else {
             out.println("<p>No rooms found.</p>");
         }
     %>
 </div>

 <div class="button-container1">
     <form action="admin.jsp">
         <button type="submit" class="button1">Go back</button>
     </form>
     <form action="admin_insert_room.jsp">
          <button type="submit" class="button1">Create room</button>
     </form>
 </div>


  </body>
  </html>