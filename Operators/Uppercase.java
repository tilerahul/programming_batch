import java.util.Scanner;
class Uppercase 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter char : ");
		char ch = new Scanner(System.in).next().charAt(0);

		System.out.println((ch>='A' && ch<='Z')?(ch+" is uppercase"):(ch+" is not uppercase"));
	}
}
