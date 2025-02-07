import java.util.Scanner;
class FinApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter subtotal");
		float subTotal = sc.nextFloat();

		System.out.print("Enter tip rate (%) : ");
		float tipRate = sc.nextFloat();

		float tip = subTotal*(tipRate/100);
		float total = tip+subTotal;

		System.out.println("the tip is "+tip+" and total is "+total);
	}
}
