<%--
  Created by IntelliJ IDEA.
  User: Tanmay
  Date: 09/11/19
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="registerUser" method="post">
    <pre>
    Id: <input type="text" name="id"> <!--The name should match the field created in the model (User.java) class-->
    Name: <input type="text" name="name">
    Email: <input type="text" name="email">
    <input type="submit" name="register">
        </pre>
</form>

</body>
</html>
