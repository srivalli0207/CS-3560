package a1;

import java.util.*;

public class SingleChoiceQuestion implements QuestionType 
{
	private List<String> candidateAnswers;

    // Constructor to initialize a single-choice question with candidate answers
    public SingleChoiceQuestion(List<String> candidateAnswers) 
    {
        this.candidateAnswers = candidateAnswers;
    }

    // Implementation of interface method to get candidate answers
    @Override
    public List<String> getCandidateAnswers() 
    {
        return candidateAnswers;
    }

    // Implementation of interface method to check if answer is valid
    @Override
    public boolean isValidAnswer(String answer) 
    {
        return candidateAnswers.contains(answer);
    }
    
    // Implementation of interface method to check if question is single-choice
    @Override
    public boolean isSingleChoice() 
    {
        return true; // Single-choice question allows selecting only one answer
    }
}
