<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 8/16/2023
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MAIL SETTING</title>
</head>
<body>
<form:form method="post" modelAttribute="mail" action="mail/edit">
    <fieldset>
        <legend>Mail-Setting</legend>
        <form:input path="id" cssStyle="display: none"/><br>
        <b>Languages:</b>
        <form:select path="language" items="${language}"/> <br>
        <b>Page Size:</b>
        <form:select path="pageSize" items="${pageSize}"/> <br>
        <b>Spam filter:</b>
        <form:checkbox path="spamFilter"/>
        Enable spams filter
        <br>
        <b>Signature</b>
        <form:textarea path="signature"/> <br>
        <form:button>Update</form:button>
    </fieldset>
</form:form>
</body>
</html>
