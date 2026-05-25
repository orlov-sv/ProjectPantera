package orlov.service;

import orlov.model.Question;
import java.util.HashMap;
import java.util.Map;

public class GameLogic {


    private Map<String, Question> questionMap;

    public GameLogic(){
        questionMap = new HashMap<>();
        questionMap.put("0", new Question(
                "Это двигается?",
                "Нет",
                "Да",
                "1",
                "2",
                "images/fix.png"));

        questionMap.put("1", new Question(
                "А должно?",
                "Нет",
                "Да",
                "win1",
                "win2",
                "images/vopros.jpg"));

        questionMap.put("2", new Question(
                "А должно?",
                "Нет",
                "Да",
                "win3",
                "win4",
                "images/vopros.jpg"));

        questionMap.put("win1", new Question(
                "Не трогай!",
                null,
                null,
                null,
                null,
                "images/dont_touch.png"));
        questionMap.put("win2", new Question(
                "Используй WD-40",
                null,
                null,
                null,
                null,
                "images/wd40.png"));
        questionMap.put("win3", new Question(
                "Используй изолент",
                null,
                null,
                null,
                null,
                "images/izolenta.png"));
        questionMap.put("win4", new Question(
                "Не трогай!",
                null,
                null,
                null,
                null,
                "images/dont_touch.png"));

    }

    public Question getQuestion(String id){
        return questionMap.get(id);
    }
}
