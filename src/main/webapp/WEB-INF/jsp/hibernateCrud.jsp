<%-- 
    Document   : hibernateCrud
    Created on : Dec 21, 2017, 2:24:00 AM
    Author     : Monirul Islam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>CRUD operation</h2>
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
            
            <table >
                <tr>
                    <th>Roll</th>
                    <th>Name</th>
                    <th>Action</th>
                </tr>
                
                <c:forEach items="${sList}" var="student">
                    <tr>
                        <td>${student.roll}</td>
                        <td>${student.name}</td>
                        
                        <td><a href="getStudent?id=${student.id}">Read</a>
                            <a href="deleteStudent?id=${student.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>
