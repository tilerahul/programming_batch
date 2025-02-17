import java.util.Scanner;
class HockeyPlay 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int zeroCnt = 0;
		int oneCnt = 0;

		for(int i=0; i<str.length(); i++)
		{
			if(zeroCnt>=7)
			{
				System.out.println("YES");
				return;
			}
			if(str.charAt(i)=='0')
				zeroCnt++;
			else
				zeroCnt=0;

		}

		for(int i=0; i<str.length(); i++)
		{
			if(oneCnt>=7)
			{
				System.out.println("YES");
				return;
			}
			if(str.charAt(i)=='1')
				oneCnt++;
			else
				oneCnt=0;

		}
		System.out.println("NO");
	}
}
