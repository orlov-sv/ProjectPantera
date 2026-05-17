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
                "2"));

        questionMap.put("1", new Question(
                "А должно?",
                "Нет",
                "Да",
                "win1",
                "win2"));

        questionMap.put("2", new Question(
                "А должно?",
                "Нет",
                "Да",
                "win3",
                "win4"));

    }

    public Question getQuestion(String id){
        return questionMap.get(id);
    }
}
