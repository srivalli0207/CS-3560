package a1;

import java.util.*;

public class Question 
{
	private QuestionType type;
    private List<String> candidateAnswers;

    // Constructor to initialize a question with type and candidate answers
    public Question(QuestionType type, List<String> candidateAnswers) 
    {
    	this.type = type;
        this.candidateAnswers = candidateAnswers;
    }

    public QuestionType getType() 
    {
    	return type;
    }

    public List<String> getCandidateAnswers() 
    {
    	return candidateAnswers;
    }
}