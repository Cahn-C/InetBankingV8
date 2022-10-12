package JavaBasics;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");

		
		// Prints results from method sec()
		sec();
		
		System.out.println("\n");
		
		// Prints results from method third()
		third();
		
		// Prints results from method four()
		four();
		
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
	
	public static void four() {
		
		Set<Integer> sets = new HashSet<Integer>();
		Set<Integer> removeSets = new HashSet<Integer>();
		
		
		// Remove all odd numbers from the set
		for(int i = 1; i <= 25; i++) {
			sets.add(i);
		}
		
		for(int i : sets) {
			if(i % 2 != 0) {
				removeSets.add(i);
			}
		}
		
		sets.removeAll(removeSets);
		
		System.out.println(sets);
		
	}

}
