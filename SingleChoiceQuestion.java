package a1;

import java.util.*;

public class SingleChoiceQuestion implements QuestionType 
{
	private List<String> candidateAnswers;

    public SingleChoiceQuestion(List<String> candidateAnswers) 
    {
    	this.candidateAnswers = candidateAnswers;
    }

    @Override
    public List<String> getCandidateAnswers() 
    {
    	return candidateAnswers;
    }

    @Override
    public boolean isValidAnswer(String answer) 
    {
    	return candidateAnswers.contains(answer);
    }
    
    @Override
    public boolean isSingleChoice() 
    {
        return true; // Single-choice question allows selecting only one answer
    }
}
