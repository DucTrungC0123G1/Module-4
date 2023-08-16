<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 8/15/2023
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MAIL LIST</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Language</th>
        <th>Page Size</th>
        <th>Spam filter</th>
        <th>Signature</th>
        <th>Edit</th>
    </tr>
    <c:forEach var="mail" items="${mailList}">
        <tr>
            <th>${mail.language}</th>
            <th>${mail.pageSize}</th>
            <th>${mail.spamFilter}</th>
            <th>${mail.signature}</th>
            <th><a href="/edit?id=${mail.id}">EDIT</a></th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
