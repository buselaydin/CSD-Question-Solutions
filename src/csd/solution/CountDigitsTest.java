package csd.solution;

class CountDigitsTest {
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int val;
		System.out.print("Enter a number: ");
		
		while((val = Integer.parseInt(kb.nextLine())) != 0) {
			
			System.out.printf("%d of digits : %d%n",val, NumberUtil.countDigits(val));
			
			System.out.print("Enter a number: ");
		}
	}
}
class NumberUtil {
	
	public static int countDigits(int val)
	{
		int count = 0;
		val = Math.abs(val);
		
		while(val != 0 ) {
			val /= 10;
			count++;
				
		}
		return count;	
	}
}
