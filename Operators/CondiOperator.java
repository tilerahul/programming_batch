class CondiOperator
{
	public static void main(String[] args) 
	{
		int a = 22;
		int b = 44;
		int c = 100;

		int lar = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("The largest num is : "+lar);

		int small = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println("The Smallest num is : "+small);
	}
}
