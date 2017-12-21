<%-- 
    Document   : studentNew
    Created on : Nov 27, 2017, 1:55:53 PM
    Author     : Md. Monirul Islam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Student</title>
    </head>
    <body>
        <h3>Fill up the form</h3>
        
        <form ModelAttribute="studentInfo" action="addStudent" method="POST">
            <label>Roll no: </label>
            <input type="number" name="roll" required>
            
            <label>Name: </label>
            <input type="text" name="name" required>
            
            <label>Father: </label>
            <input type="text" name="father" required>
            
            <label>E-mail</label>
            <input type="email" name="email" required>
            
            <input type="submit" value="Insert">
            
        </form>
    </body>
</html>
