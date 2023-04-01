package csd.solution;

public class FindPosNegSumCountsApp {
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Enter the numbers: ");
		
		int val, posSum, negSum, posCount, negCount;
		
		posSum = negSum = 0;
		negCount = posCount = 0;
		
		while((val = Integer.parseInt(kb.nextLine())) != 0) {
			if(val > 0) {
				posSum += val;
				posCount++;
			}
			else {
				negSum += val;
				negCount++;
			}
			
			System.out.print("Enter a number: ");
		}
		
		printResult(posSum, negSum, posCount, negCount);
	}
	
	public static void printResult(int posSum, int negSum, int posCount, int negCount)
	{
		printNegResult(negSum, negCount);
		printPosResult(posSum, posCount);
	}
	
	public static void printNegResult(int negSum, int negCount)
	{
		System.out.printf("sum of negative numbers : %d , count of negative numbers : %d%n",negSum, negCount);
	}
	
	public static void printPosResult(int posSum, int posCount)
	{
		System.out.printf("sum of positive numbers : %d , count of positive numbers : %d",posSum, posCount);
	}
}
