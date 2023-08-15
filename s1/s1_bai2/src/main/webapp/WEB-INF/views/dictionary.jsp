<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 8/14/2023
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>

</head>
<body>
<h2>Dictionary</h2>
<form action="/vietnamese" method="post" class="form-control">
    <fieldset  class="form-control" style="display: inline">
        <legend>Dictionary</legend>
        <input type="text" placeholder="Nhập vào từ cần dịch" name="english">
        <input type="submit" value="Dịch">
        <p>Result: ${vietnamese}</p>
    </fieldset>
</form>
</body>
</html>
