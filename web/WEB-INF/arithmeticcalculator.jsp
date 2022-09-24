<%-- 
    Document   : arithmeticcalculator
    Created on : 24-Sep-2022, 11:10:29 AM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
<form action="arithmetic" method="POST">

    <h1>Arithmetic Calculator</h1> <br>

    <label for="first">First: </label>
    <input type="text" id="first" name="first" value="${firstNum}">
    <br>
    <label for="second">Second: </label>
    <input type="text" id="second" name="second" value="${secondNum}">
    <br>
    <button type="submit" name="cal" value="a">+</button>
    <button type="submit" name="cal" value="b">-</button>
    <button type="submit" name="cal" value="c">*</button>
    <button type="submit" name="cal" value="d">%</button>
    <br>

</form>
<p>Result: ${res}</p> <br>
<a href="/Calculators/age">Age Calculator</a>
    </body>
</html>
