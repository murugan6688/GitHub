package Array;

public class localvsglobalvariable {
	
	//global variables//
	String Name = "murugan";
	int h =10;
	
	public static void main (String[] args) {
		//local variable
		int i = 9;
		System.out.println(i);
		
		localvsglobalvariable obj = new localvsglobalvariable();
						System.out.println(obj.h);
						System.out.println(obj.Name);
			}
	
	public void localvariables()
	{
		// local variable
		 
	}

}
