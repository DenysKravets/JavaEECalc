
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
