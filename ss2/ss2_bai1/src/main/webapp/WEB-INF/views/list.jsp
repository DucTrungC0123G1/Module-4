<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 8/15/2023
  Time: 7:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post">
    <div>
        <fieldset style="display: inline">
            <legend><h4>Sandwich Condiment</h4></legend>
            <table>
                <c:forEach var="condiment" items="${condimentList}">
                    <tr>
                        <th>${condiment.name}</th>
                        <th><input type="checkbox" name="checkBoxName" value="${condiment.name}"></th>
                    </tr>
                </c:forEach>
            </table>
        </fieldset>
    </div>
    <div>
        <input type="submit" value="Save">
        <hr>
        <label><span>${condiment}</span></label>

    </div>
</form>
</body>
</html>
