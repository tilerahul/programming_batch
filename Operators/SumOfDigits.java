class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int num = 7264;

		int even = 0;
		int odd = 0;
		int temp = 0;

		int rem = num%10;
		temp = (rem%2==0) ? (even+=rem) : (odd+=rem);
		num/=10;
		
		rem = num%10;
		temp = (rem%2==0) ? (even+=rem) : (odd+=rem);
		num/=10;
		
		rem = num%10;
		temp = (rem%2==0) ? (even+=rem) : (odd+=rem);
		num/=10;
		
		rem = num%10;
		temp = (rem%2==0) ? (even+=rem) : (odd+=rem);
		num/=10;

		System.out.println("Even : "+even+" Odd : "+odd);
	}
}
