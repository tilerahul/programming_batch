import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Num : ");
		int num = new Scanner(System.in).nextInt();
		int count = 0;

		for(int i = 2; i<num; i++)
		{
			if(num%i==0)
				count++;
		}

		if(count==0)
			System.out.println(num+" is a prime");
		else
			System.out.println(num+" is not a prime");
	}
}
