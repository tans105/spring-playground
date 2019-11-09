<%--
  Created by IntelliJ IDEA.
  User: awata02
  Date: 09/11/19
  Time: 5:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Object msg = (String) request.getAttribute("msg");
    out.println(msg);
%>
</body>
</html>
