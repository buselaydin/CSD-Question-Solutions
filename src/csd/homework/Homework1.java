package csd.homework;

class example1 {

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Enter 3 numbers: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		shorting(a, b, c);
		
	}
	
	public static void shorting(int a, int b, int c)
	{
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a,Math.max(b,c));
		int mid = a + b+ c - min - max;
		
		if(min < mid)
			System.out.printf("%d < %d", min, mid);
		else
			System.out.printf("%d = %d", min, mid);
		
		if(mid < max)
			System.out.printf(" < %d", max);
		else
			System.out.printf(" = %d", max);
				
	}
}
class example2 {

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Enter 3 numbers: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		System.out.printf("mid value : %d", mid(a, b, c));
		
	}
	
	public static int mid(int a, int b, int c)
	{
		if(a <= b && b <= c || c <= b && b <= a)
			return b;
		
		if(b <= a && a <= c || c <= a && a <= b)
			return a;
		
		return c;
				
	}
}

class example3 {

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Enter 3 numbers: ");
		int val = kb.nextInt();
		
		
		System.out.printf("signum : %d", signum(val));
		
	}
	
	public static int signum(int val)
	{
		if(val < 0)
			return -1;
		else if(val == 0)
			return 0;
		
		return 1;
				
	}
}



