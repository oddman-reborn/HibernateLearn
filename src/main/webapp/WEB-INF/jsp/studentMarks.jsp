<%-- 
    Document   : studentMarks
    Created on : Dec 16, 2017, 3:52:33 PM
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
        <h1>Enter Marks</h1>
        
        <form action="insertMark" modelAttribute="markSemister" method="POST">
            <label>GPA</label>
            <input type="number" name="gpa" step=".01">
            
            <label>Semister</label>
            <input type="text" name="semister">
            
            <input type="submit" value="Insert">
        </form>
    </body>
</html>
