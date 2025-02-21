import java.util.Scanner;
class BinaryToNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary : ");
		String bin = sc.next();
		int num = 0;

		for(int i=bin.length()-1; i>=0; i--){
			if(bin.charAt(i)=='1')
				num += (int)Math.pow(2,bin.length() - i -1);
		}
		System.out.println(bin+" : "+num);
	}
}
