import java.util.Scanner;
class PetersonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=num; i>0; i/=10){
			int rem = i%10;
			int fact =1;
			for(int j=1; j<=rem; j++)
				fact *= j;
			sum += fact;
		}

		if(sum == num)
			System.out.println(num+" is a peterson number.");
		else
			System.out.println(num+" is not a peterson number.");
	}
}
