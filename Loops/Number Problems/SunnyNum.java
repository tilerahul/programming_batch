import java.util.Scanner;
class SunnyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt()+1;
		boolean flag = false;

		for(int i=2; i*i<=num; i++){
			if(i*i==num){
				flag=true;
				break;
			}
		}
		

		if(flag)
			System.out.println((num-1)+" is a Sunny number.");
		else
			System.out.println((num-1)+" is not a Sunny number.");
	}
}
