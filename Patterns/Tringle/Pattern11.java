class Pattern11 
{
	public static void main(String[] args) 
	{
		//Single Pattern
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=(5-i); j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i ==5 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=(5-i); j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i ==5 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println();
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i ==5 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i ==5 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		//Vertical Combine Pattern
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=(5-i); j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--)
		{
			for(int j=1; j<=(5-i); j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i ==5 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}



		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i ==5 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		//Horizontal Combine Pattern
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=(5-i); j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i ==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=2; j<=i; j++)
			{
				if(j==1 || i ==5 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=(5-i); j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i ==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=2; j<=i; j++)
			{
				if(j==1 || i ==5 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
