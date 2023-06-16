package csd.homework;

public class Homework3 {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (int i = 1; i <= 17; i++) {
			if (NumberUtil.isSuperPrime(i))
				System.out.println(i);
		
		}
	}
}	

class SatisfyConditionApp {
	public static boolean isCondition1Satisfied(int a , int b , int c)
	{
		return (c * 100 + b * 10 + a) > (a * 100 + b * 10 + c);
	}
	public static boolean isCondition2Satisfied(int abc)
	{
		return NumberUtil.isPrime(abc);
	}
	public static boolean isCondition3Satisfied(int a, int b, int c)
	{
		return NumberUtil.isPrime(c * 100 + b * 10 + a);
	}
	public static boolean isCondition4Satisfied(int a, int b)
	{
		return NumberUtil.isPrime(a * 10 + b);
	}
	public static boolean isCondition5Satisfied(int b, int c)
	{
		return NumberUtil.isPrime(b * 10 + c);
	}
	public static boolean isCondition6Satisfied(int c, int b)
	{
		return NumberUtil.isPrime(c * 10 + b);
	}
	public static boolean isCondition7Satisfied(int b, int a)
	{
		return NumberUtil.isPrime(b * 10 + a);
	}
	public static boolean isAllSatisfied(int abc)
	{
		int a = abc / 100;
		int b = abc / 10 % 10;
		int c = abc % 10;
		
		return isCondition1Satisfied(a, b, c) && isCondition2Satisfied(abc) && isCondition3Satisfied(a, b, c) && isCondition4Satisfied(a, b) && 
				isCondition5Satisfied(b, c) && isCondition6Satisfied(c, b) && isCondition7Satisfied(b, a);
	}
	public static void print(int abc)
	{
		if (isAllSatisfied(abc))
			System.out.printf("%d sayısı koşulları sağlıyor.%n", abc);
	}	
}
class NumberUtil {
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
	public static boolean isPrimeX(long val)
	{
		boolean result;
		
		for (long sum = val; (result = isPrime(sum)) && sum > 9 ; sum = sumDigits(sum))
				;
		
		return result;
		
	}
	public static boolean isDecimalHarshad(int val)
	{
		return val > 0 && val % NumberUtil.sumDigits(val)  == 0 ? true : false;
		
	}
	public static boolean isSuperPrime(long val)
	{
		return isPrime(val) && isPrime(indexOfPrime(val));	
	}
	
	public static int indexOfPrime(long val)
	{		
		int count = 0;
		
		for (int i = 2; i <= val; i++) 
			if (isPrime(i)) 
				count++;
		
		return count;
				
	}
	public static int sumDigits(long val)
	{
		int sum = 0;
		val = Math.abs(val);
		
		while(val != 0) {
			sum += (val % 10);
			val /= 10;	
		}
		return sum;
	}
	public static boolean isFactorian(int val)
	{
		int number = val;
		int sum = 0;
		
		while(number != 0) {
			sum += factorial(number % 10);
			number /= 10;	
		}
		if (sum == val)
			return true;
		
		return false;
		
	}
	public static void PrintCollatz(int n)
	{
		while (n != 1) {
			if (n % 2 == 0)
				n /= 2;
			else
				n = 3 * n + 1;
			System.out.println(n);
		}
	}
	
	public static long factorial(int val)
	{
		long result = 1;
		
		if (val > 0)
			for (int i = 1; i <= val; i++)
				result *= i;
		
		return result;
	}
	public static int getHardyRemanujanPairCount(int n)
	{
			int count =0;
			
			EXIT_LOOP:
			
			for (int a = 1; a * a * a < n; ++a)
				for (int b = a + 1; a * a * a + b * b * b <= n; ++b)
					if (a * a * a + b * b * b == n) {
						if (++count == 2)
							break EXIT_LOOP;
						
						++a;
					}
			return count;
	}
	
	public static boolean isHardyRemanujan(int n)
	{
		return n > 0 && getHardyRemanujanPairCount(n) == 2;
	}
	public static int CalculateDigitalRoot(int val)
	{
		int sum;
		
		for (sum = val; sum > 9; sum = sumDigits(sum))
			;
		
		return sum;
		
	}
}

