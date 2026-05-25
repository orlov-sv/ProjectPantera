package orlov.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import orlov.model.Question;

import static org.junit.jupiter.api.Assertions.*;
class GameLogicTest {
    private final GameLogic gameLogic = new GameLogic();


    @Test
    @DisplayName("shouldReturnStartQuestion")

    void shouldReturnStartQuestion() {
        Question question = gameLogic.getQuestion("0");
        assertNotNull(question);
        assertEquals("Это двигается?", question.getQuestionText());
    }


    @Test
    @DisplayName("shouldReturnFirstQuestion")

    void shouldReturnFirstQuestion() {
        Question question = gameLogic.getQuestion("1");
        assertNotNull(question);
        assertEquals("А должно?", question.getQuestionText());
    }


        @Test
        @DisplayName("shouldReturnSecondQuestion")

        void shouldReturnSecondQuestion() {
           Question question = gameLogic.getQuestion("2");
           assertNotNull(question);
           assertEquals("А должно?", question.getQuestionText());
        }

    @Test
    @DisplayName("shouldReturnThirdQuestion")

    void shouldReturnThirdQuestion() {
        Question question = gameLogic.getQuestion("win1");
        assertNotNull(question);
        assertEquals("Не трогай!", question.getQuestionText());
    }

    @Test
    @DisplayName("shouldReturnFourthQuestion")

    void shouldReturnFourthQuestion() {
        Question question = gameLogic.getQuestion("win2");
        assertNotNull(question);
        assertEquals("Используй WD-40", question.getQuestionText());
    }

    @Test
    @DisplayName("shouldReturnFifthQuestion")

    void shouldReturnFifthQuestion() {
        Question question = gameLogic.getQuestion("win3");
        assertNotNull(question);
        assertEquals("Используй изоленту", question.getQuestionText());
    }

    @Test
    @DisplayName("shouldReturnSixthQuestion")

    void shouldReturnSixthQuestion() {
        Question question = gameLogic.getQuestion("win4");
        assertNotNull(question);
        assertEquals("Не трогай!", question.getQuestionText());
    }

}