package Array;

public class onedimensionalarraySample {
	
	public static void main(String[] args) {
		
		int i[] = new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=40;
		i[3]=50;
				System.out.println(i[2]);
				
				for (int j=0;j<4;j++) {
					System.out.println(i[j]);
				}
		
		double k[]= new double [3];
		k[1]=10;
		k[2]=30.9999;
		//System.out.println(k[1]);
		System.out.println(k[2]);
		
		char s[]= new char[5];
		s[0]='m';
		s[1]='u';
		s[2]='r';
		s[3]='u';
		System.out.println(s[3]);
		
		String g[]=new String[10];
		g[0]="murugan";
		g[1]="is";
		g[2]="nice";
		g[3]="guy";
		
		System.out.println(g[3]);
		System.out.println(g.length);
		
		
		
		
	}

}
