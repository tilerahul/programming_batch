class Pattern5
{
	public static void main(String[] args) 
	{
		
		char a = 'a';
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
}
