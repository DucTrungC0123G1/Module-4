<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 8/15/2023
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <fieldset style="display: inline">
        <legend><h3>CACULATOR</h3></legend>
        <div>
            <input type="number" name="num1" placeholder="input num1">
            <input type="number" name="num2" placeholder="input num2">
        </div>
        <div style="padding-top: 20px">
           <button type="submit" value="add" name="caculator">+</button>
            <button type="submit" value="sub" name="caculator">-</button>
            <button type="submit" value="multi" name="caculator">x</button>
            <button type="submit" value="div" name="caculator">/</button>
        </div>
        Results : <c:if test="${num2==0}">
        <p>${mess}</p>
    </c:if>
        <p>${results}</p>
    </fieldset>
</form>
</body>
</html>
