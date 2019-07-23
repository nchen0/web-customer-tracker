<%--
  Created by IntelliJ IDEA.
  User: pacom
  Date: 7/15/2019
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
${student.firstName} ${student.lastName} is confirmed.
<br><br>

Country: ${student.country}
<br><br>
Favorite Language: ${student.favoriteLanguage}

<br><br>
Operating Systems:
    <ul>
        <c:forEach var="s" items="${student.operatingSystems}">
            <li>${s}</li>
        </c:forEach>
    </ul>
</body>
</html>
