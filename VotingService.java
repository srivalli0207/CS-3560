package a1;

import java.util.*;

public class VotingService 
{
	private Question question;
    private Map<String, Integer> answerCounts;
    private Map<String, List<String>> studentAnswers;

    // Constructor to initialize a voting service with a question
    public VotingService(Question question) 
    {
        this.question = question;
        this.answerCounts = new HashMap<>();
        this.studentAnswers = new HashMap<>();

        // Initialize answer counts map with candidate answers
        for (String answer : question.getCandidateAnswers()) 
        {
            answerCounts.put(answer, 0);
        }
    }

    // Method to submit an answer from a student
    public void submitAnswer(Student student) 
    {
        if (question.getType().isValidAnswer(student.getAnswer())) 
        {
            List<String> previousAnswers = studentAnswers.get(student.getId());
            
            if (previousAnswers != null) 
            {
                // Decrement counts for previous answers
                for (String prevAnswer : previousAnswers) 
                {
                    answerCounts.put(prevAnswer, answerCounts.get(prevAnswer) - 1);
                }
            }
            
            List<String> newAnswers = Arrays.asList(student.getAnswer().split(","));
            studentAnswers.put(student.getId(), newAnswers);
            
            // Increment counts for new answers
            for (String ans : newAnswers) 
            {
                answerCounts.put(ans, answerCounts.get(ans) + 1);
            }
        } 
        
        else 
        {
            System.out.println("Invalid answer from student: " + student.getId());
        }
    }

    // Method to display results of answers count
    public void displayResults() 
    {
        System.out.println("Answers count results:");
        for (Map.Entry<String, Integer> entry : answerCounts.entrySet()) 
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
