<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: szczepangizicki
  Date: 27/05/2021
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Admin</title>
</head>
<body background="color: cornsilk">
<h1>Admin</h1>
<a href="<c:url value="/home"/>">Strona Glowna</a>
<a href="<c:url value="/photos"/>">Zdjecia</a>
<a href="<c:url value="/description"/>">Opis</a>
<%--<a href="<c:url value="/listofclients"/>">Lista Klientow</a>--%>
</body>
</html>
