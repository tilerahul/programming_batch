import java.util.Scanner;
class CharCheck 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter char : ");
		char ch = new Scanner(System.in).next().charAt(0);

		System.out.println((ch>='A' && ch<='Z' || ch>='a' && ch<='z')?
			((ch>='A' && ch<='Z')?(ch+" is an UpperCase alphabet"):(ch+" is a LowerCase alphabet")):
			((ch>='0' && ch<='9')?(ch+" is a Digit"):(ch+" is a special charecter")));
	}
}
