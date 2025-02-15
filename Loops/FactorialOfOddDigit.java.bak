import java.util.Scanner;
class FactorialOfOddDigit 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a Num : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int sum = 0;

		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			if(rem%2==1)
			{
				for(int i =1; i<=rem; i++)
				{
					fact*=i;
				}
				sum += fact;
			}
			
			num /= 10;
		}
		System.out.println("The Sum of Factorial of Digit of "+dup+" is "+sum);
	}
}
