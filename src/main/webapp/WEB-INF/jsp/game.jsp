<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Как всё починить?</title>

</head>
<body>
    <h1>${question.questionText}</h1>
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
            src="${pageContext.request.contextPath}/${question.image}"
            width="400">

    <c:choose>

        <c:when test="${question.firstAnswerText != null}">

            <form action="game" method="post">

                <button
                        type="submit"
                        name="nextStep"
                        value="${question.firstAnswerNextStep}">

                        ${question.firstAnswerText}

                </button>

                <button
                        type="submit"
                        name="nextStep"
                        value="${question.secondAnswerNextStep}">

                        ${question.secondAnswerText}

                </button>

            </form>

        </c:when>

        <c:otherwise>

            <form action="game" method="get">
                <input type="hidden" name="restart" value="true">
                <button type="submit">
                    Начать заново
                </button>

            </form>

        </c:otherwise>

    </c:choose>

    <p>Количество игр: ${sessionScope.gameCount}</p>
</body>
</html>
