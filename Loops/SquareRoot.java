import java.util.Scanner;
class SquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt();

		for(int i=1; i*i<=num; i++)
		{
			if(i*i==num){
				System.out.println("Square Root of the "+num+" is "+i);
				return;
			}
		}
		System.out.println(num+" is not a perfect Square");
	}
}