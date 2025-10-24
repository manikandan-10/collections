package treeset1;

import java.util.*;

//Store integers uniquely and print in ascending order: [50, 20, 30, 20]
public class TreeSetdemo {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<Integer>demo = new TreeSet<>();
		
		demo.add(50);
		demo.add(30);
		demo.add(20);
		demo.add(20);
		
		System.out.println(demo);

	}


}
