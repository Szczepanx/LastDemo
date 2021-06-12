<%--
  Created by IntelliJ IDEA.
  User: szczepangizicki
  Date: 11/06/2021
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background: azure">
<form:form modelAttribute="user" method="post" action="user">
    <div>
        <label for="firstName">Imie: </label>
        <form:input path="firstName" id="firstName"/>
    </div>
    <div>
        <label for="lastName">Nazwisko: </label>
        <form:input path="lastName" id="lastName"/>
    </div>
    <div>
        <label for="email">E-mail: </label>
        <form:input path="email" id="email"/>
    </div>
    <div>
        <label for="pesel">PESEL: </label>
        <form:input path="pesel" id="pesel" />
    </div>
    <div>
        <label for="nip">NIP: </label>
        <form:input path="nip" id="nip" />
    </div>
    <div>
        <label for="city">Miasto: </label>
        <form:input path="city" id="city"/>
    </div>
    <div>
        <label for="street">Ulica: </label>
        <form:input path="street" id="street"/>
    </div>
    <div>
        <label for="postCode">Kod Pocztowy: </label>
        <form:input path="postCode" id="postCode"/>
    </div>
    <div>
        <label for="adresNumber">Numer Domu: </label>
        <form:input path="adresNumber" id="adresNumber"/>
    </div>
    <div>
        <label for="numberOfPersons">Ilosc osob: </label>
        <form:input path="numberOfPersons" id="numberOfPersons"/>
    </div>
    <div>
        <label for="phoneNumber">Numer Telefonu: </label>
        <form:input path="phoneNumber" id="phoneNumber"/>
    </div>
    Mieskzanie:<form:select id="place" path="place" items="${place}" itemLabel="id" itemValue="id"/>
    Data:<form:select id="place" path="dates" items="${dates}" itemLabel="id" itemValue="id"/>
    <div>
        <input type="submit">
    </div>
</form:form>


</body>
</html>
