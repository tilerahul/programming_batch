// Find the num is even or odd 

import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a num : ");
		int num = new Scanner(System.in).nextInt();

		System.out.println(num%2==0);
		System.out.println((num/2)*2==num); //return true if num is even else return false
		System.out.println(num/2==num/2.0); //return true if num is even else return false
	}
}
