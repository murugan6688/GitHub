package Javatutorial;
public class functionssample {
	public static void main(String [] args) 
	{
		functionssample hi = new functionssample();
		hi.noinputnooutput();
		hi.noinputsomeoutput();
		hi.someinputsomeoutput(10, 9);
	}
	public void noreturn()
	{
		System.out.println();
	}
	public void noinputnooutput()
	{
		System.out.println("no input and no out put");
	}
	public int noinputsomeoutput()
		{
		int a=10;
		int b=20;
		int c=a+b;
	System.out.println("sum of a and b is:" +(a+b));
	return c;
		}
	public void someinputsomeoutput(int x, int y)
	{
		double z= x/y;
		System.out.println("division of x/y is:" +z);
	}
}
