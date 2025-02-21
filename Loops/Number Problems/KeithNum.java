import java.util.Scanner;
class KeithNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt();

		int sum = 0;
		while(true){
			int rem;
			for(int i = num ; i>0; i/=10){
				rem = i%10;
				sum += rem;
			}
			if(sum>=num)
				break;
			else

			System.out.println(sum);
		}
	}
}
