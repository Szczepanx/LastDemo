<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: szczepangizicki
  Date: 11/06/2021
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body style="background: darkgrey">
<%--<tags:localDate date="${yourDateToPrint}"/>--%>
<%--<tags:localDate date="${yourDateToPrint}" pattern="${yourPatternFormat}"/>--%>

<a href="<c:url value="/photos"/>">Zdjecia</a>
<a href="<c:url value="/description"/>">Opis</a>
<a href="<c:url value="/admin"/>">Admin</a>
<a href="<c:url value="/home"/>">Home</a>
<form:form  method="post" modelAttribute="dates">
    Data pocztakowa :  <form:input path="startDate" id="startDate" type="Date" />
    Data Koncowa :   <form:input path="endDate" id = "endDate" type="Date"/>
    <form action="user.jsp">
        <input type="submit">
    </form>
</form:form>

</body>
</html>
