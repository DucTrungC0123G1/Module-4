<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 8/15/2023
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="login" method="post" modelAttribute="login">
  <fieldset>
    <legend>Login</legend>
    <table>
      <tr>
        <td><form:label path="account">Account: </form:label></td>
        <td><form:input path="account"/></td>
      </tr>
      <tr>
        <td><form:label path="password">Password: </form:label></td>
        <td><form:input path="password"/></td>
      </tr>
      <tr>
        <td><form:button>Login</form:button></td>
      </tr>
    </table>
  </fieldset>
</form:form>
</body>
</html>
