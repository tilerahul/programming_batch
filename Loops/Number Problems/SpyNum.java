import java.util.Scanner;
class SpyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;

		for(int i=num; i>0; i/=10){
			sum += (i%10);
			product *= (i%10);
		}
		if(sum==product)
			System.out.println(num+" is a spy number.");
		else
			System.out.println(num+" is not a spy number.");
	}
}
