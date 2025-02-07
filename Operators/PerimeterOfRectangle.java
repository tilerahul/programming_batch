import java.util.Scanner;
class PerimeterOfRectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width of rectangle(cm) : ");
		float width = sc.nextFloat();
		System.out.print("Enter height of rectangle(cm) : ");
		float height = sc.nextInt();

		float perimeter = 2*width + 2*height;
		System.out.println("Perimeter of the rectangle : "+perimeter+" cm");
	}
}
