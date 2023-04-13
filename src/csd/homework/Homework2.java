package csd.homework;

public class Homework2 {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("enter a number : ");
		int val = kb.nextInt();
		
		GolbachPrint(val);
		
	}
	
	public static void GolbachPrint(int val)
	{
		for (int a = val - 1; a > 1; a--) {
			int b = val - a;
			
			if (isPrime(a) && isPrime(b) && a > b)
				System.out.printf("%d + %d = %d == %d%n", a, b, a + b, val);
		}
	}
	
	public static void figure(int val)
	{  
		int k = -1;
		for (int i = 0; i < val; i++) {
			space(val - i - 1);
			star(k = k + 2);
			System.out.println();
		}
		int j = 2;
		for (int i = 1; i < val; i++) {
			space(i);
			star(val* 2 - i - j);
			j++;
			System.out.println();
		}
			
	}
	public static void space(int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(" ");
	}
	
	public static void star(int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print("*");
	}
	
	public static void printPrimeFactors(int val)
	{
		if (val == 0)
			return;
		
		int a = 2;
		
		while (val != 1) {
			if (val % a == 0) {
				System.out.printf("%d ", a);
				val /= a;
			}
			else
				a++;
		}
	}
	
	public static void printDuration(long val)
	{
		long hours = val / 60 / 60;
		long minutes = val / 60 % 60;
		long second = val % 60;
		
		if (hours != 0)
			System.out.printf("%d hour ",hours);
		if (minutes != 0)
			System.out.printf("%d minutes ", minutes);
		if (second != 0)
			System.out.printf("%d second ", second);
	}
	
	public static boolean isPrime(long val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;
		
		if (val % 7 == 0)
			return val == 7;
		
		for (long i = 11; i * i < val; i += 2) {
			if (val % i == 0)
				return false;
		}
		return true;
		
	}
}


