import java.util.Scanner;
class EvilNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt();

		String bin = Integer.toBinaryString(num);

		int cnt =0;
		for(int i=0; i<bin.length(); i++){
			if(bin.charAt(i)=='1')
				cnt++;
		}
		if(cnt%2==0)
			System.out.println(num+" is Evil Number.");
		else
			System.out.println(num+" is not Evil Number.");
	}
}
