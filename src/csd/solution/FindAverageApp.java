package csd.solution;

public class FindAverageApp {
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Enter a number:");
		
		int number;
		int sum = 0;
		int count = 0;
		
		while ((number = kb.nextInt()) != 0) {
			sum += number; 
			count++;
		}
		double average = (double)sum / count;
		
		System.out.printf("Average: %.3f", average);
		
	}


}