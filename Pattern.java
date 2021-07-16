package javapractice;

public class Pattern {

	public static void main(String[] args) {
		int a=1;
		for (int i=1;i<=4;i++)
		{
			//System.out.println("outer loop started");
			
			for (int j =i;j<=4;j++)
			{
				//System.out.println("inner loop");
				System.out.print( a);
				System.out.print("\t");
				a++;
			}
			//System.out.println("outer loop end");
			System.out.println("");
		}
	}
		

}
