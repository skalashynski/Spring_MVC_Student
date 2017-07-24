<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Student Profile</title>
</head>
<body>
<table>
    <form:form method="delete" action="delete-student">
        <tr>
            <td>Name</td>
            <td>${student.name}</td>
        </tr>
        <tr>
            <td>Surname</td>
            <td>${student.surname}</td>
        </tr>
        <tr>
            <td>Birthday</td>
            <fmt:formatDate value="${student.birthday}" var="stringDate" pattern="yyyy-MM-dd"/>
            <td>${stringDate}</td>
        </tr>
        <tr>
            <td>Start study date</td>
            <td>${student.startStudyDate}</td>
        </tr>
        <tr>
            <td>End study date</td>
            <td>${student.endStudyDate}</td>
        </tr>
        <tr>
            <td>Username</td>
            <td>${student.username}</td>
        </tr>
        <tr>
            <td>Password</td>
            <td>${student.password}</td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>${student.gender}</td>
        </tr>
        <tr>
            <td>Country</td>
            <td>${student.country}</td>
        </tr>
        <%--<td>${student.address}</td>--%>
        <%--<td>${student.favouriteFrameworks}</td>--%>

        <%--<td>${student.skills}</td>--%>
        <%--<td>${student.photo}</td>--%>
        <tr>
            <td><a href="">Update</a></td>
            <td><input type="submit" value="Delete"/></td>
        </tr>
    </form:form>
</table>
</body>
</html>