package testHomeWork;

import java.util.*;

public class AcceptAnotherList {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> l1=new ArrayList<>();
		
		ArrayList<Integer> l2=new ArrayList<>();
		l2.add(11);
		l2.add(22);
		l2.add(33);
		l1.add(l2);
				
		ArrayList<Integer> l3=new ArrayList<>();
		l3.add(9);
		l3.add(19);
		l3.add(29);
		l1.add(l3);
		
		ArrayList<Integer> l4=new ArrayList<>();
		l4.add(7);
		l4.add(17);
		l4.add(27);
		l1.add(l4);
		
		for (int i = 0; i < l1.size(); i++) {
         }
            System.out.println(l1);
	}

}
