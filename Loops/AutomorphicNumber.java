import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int num = sc.nextInt();

		int div = 1;
		for(int i=num; i>0; i/=10)
			div *= 10;

		if(num == (num*num)%div)
			System.out.println(num+" is Automorphic Number");
		else
			System.out.println(num+" is not Automorphic Number");
	}
}
