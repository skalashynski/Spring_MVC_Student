<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Students</title>
</head>
<body>
<table>
    <c:forEach var="student" items="${studentList}">
        <tr>
            <td>${student.name}</td>
            <td><td>${student.surname}</td></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="/add-student">Add student</a>
</body>
</html>
