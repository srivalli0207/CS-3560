
import java.util.*;

public interface QuestionType 
{
    // Get the candidate answers for the question
    List<String> getCandidateAnswers();
 
    // Check if a given answer is valid
    boolean isValidAnswer(String answer);
 
    // Check if the question is single-choice
    boolean isSingleChoice();
}
