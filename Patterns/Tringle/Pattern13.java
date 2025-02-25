// Write a program to print following pattern.
// 5*4*3*2*1*5*4*3*2*1*
// 4*3*2*1*4*3*2*1*
// 3*2*1*3*2*1*
// 2*1*2*1*
// 1*1*

class Pattern13 
{
	public static void main(String[] args) 
	{
		for(int i=5; i>=1; i--){
			for(int k=1; k<=2; k++){
				int a = i;
				for(int j=1; j<=i; j++)
					System.out.print(a-- +"*");
			}
			System.out.println();
		}
		
	}
}
