import java.util.Scanner;
class NoOfYears 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the minutes : ");
		long min = new Scanner(System.in).nextLong();

		long years = min/(60*24*365);
		long days = (min%(years*365*24*60))/(60*24);

		System.out.println(min+" is equal to "+years+" years and "+days+" days");
	}
}
