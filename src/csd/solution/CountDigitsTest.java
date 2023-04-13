package csd.solution;

class CountDigitsTest {
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int val = kb.nextInt();
		
		System.out.print(NumberUtil.getNextFibonacciNumber(val));
		
		System.out.println();
		System.out.print("of course i do it again :)");
	}
}
class NumberUtil {
	
	public static int countDigits(int val)
	{
		int count = 0;
		val = Math.abs(val);
		
		while (val != 0) {
			val /= 10;
			count++;
				
		}
		return count;	
	}
	
	public static int getFibonacciNumber(int n)
	{
		
		int prev1 = 0;
		int prev2 = 1;
		int sum = 0;
		
		if (n == 1)
			return prev1;
		if (n == 2)
			return prev2;
		
		for (int i = 2; i < n; i++) {
			sum = prev1 + prev2;
			prev1 = prev2;
			prev2 = sum;
		}
		return sum;
	}
	public static int getNextFibonacciNumber(int n)
	{
		int result = 0;
		
		int i = 0;
		for (;;) {
			i++;
			if ((result = getFibonacciNumber(i)) > n)
				return result;
		}
	}
	
	public static boolean isArmstrong(int val)
	{
		return val >= 0 && getDigitsPowSum(val) == val;
	}
	
	public static int getDigitsPowSum(int val)
	{
		int total = 0;
		int count = countDigits(val);
	
		for (int i = 1; i <= count; i++) {
			total += pow((val % 10), count);
			val /= 10;
		}
		return total;
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
	
	public static long factorial(int val)
	{
		long result = 1;
		
		if (val > 0)
			for (int i = 1; i <= val; i++)
				result *= i;
		
		return result;
	}
	
	public static long getPrime(int n)
	{
		long val = 2;
		int count = 0;
		
		do {
			if (isPrime(val))
				count++;
			val++;
		}while(count != n);
		
		return val-1;
	}
	
	public static boolean isPrimeSlow(long val)
	{
		if(val > 1) {
			for (long i = 2; i <= val / 2; i++) 
				if(val % i == 0)
					return false;
			return true;
		}
		return false;
	}
	
	public static int pow(int a, int b)
	{
		if(b < 0)
			return 1;
		
		int result = 1;
		
		/*for (int i = 0; i < b; i++) 
			result *= a;
		
		return result;*/
		
		while (b-- > 0) 
			result *= a;
		
		return result;
	}
	
	public static int sumDigits(int val)
	{
		int sum = 0;
		val = Math.abs(val);
		
		while(val != 0) {
			sum += (val % 10);
			val /= 10;	
		}
		return sum;
	}
	
	public static int reverse(int val)
	{
		int result = 0;
		
		while(val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}
		return result;
	}
	
}
