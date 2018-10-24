package Javatutorial;

public class stringConcatenation {

	public static void main(String[] args)
	{
		int a=10;
		double b=20.9999;
		String g="hello";
		String h="thiruvaluvar";
	// always java executes from left to right only//	
	System.out.println(a+b+g+h);
	System.out.println(g+h+(a+b));
	System.out.println(g+h+a+b);
	System.out.println((a+b)+g+h);

	System.out.println("concatenating:" +(a+b+g+h));
	System.out.println("adding:" +(g+h+(a+b)));
	System.out.println(g+h+a+b);
	System.out.println((a+b)+g+h);
	
	
	}
	
}
