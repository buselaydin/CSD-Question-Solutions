package csd;

class App {
	public static void main(String [] args)
	{		
		QuadraticEquationSolverApp.run();
	}
}
class QuadraticEquationSolverApp {
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.printf("enter coefficients: ");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		
		QuadraticEquationSolver.printRoots(a, b, c);
	}
}
class QuadraticEquationSolver {
	
	public static void doWorkForDiffrentRoots(double a, double b, double delta)
	{
		double x = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("Diffrent Roots: %.2f and %.2f", x, -x);
	}
	
	public static void doWorkForSameRoots(double a, double b)
	{
		double x = -b / (2 * a);
		System.out.printf("x1 = x2 : %.2f ", x);
	}
	
	public static double findDelta(double a, double b, double c)
	{
		return b*b - 4 * a * c;
		
	}
	public static void printRoots(double a, double b, double c)
	{
		double delta = findDelta(a, b, c);
		

		if (delta > 0)
			doWorkForDiffrentRoots(a, b, delta);
		else if(delta == 0)
			doWorkForSameRoots(a, b);
		else 
			System.out.println("no root");
		
	}
}