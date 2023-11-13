<%--
  Created by IntelliJ IDEA.
  User: Den
  Date: 13.11.2023
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <jsp:useBean id="calculationResult" class="com.example.PayaraHelloWorld.beans.CalculationResult" scope="request"/>
    <h1>${calculationResult.calculationName}</h1>
    <label>${calculationResult.value}</label>
    <br/>
    <br/>
    <a href="index.jsp">Back to calculator</a>
</body>
</html>
