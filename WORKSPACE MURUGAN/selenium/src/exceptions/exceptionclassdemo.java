package exceptions;

public class exceptionclassdemo {
	
	public static void main(String[] args) {
		
		exceptionclassdemo obj = new exceptionclassdemo();
		obj.exception();
		
		System.out.println("ABC");
	}
	
public void exception()
{
	try{	int i =9/0;
	
}catch(Throwable e) {

	e.printStackTrace();
	
}
		
	}
	



}