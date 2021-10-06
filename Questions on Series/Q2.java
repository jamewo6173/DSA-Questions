
//Fibonacci Series

public class Q2
{
	 static void fibonacci(int n1, int n2,int n)
	 {
		 if (n>0)
		 {
			 int n3=n1+n2;
			 n1=n2;
			 n2=n3;
			 System.out.print(" "+n3);
		 }
		 else
		 {
			System.exit(0); // To prevent Stackoverflow error
		 }
		 fibonacci(n1,n2,n-1);
	}
	public static void main(String[] args) 
	{
		 int n = Integer.parseInt(args[0]);
		 System.out.print("0 1");
		 fibonacci(0,1,n-2);
	 }
}
