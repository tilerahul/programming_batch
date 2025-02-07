import java.util.Scanner;
class BMI 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight(pounds) : ");
		float weight = sc.nextFloat();

		System.out.print("Enter your height(inches) : ");
		float height = sc.nextFloat();

		float weightInKg = weight*0.45359237f;
		float heightInMeter = height*0.0254f;

		float bmi = weightInKg/(heightInMeter*heightInMeter);

		System.out.println("BMI is "+bmi);
	}
}
