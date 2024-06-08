package a1;

import java.util.*;

public class Student 
{
	private String id;
    private String answer;

    // Constructor to initialize a student with ID and answer
    public Student(String id, String answer) 
    {
    	this.id = id;
        this.answer = answer;
    }
 
    // Getter method for ID
    public String getId() 
    {
    	return id;
    }

    // Getter method for answer
    public String getAnswer()
    {
    	return answer;
    }
}