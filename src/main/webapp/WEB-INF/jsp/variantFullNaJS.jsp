<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Как всё починить</title>
</head>

<body>

<!-- Блок приветствия -->
<div id="welcome">
    <h1>Как всё починить?</h1>
    <button onclick="startGame()">Старт</button>
</div>

<!-- Блок с вопросом (пока скрыт) -->
<div id="game" style="display:none">
    <h2 id="answer"></h2>
    <button id="Option1"></button>
    <button id="Option2"></button>
</div>

<div id="result" style="display:none">
    <h2 id="result-text"></h2>
    <button onclick="startGame()">Играть заново</button>
</div>

<script>
    const questions = {
        0: {
            text: "Это двигается?",
            option: [
                {text: "Нет", next: 1},
                {text: "Да", next: 2}
            ]
        },
        1: {
            text: "А должно?",
            option: [
                {text: "Нет", next: "win1"},
                {text: "Да", next: "win2"}
            ]
        },
        2: {
            text: "А должно?",
            option: [
                {text: "Нет", next: "win3"},
                {text: "Да", next: "win4"}
            ]
        }

    }
    function startGame(){
        document.getElementById("welcome").style.display = "none";
        document.getElementById("game").style.display = "block";
        document.getElementById("result").style.display = "none";
        showQuestion(0);

    }

    function showQuestion(id){

        if(id === "win1"){
            document.getElementById("game").style.display = "none";
            document.getElementById("result").style.display = "block";
            document.getElementById("result-text").textContent = "Не трогай!";
            return;
        }
        if(id === "win2"){
            document.getElementById("game").style.display = "none";
            document.getElementById("result").style.display = "block";
            document.getElementById("result-text").textContent = "Используй WD-40";
            return;
        }
        if(id === "win3"){
            document.getElementById("game").style.display = "none";
            document.getElementById("result").style.display = "block";
            document.getElementById("result-text").textContent = "Используй изоленту";
            return;
        }
        if(id === "win4"){
            document.getElementById("game").style.display = "none";
            document.getElementById("result").style.display = "block";
            document.getElementById("result-text").textContent = "Не трогай!";
            return;
        }


        const question = questions[id];
        document.getElementById("answer").textContent = question.text;
        document.getElementById("Option1").textContent = question.option[0].text;
        document.getElementById("Option2").textContent = question.option[1].text;

        document.getElementById("Option1").onclick = function () {
            showQuestion(question.option[0].next);
        }
        document.getElementById("Option2").onclick = function () {
            showQuestion(question.option[1].next);
        }



    }

</script>

</body>
</html>