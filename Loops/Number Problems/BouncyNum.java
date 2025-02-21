import java.util.Scanner;
class BouncyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt();
		boolean isIncr = true;
		boolean isDecr = true;

		for(int i=num; i>9;){
			int rem1 = i%10;
			i/=10;
			int rem2 = i%10;

			if(rem1<rem2){
				isIncr = false;
				break;
			}
		}

		for(int i=num; i>9;){
			int rem1 = i%10;
			i/=10;
			int rem2 = i%10;

			if(rem1>rem2){
				isDecr = false;
				break;
			}
		}
		if(isIncr || isDecr)
			System.out.println(num+" is not a Bouncy Number.");
		else
			System.out.println(num+" is a Bouncy Number.");
	}
}
