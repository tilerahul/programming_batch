import java.util.Scanner;
class HiProgram
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a num : ");
		int n = new Scanner(System.in).nextInt();

		String ans = (n%2==0 && n%5==0)?("HiTwoFive"):
			((n%2==0)?("HiTwo"):((n%5==0)?("HiFive"):("")));

		System.out.println(ans);
	}
}
