package a1;

import java.util.*;

public class MultipleChoiceQuestion implements QuestionType 
{
	private List<String> candidateAnswers;

    public MultipleChoiceQuestion(List<String> candidateAnswers) 
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
        // For multiple choice, any answer is considered valid if it exists in the candidate answers
        return candidateAnswers.contains(answer);
    }
    
    @Override
    public boolean isSingleChoice()
    {
        return false; // Multiple-choice question allows selecting more than one answer
    }
}
