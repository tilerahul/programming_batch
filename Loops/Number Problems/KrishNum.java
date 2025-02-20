import java.util.Scanner;
class KrishNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.prin("Enter Num : ");
		int num = sc.nextInt();
		int dup = num;
		int sum=0;

		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int i=1; i<rem; i++)
			{
				fact *=i;
				System.out.println(fact);
			}
			sum = fact;
			num/=10;
		}

		if(dup==sum)
			System.out.println(dup+" is Krush Num.");
		else
			System.out.println(dup+" is not a krush Num");
	}
}
