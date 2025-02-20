class Pattern4
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=4; i++)
		{
			char a = 'a';
			for(int j=1; j<=i; j++)
			{
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
}
