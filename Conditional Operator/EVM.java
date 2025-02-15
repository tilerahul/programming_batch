import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("******* WELCOME *******");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int bjp=0, cng=0, ss=0, mns=0, aap=0, nota=0;

		System.out.print("Enter population : ");
		int population = sc.nextInt();

		for(int i=1; i<=population; i++)
		{
			System.out.println();
			System.out.println("******* List of the Parties ********");
			System.out.println("1.BJP");
			System.out.println("2.CNG");
			System.out.println("3.SS");
			System.out.println("4.AAP");
			System.out.println("5.MNS");
			System.out.println("6.NOTA");
			System.out.println();

			System.out.print("Enter Your Option : ");
			int opt = sc.nextInt();

			if(opt>=1 && opt<=6)
			{
				if(opt==1){
					bjp++;
					System.out.println("Achhe din ayenge !!");
				}
				if(opt==2){
					cng++;
					System.out.println("Bharat Todo !!");
				}
				if(opt==3){
					ss++;
					System.out.println("Hum Hai asli sena !!");
				}
				if(opt==4){
					aap++;
					System.out.println("Jay Maharashtra !!");
				}
				if(opt==5){
					mns++;
					System.out.println("Muze Azaad karo !!");
				}
				if(opt==6){
					nota++;
					System.out.println("You are a educated person !!");
				}
			}
			if(!(opt>=1 && opt<=6))
			{
				i--;
				System.out.println("Invalid Option !!");
			}
		}

		if(bjp>=cng && bjp>=ss && bjp>=mns && bjp>=aap && bjp>=nota)
		{
			System.out.println("BJP Won the Election by "+bjp+" votes");
			return;
		}
		if(cng>=ss && cng>=mns && cng>=aap && cng>=nota)
		{
			System.out.println("CNG Won the Election by "+cng+" votes");
			return;
		}
		if(ss>=mns && ss>=aap && ss>=nota)
		{
			System.out.println("Shiv Sena Won the Election by "+ss+" votes");
			return;
		}
		if(mns>=aap && mns>=nota)
		{
			System.out.println("MNS Won the Election by "+mns+" votes");
			return;
		}
		if(aap>=nota)
		{
			System.out.println("AAP Won the Election by "+aap+" votes");
			return;
		}
		System.out.println("No One win the Election");
		
	}
}
