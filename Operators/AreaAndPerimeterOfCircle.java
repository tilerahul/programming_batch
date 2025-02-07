import java.util.Scanner;
class AreaAndPerimeterOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final float pi = 22/7;

		System.out.print("Enter radius of circle(cm) : ");
		float radius = sc.nextFloat();

		float area = pi*radius*radius;
		float perimeter = 2*pi*radius;

		System.out.println("The Area of circle is : "+area+" cm^2");
		System.out.println("The Perimeter of circle is : "+perimeter+" cm");
	}
}
