import java.util.Scanner;
class CelciusToFahrenheit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature(cel) : ");
		float cel = sc.nextFloat();

		float fah =	(9.0f/5.0f)*cel + 32.0f;

		System.out.println("The temperature in fahrenheit is "+fah+" fah");
	}
}