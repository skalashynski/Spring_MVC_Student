<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Students</title>
</head>
<body>
<table>
    <tr>
        <th>ssn</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Birthday</th>
        <th>Start study date</th>
        <th>End study date</th>
        <th>username</th>
        <th>password</th>
        <th>Address</th>
        <th>Receive Paper</th>
        <th>favourite frameworks</th>
        <th>gender</th>
        <th>country</th>
        <th>skills</th>
        <th>photo</th>
    </tr>
    <c:forEach var="student" items="${studentList}">
        <tr>
            <td>${student.ssn}</td>
            <td><a href="/get-student-${student.id}">${student.name}</a></td>
            <td>${student.surname}</td>
            <td>${student.birthday}</td>
            <td>${student.startStudyDate}</td>
            <td>${student.endStudyDate}</td>
            <td>${student.username}</td>
            <td>${student.password}</td>
            <%--<td>${student.address}</td>--%>
            <%--<td>${student.favouriteFrameworks}</td>--%>
            <td>${student.gender}</td>
            <td>${student.country}</td>
            <%--<td>${student.skills}</td>--%>
            <%--<td>${student.photo}</td>--%>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="/add-student">Add student</a>
</body>
</html>
