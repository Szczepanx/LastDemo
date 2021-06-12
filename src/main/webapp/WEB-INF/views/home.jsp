
<%--
  Created by IntelliJ IDEA.
  User: szczepangizicki
  Date: 27/05/2021
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background: silver">
<h1>Strona Główna</h1>
<a href="<c:url value="/photos"/>">Zdjecia</a>
<a href="<c:url value="/description"/>">Opis</a>
<a href="<c:url value="/admin"/>">Admin</a>
<a href="<c:url value="/dates"/>">Zarezerwuj</a>


</body>
</html>
