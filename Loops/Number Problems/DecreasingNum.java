import java.util.Scanner;
class DecreasingNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt();
		boolean flag = true;

		for(int i=num; i>9;){
			int rem1 = i%10;
			i/=10;
			int rem2 = i%10;

			if(rem1>rem2){
				flag = false;
				break;
			}
		}
		System.out.println(flag ? num+" is Decreasing number." : num+" is not Decreasing number.");
	}
}
