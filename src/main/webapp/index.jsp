
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
        <h1><%= "Calculator" %></h1>
        <br/>
        <form method="get" action="process_calculation">
            Find max value index
            <br/>
            <label>
                Enter start:
                <input type="number" step="0.000001" name="start" id="start">
            </label>
            <br/>
            <label>
                Enter end:
                <input type="number" step="0.000001" name="end" id="end">
            </label>
            <br/>
            <label>
                Enter step:
                <input type="number" step="0.000001" name="step" id="step">
            </label>
            <br/>
            <label>
                Enter a:
                <input type="number" step="0.000001" name="a" id="a">
            </label>
            <br/>
            <label for="calculate">Choose calculation:</label>
            <select id="calculate" name="calculate">
                <option value="calculate_max">Calculate max index</option>
                <option value="calculate_min">Calculate min index</option>
                <option value="calculate_sum">Calculate sum value</option>
                <option value="calculate_average">Calculate average value</option>
            </select>
            <br/>
            <input type="submit" value="Calculate">
        </form>
    </body>
</html>