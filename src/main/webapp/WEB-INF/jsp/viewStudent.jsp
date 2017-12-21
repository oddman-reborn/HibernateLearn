<%-- 
    Document   : viewStudent
    Created on : Dec 21, 2017, 3:27:00 AM
    Author     : Monirul Islam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <label>ID</label>
        <p>${std.id}</p><br>
        
        <label>Name</label>
        <p>${std.name}</p><br>
        
        <label>Father</label>
        <p>${std.father}</p><br>
        
        <label>Roll</label>
        <p>${std.roll}</p><br>
        
        <label>Email</label>
        <p>${std.email}</p><br>
        
        <a href="crud">CRUD page</a>
    </body>
</html>
