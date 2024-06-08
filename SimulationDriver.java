package a1;

import java.util.*;

public class SimulationDriver 
{
	public static void main(String[] args) 
	{
		// Configure question type and candidate answers
		List<String> multipleChoiceAnswers = Arrays.asList("A", "B", "C", "D");
        List<String> singleChoiceAnswers = Arrays.asList("True", "False");

        // Configure question for VotingService
        QuestionType multipleChoiceType = new MultipleChoiceQuestion(multipleChoiceAnswers);
        QuestionType singleChoiceType = new SingleChoiceQuestion(singleChoiceAnswers);

        Question multipleChoiceQuestion = new Question(multipleChoiceType, multipleChoiceAnswers);
        Question singleChoiceQuestion = new Question(singleChoiceType, singleChoiceAnswers);

        VotingService multipleChoiceVotingService = new VotingService(multipleChoiceQuestion);
        VotingService singleChoiceVotingService = new VotingService(singleChoiceQuestion);

        // Simulate students and their answers
        Random random = new Random();
        for (int i = 1; i <= 50; i++) 
        {
        	String studentId = "Student" + i;
            String multipleChoiceAnswer = multipleChoiceAnswers.get(random.nextInt(multipleChoiceAnswers.size()));
            String singleChoiceAnswer = singleChoiceAnswers.get(random.nextInt(singleChoiceAnswers.size()));

            Student student1 = new Student(studentId, multipleChoiceAnswer);
            Student student2 = new Student(studentId, singleChoiceAnswer);

            multipleChoiceVotingService.submitAnswer(student1);
            singleChoiceVotingService.submitAnswer(student2);
        }
        
        // Display the results
        System.out.println("Multiple Choice Question:");
        multipleChoiceVotingService.displayResults();

        System.out.println("\nSingle Choice Question:");
        singleChoiceVotingService.displayResults();
    }
}