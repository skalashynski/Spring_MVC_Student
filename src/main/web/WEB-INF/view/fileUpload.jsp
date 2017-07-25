<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Сергей
  Date: 25.07.2017
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File upload</title>
</head>
<body>
<form:form method="post" modelAttribute="fileUpload" enctype="multipart/form-data">
Please select a file upload:
    <input type="file" name="file"/>
    <input type="submit" value="upload"/>
</form:form>
</body>
</html>
