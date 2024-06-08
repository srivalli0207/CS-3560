package a1;

import java.util.*;

public class VotingService 
{
	private Question question;
    private Map<String, Integer> answerCounts;
    private Map<String, String> studentAnswers;

    public VotingService(Question question) 
    {
        this.question = question;
        this.answerCounts = new HashMap<>();
        this.studentAnswers = new HashMap<>();
        
        for (String answer : question.getCandidateAnswers()) 
        {
            answerCounts.put(answer, 0);
        }
    }

    public void submitAnswer(Student student) 
    {
        // Check if the answer is valid for the question type
        if (question.getType().isValidAnswer(student.getAnswer())) 
        {
            // Store the student's answer (replace if student has submitted before)
            studentAnswers.put(student.getId(), student.getAnswer());

            // Increment the count for the submitted answer
            answerCounts.put(student.getAnswer(), answerCounts.get(student.getAnswer()) + 1);
        }
        else 
        {
            System.out.println("Invalid answer from student: " + student.getId());
        }
    }

    public void displayResults() 
    {
        // Display the results
        System.out.println("Voting results:");
        for (Map.Entry<String, Integer> entry : answerCounts.entrySet()) 
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
