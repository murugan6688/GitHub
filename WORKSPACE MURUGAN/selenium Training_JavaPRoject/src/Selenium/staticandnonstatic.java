
public class staticandnonstatic {
	
	String Name = "tom";
				
			static int i =10;
			
			public static void main (String[] Args) 
			{
				demo();
				
				staticandnonstatic obj = new staticandnonstatic();
				obj.staticmethod();
				
			
			}
			

public void staticmethod() 
{
System.out.println("staticmethod");	
}

public static void demo() 
{
	System.out.println("demo non static");
	
}

}

