/*
	1. Write a Program of Sum of Series 
		(1 + x + x^2 + x^3 + x^4 +............ up to n-th terms).
*/

public class Q1
{
    public static void main(String[] args)
	{

		int x=Integer.parseInt(args[0]);
        int n=Integer.parseInt(args[1]);
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum += (Math.pow(x,i));
		}
		System.out.println("The result is : "+sum);
    }
}