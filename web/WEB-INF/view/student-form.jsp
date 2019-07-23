<%--
  Created by IntelliJ IDEA.
  User: pacom
  Date: 7/15/2019
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName" />
        <br><br>
        Last name: <form:input path="lastName" />
        <br><br>
        <form:select path="country">
            <form:options items="${student.countryOptions}" />
        </form:select>
        <br><br>
        Favorite Language:
        <form:radiobuttons path="favoriteLanguage" items="${student.languages}" />y <form:radiobutton path="favoriteLanguage" value="Ruby"/>--%>

        <br><br>
        Operating Systems:
        <form:checkboxes path="operatingSystems" items="${student.osSystems}" />
        <br><br>
        <input type="submit" value="Submit" />
    </form:form>

</body>
</html>
