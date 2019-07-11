<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Онлайн-калькулятор квадратных уравнений</title>
</head>
<body>
<form name="calculate" action="${pageContext.request.contextPath}/calculate/quadratic-calculate" method="post"
      modelAttribute="calculate">

    <fieldset>
        <legend>Калькулятор квадратных уравнений</legend>
        Онлайн-калькулятор для решения квадратных уравнений позволяет найти корни квадратного уравнения.<br>
        Для того, чтобы решить квадратное уравнение задайте коэффициенты а, b, с и нажмите кнопку "Рассчитать"
        <br/>
        <tr>
            <span>a = </span><input
                type="text" name="a" size="5">
        </tr>
        <tr>
            <span>b = </span><input
                type="text" name="b" size="5">
        </tr>
        <tr>
            <span>c = </span><input
                type="text" name="c" size="5">
        </tr>
    </fieldset>


    <input type="submit" id="submit" name="submit" value="Рассчитать"/>
</form>
</body>
</html>