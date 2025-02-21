import java.util.Scanner;
class NumToBinary1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt();

		String bin = Integer.toBinaryString(num);
		System.out.println(num+" : "+bin);
	}
}
