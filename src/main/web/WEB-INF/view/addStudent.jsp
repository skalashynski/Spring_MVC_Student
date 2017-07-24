<%--
  Created by IntelliJ IDEA.
  User: Сергей
  Date: 23.07.2017
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<table>
    <form:form action="add-student" method="post">
        <tr>
            <td>Ssn</td>
            <td><form:input path="ssn"/></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Surname</td>
            <td><form:input path="surname"></form:input></td>
        </tr>
        <tr>
            <td>Birthday</td>
            <td><form:input path="birthday"/></td>
        </tr>
        <tr>
            <td>Start Study Date</td>
            <td><form:input path="startStudyDate"/></td>
        </tr>
        <tr>
            <td>End Study Date</td>
            <td><form:input path="endStudyDate"/></td>
        </tr>
        <tr>
            <td>Username</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><form:input path="gender"/></td>
        </tr>
        <tr>
            <td>Country</td>
            <td><form:input path="country"/></td>
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