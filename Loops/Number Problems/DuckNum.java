import java.util.Scanner;
class DuckNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		String num = sc.next();

		if(num.charAt(0)=='0')
			System.out.println(num+" is not a Duck Number.");
		else{
			if(num.contains("0"))
				System.out.println(num+" is Duck Number.");
			else
				System.out.println(num+" is not a Duck Number.");
		}
	}
}
