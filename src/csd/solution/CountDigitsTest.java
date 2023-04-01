package csd.solution;

class CountDigitsTest {
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int val;
		System.out.print("Enter a number: ");
		
		while((val = Integer.parseInt(kb.nextLine())) != 0) {
			
			System.out.printf("%d of digits : %d%n",val, NumberUtil.countDigits(val));
			
			System.out.printf("%d of digits sum : %d%n",val, NumberUtil.sumDigits(val));
			
			System.out.print("Enter a number : ");
		}
	}
}
class NumberUtil {
	
	public static int countDigits(int val)
	{
		int count = 0;
		val = Math.abs(val);
		
		while(val != 0) {
			val /= 10;
			count++;
				
		}
		return count;	
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
