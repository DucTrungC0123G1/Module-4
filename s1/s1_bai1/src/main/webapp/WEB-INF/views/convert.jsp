<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 8/14/2023
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Convert USD</h2>
<form action="/result" method="post">
    <fieldset style="display: inline">
        <label for="usd">USD</label>
        <input type="number" id="usd" name="usd" placeholder="Nhập USD Muốn Chuyển">
        <label for="tyGia">Tỷ Giá</label>
        <input type="number" id="tyGia" name="rate" placeholder="Nhập Tỷ Giá">
        <input type="submit" value="Chuyển">
    </fieldset>
</form>
</body>
</html>
