package testHomeWork;

import java.util.*;

public class ReverseOrder {

	public static void main(String[] args) {

		List<String> course= new ArrayList<>();
		course.add("Java");
		course.add("Selenium");
		course.add("TestNG");
		course.add("Git");
		course.add("Github");
		
        Collections.reverse(course);

	     System.out.print(course);
		
	
	}
    
}
