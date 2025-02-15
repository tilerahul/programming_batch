import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a Num : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int fact = 1;

		for(int i =1; i<=num; i++)
		{
			fact*=i;
		}
		System.out.println("The Factorial of "+dup+" is "+fact);
	}
}
