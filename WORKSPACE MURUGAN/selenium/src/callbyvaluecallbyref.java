
public class callbyvaluecallbyref {

	public static void main(String[] args) {
		callbyvaluecallbyref obj = new callbyvaluecallbyref();
		int f = obj.sum(10, 20);
		obj.swap(obj);
		System.out.println(f);
		
	}

	public int sum(int a, int b) {
		int c = a+b;
		a=40;
		b=100;
		
		return c;
	}
	public void swap(callbyvaluecallbyref t) 
	{
		
	}
	


}
