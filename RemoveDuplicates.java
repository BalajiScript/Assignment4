package testHomeWork;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {

   List<String> list = Arrays.asList("Java", "TestNG", "Maven", "Java");
   
   Set<String> s = new LinkedHashSet<String>(list);  
   
   System.out.println(s);  
	}

}
