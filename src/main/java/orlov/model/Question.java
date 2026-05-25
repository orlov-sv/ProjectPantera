package orlov.model;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor @Getter
public class Question {


   private String questionText;
   private String firstAnswerText;
   private String secondAnswerText;
   private String firstAnswerNextStep;
   private String secondAnswerNextStep;
   private String image;

}
