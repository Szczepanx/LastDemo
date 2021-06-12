<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: szczepangizicki
  Date: 27/05/2021
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Zdjecia</title>
</head>
<body style="background: aliceblue">
<h1>Zdjecia</h1>
<a href="<c:url value="/home"/>">Strona Glowna</a>
<a href="<c:url value="/description"/>">Opis</a>
<a href="<c:url value="/admin"/>">Admin</a>
<a href="<c:url value="/dates"/>">Zarezerwuj</a><br>
<img src="YGA_8911.JPG" WIDTH="800" HEIGHT="600"><br>

<img src="YGA_9076.jpg" WIDTH="800" HEIGHT="600"><br>
<img src="YGA_9166.JPG" WIDTH="800" HEIGHT="600"><br>
</body>
</html>
