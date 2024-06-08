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

        // Simulate students and their answers for multiple-choice question
        Random random = new Random();
        for (int i = 1; i <= 50; i++) 
        {
            String studentId = "Student" + i;
            
            // Randomly select 1 to 4 answers for the multiple-choice question
            int numSelected = random.nextInt(4) + 1;
            StringBuilder multipleChoiceAnswer = new StringBuilder();
            for (int j = 0; j < numSelected; j++) 
            {
                multipleChoiceAnswer.append(multipleChoiceAnswers.get(random.nextInt(multipleChoiceAnswers.size())));
                
                if (j < numSelected - 1) 
                {
                    multipleChoiceAnswer.append(",");
                }
            }
            
            // Create a student with the selected answers
            Student student1 = new Student(studentId, multipleChoiceAnswer.toString());
            multipleChoiceVotingService.submitAnswer(student1);
        }

        // Simulate students and their answers for single-choice question
        for (int i = 1; i <= 50; i++) 
        {
            String studentId = "Student" + i;
            String singleChoiceAnswer = singleChoiceAnswers.get(random.nextInt(singleChoiceAnswers.size()));
            Student student2 = new Student(studentId, singleChoiceAnswer);
            singleChoiceVotingService.submitAnswer(student2);
        }

        // Display the results
        System.out.println("Multiple Choice Question (50 Students):");
        multipleChoiceVotingService.displayResults();

        System.out.println("\nSingle Choice Question (50 Students):");
        singleChoiceVotingService.displayResults();
    }
}
