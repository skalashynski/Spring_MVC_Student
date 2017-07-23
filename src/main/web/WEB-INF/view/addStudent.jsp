<%--
  Created by IntelliJ IDEA.
  User: Сергей
  Date: 23.07.2017
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<table>
    <form:form action="add-student" method="post">
        <tr>
            <td>Name</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Surname</td>
            <td><form:input path="surname"></form:input></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
    </form:form>
</table>
<br/>
<a href="/students">Show students</a>
</body>
</html>