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
<style>
    .error {
        color: #ff0000;
    }

    .errorblock {
        color: #000;
        background-color: #ffEEEE;
        border: 3px solid #ff0000;
        padding: 8px;
        margin: 16px;
    }
</style>
<body>
<table>
    <form:form action="add-student" method="post" commandName="student">
        <form:errors path="*" cssClass="errorblock" element="div"/>
        <tr>
            <td>Ssn</td>
            <td><form:input path="ssn"/></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><form:input path="name"/></td>
            <td><form:errors cssClass="error" path="name"/></td>
        </tr>
        <tr>
            <td>Surname</td>
            <td><form:input path="surname"></form:input></td>
            <td><form:errors cssClass="error" path="surname"/></td>
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
        <%--<tr>--%>
            <%--<td><form:label path="favoriteFrameworks">Favorite Frameworks</form:label></td>--%>
            <%--<td><form:checkboxes items="${webFrameworkList}" path="favoriteFrameworks"/></td>--%>
        <%--</tr>--%>
        <tr>
            <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
    </form:form>
</table>
<a href="${pageContext.request.contextPath}/" title="Back">Back</a>
<br/>
<a href="/students">Show students</a>
</body>
</html>