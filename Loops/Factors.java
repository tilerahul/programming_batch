import java.util.Scanner;
class Factors 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Num : ");
		int num = new Scanner(System.in).nextInt();

		for(int i = 1; i<=num; i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}
	}
}
