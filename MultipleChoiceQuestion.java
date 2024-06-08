package a1;

import java.util.*;

public class MultipleChoiceQuestion implements QuestionType 
{
	private List<String> candidateAnswers;

    // Constructor to initialize a multiple-choice question with candidate answers
    public MultipleChoiceQuestion(List<String> candidateAnswers) 
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
        // For multiple choice, an answer is considered valid if all selected answers exist in the candidate answers
        String[] selectedAnswers = answer.split(",");
        for (String selectedAnswer : selectedAnswers) 
        {
            if (!candidateAnswers.contains(selectedAnswer)) 
            {
                return false;
            }
        }
        return true;
    }

    // Implementation of interface method to check if question is single-choice
    @Override
    public boolean isSingleChoice() 
    {
        return false; // Multiple-choice question allows selecting more than one answer
    }
}
