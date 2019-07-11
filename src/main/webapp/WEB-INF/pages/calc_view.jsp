<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Калькулятор квадратных уравнений</title>
</head>
<body>
<fieldset>
    <legend>Решение квадратных уравнений</legend>
    <table>
        <tr>
            <td>A : ${a}</td>
        </tr>
        <tr>
            <td>B : ${b}</td>
        </tr>
        <tr>
            <td>C : ${c}</td>
        </tr>
        <tr>
            <td>${discriminant}</td>
        </tr>
        <tr>
            <td>${D}</td>
        </tr>
        <tr>
            <td>${equals}</td>
        </tr>
        <tr>
            <td>${X1}</td>
        </tr>
        <tr>
            <td>${X2}</td>
        </tr>

    </table>
</fieldset>
<input type="button" onclick="history.back();" value="Назад"/>
</body>
</html>
