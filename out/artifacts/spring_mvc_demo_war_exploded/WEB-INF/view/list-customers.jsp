<%--
  Created by IntelliJ IDEA.
  User: pacom
  Date: 7/23/2019
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Customers</title>
</head>
<body>

    <div id="wrapper">
        <div id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </div>
    </div>
    <div id="container">
        <div id="content">
            <table>
                <tr>
                    <th>First name</th>
                    <th>Last name</th>
                    <th>Email</th>
                </tr>

                <%--Loop over & print out customers--%>
                <c:forEach var="tempCustomer" items="${customers}">
                    <tr>
                        <td> ${tempCustomer.firstName}</td>
                        <td> ${tempCustomer.lastName} </td>
                        <td> ${tempCustomer.email}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

</body>
</html>
