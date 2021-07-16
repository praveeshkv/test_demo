package javapractice;

public class Javapractice1 {

	public void setData() // method
	{

		System.out.println("praveesh");

	}

	public static void main(String[] args) {

		// String : it is one of the prebuilt class in java
		// 1.String literal 2.by creating object of string

		Javapractice1 z = new Javapractice1();
		z.setData(); // calling menthod inside psvm using object
		Basic2 z1 = new Basic2();
		z1.validateHeader();

		String a = "madam";// string
		String t = "";
		// System.out.println(a.charAt(2));
		// System.out.println(a.indexOf("e"));
		/*
		 * System.out.println(a.substring(3, 6)); System.out.println(a.substring(5));
		 * System.out.println(a.concat("rahul teaches")); // a.length()
		 * System.out.println(a.trim()); a.toUpperCase(); a.toLowerCase(); // split
		 * String arr[] = a.split("t"); System.out.println(arr[0]);
		 * System.out.println(arr[1]); System.out.println(a.replace("t","s"));
		 */

		for (int i = a.length()-1 ; i>= 0; i--) {
			t = t + a.charAt(i);

		}
		System.out.println(t);
		
		if (a.equals(t)) 
			
		{
			System.out.println("it is  palindrome");
		} 
		else {
			System.out.println("it is nt palindrome");
		}
	}
}
