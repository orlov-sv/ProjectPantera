<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Как всё починить?</title>
</head>

<body>

<h1>Как всё починить?</h1>
<style>

    body {
        text-align: center;
        font-family: Arial, sans-serif;
        margin-top: 40px;
    }

    h1 {
        margin-bottom: 30px;
    }

    img {
        margin-bottom: 30px;
        border-radius: 10px;
    }

    p {
        font-size: 20px;
        margin-bottom: 30px;
    }

    form {
        margin-top: 20px;
    }

    button {

        width: 250px;
        height: 60px;

        font-size: 20px;

        border-radius: 10px;

        cursor: pointer;

        margin: 10px;
    }

</style>
<img
        src="${pageContext.request.contextPath}/images/fix.png"
        width="500">

<p>
    Инструкция, которая спасёт тебя в случае любой поломки!
</p>

<form action="game" method="get">

    <button type="submit">
        Начать игру
    </button>

</form>

</body>
</html>