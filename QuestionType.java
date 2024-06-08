package a1;

import java.util.List;

public interface QuestionType 
{
	List<String> getCandidateAnswers();
	
    boolean isValidAnswer(String answer);
    
    boolean isSingleChoice();
}
