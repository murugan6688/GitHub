package Javatutorial;

public class functionorMethodoverloading {

	
	public static void main(String[] args) {
	functionorMethodoverloading objrefe = new functionorMethodoverloading();
	
	objrefe.sum();
	objrefe.sum(5);
	objrefe.sum(3, 4);
	}
	
	
	public void sum()
	{
		System.out.println("no param");
	}
	
	public void sum (int a)
	{
		System.out.println("one param");
	}

	public void sum(int b,int c)
	{
		System.out.println("two param");
		System.out.println(b+c);
		
	}

}

