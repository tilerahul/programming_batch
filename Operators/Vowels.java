import java.util.Scanner;
class Vowels 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter char : ");
		char ch = new Scanner(System.in).next().charAt(0);

		System.out.println(
			(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')?
			(ch+" is a Vowel"):(ch+" is a Consonant")	
		);
	}
}