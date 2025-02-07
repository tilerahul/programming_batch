import java.util.Scanner;
class VolumeOfCylinder
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		final float pi = 22/7;
		System.out.print("Enter radius of cylinder (cm) : ");
		float radius = sc.nextFloat();

		System.out.print("Enter height of cylinder (cm) : ");
		float height = sc.nextFloat();

		float area = pi*radius*radius;
		float volume = area * height;

		System.out.println("The volume of the cylinder : "+volume+" cm^3");
	}
}