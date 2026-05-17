package orlov.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter
public class Question {


   private String questionText;
   private String firstAnswerText;
   private String secondAnswerText;
   private String firstAnswerNextStep;
   private String secondAnswerNextStep;

}
