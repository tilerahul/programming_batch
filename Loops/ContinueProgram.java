// Write a program to print Uppercase Alphabet (A-Z) using Continue Statement.
class ContinueProgram 
{
	public static void main(String[] args) 
	{
		for(char ch = 48; ch<=127; ch++){
			if(ch<65 || ch>90)
				continue;
			System.out.print(ch+" ");
		}
	}
}
