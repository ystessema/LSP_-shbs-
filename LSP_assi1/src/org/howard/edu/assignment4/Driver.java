package org.howard.edu.lsp.assignment4;

public class Driver {
	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		try {
			set1.add(1);
			set1.add(2);
			set1.add(3);

			System.out.println("Value of Set1 is: " + set1.toString());
			System.out.println("Length of Set1 is: " + set1.length());
			System.out.println("Smallest value in Set1 is: " + set1.smallest());
			System.out.println("Largest value in Set1 is: " + set1.largest());

			IntegerSet set2 = new IntegerSet();
			set2.add(2);
			set2.add(4);
			set2.add(6);

			System.out.println("Value of Set2 is: " + set2.toString());
			System.out.println("Length of Set2 is: " + set2.length());
			System.out.println("Smallest value in Set2 is: " + set2.smallest());
			System.out.println("Largest value in Set2 is: " + set2.largest());

			System.out.println("Set1 equals Set2? " + set1.equals(set2));

			System.out.println("Set1 contains 2? " + set1.contains(2));
			System.out.println("Set1 contains 4? " + set1.contains(4));

			set1.remove(2);
			System.out.println("After removing 2 from Set1: " + set1.toString());

			System.out.println("Union of Set1 and Set2:");
			set1.union(set2);
			System.out.println("Result of union of Set1 and Set2: " + set1.toString());

			System.out.println("Intersection of Set1 and Set2:");
			set1.intersect(set2);
			System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());

			System.out.println("Difference of Set1 and Set2:");
			set1.diff(set2);
			System.out.println("Result of difference of Set1 and Set2: " + set1.toString());

			set1.clear();
			System.out.println("After clearing Set1: " + set1.toString());
			System.out.println("Is Set1 empty? " + set1.isEmpty());
		} catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
	}
}
