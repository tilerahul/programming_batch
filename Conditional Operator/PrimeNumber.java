import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a num : ");
		int num = new Scanner(System.in).nextInt();

		System.out.println(
			(num==2 || num==3)?(num+" is prime")
			:((num%2==0 || num%3==0 || num%5==0)?(num+" is not prime")
			:(num+" is prime"))	
		);
	}
}
