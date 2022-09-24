<%-- 
    Document   : agecalculator
    Created on : 24-Sep-2022, 10:23:14 AM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AGE CALCULATOR</title>
    </head>
    <body>
        <form action="age" method="POST">
            <h1>Age Calculator</h1>
            <br>
            <label for="age">Enter Your age:</label>
            <input type="text" id="age" name="age" value="">
            <br>
            <input type="submit" value="Age next birthday">
        </form>
        ${Message}
        
        <br>
        <a href="/Calculators/arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>
