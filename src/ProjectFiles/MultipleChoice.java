package ProjectFiles;

import java.util.ArrayList;

public class MultipleChoice extends Question{

    public ArrayList<String> options;
    public String correctAnswer;

    public MultipleChoice(String question, ArrayList<String> options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean checkAnswer(String answer){
        return answer.equals(correctAnswer);
    }
}
