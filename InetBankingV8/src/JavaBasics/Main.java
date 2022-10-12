package JavaBasics;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");

		
		// Prints results from method sec()
		sec();
		
		System.out.println("\n");
		
		// Prints results from method three()
		third();
		
	}
	
	public static void sec() {
		
		int[] numbers = new int[1000];
		
		for(int i = 1; i < numbers.length; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void third() {
		
		List<Integer> lists = new ArrayList<Integer>();
		
		for(int i = 1; i <= 50; i++) {
			lists.add(i);
		}
		
		System.out.println(lists);
		
	}

}
