import java.util.Scanner;
class PoundsToKilogram 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number in pounds : ");
		float pound = new Scanner(System.in).nextFloat();

		float kg = pound*0.454f;

		System.out.println(pound+" is equal to "+kg+" kilogram.");
	}
}
