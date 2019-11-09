<html>
<body>
Woohoooo!!!

<%
    Object id = (Integer) request.getAttribute("id");
    Object name = (String) request.getAttribute("name");
    Object salary = (Integer) request.getAttribute("salary");
%>

Id: <b> ${id} </b>
</body>
</html>
