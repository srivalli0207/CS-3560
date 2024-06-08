package a1;

import java.util.*;

public class Student 
{
	private String id;
    private String answer;
    
    public Student(String id, String answer) 
    {
    	this.id = id;
        this.answer = answer;
    }
    
    public String getId() 
    {
    	return id;
    }

    public String getAnswer() 
    {
	   return answer;
    }
}
