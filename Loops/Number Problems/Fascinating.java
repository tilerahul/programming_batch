class Fascinating 
{
	public static void main(String[] args) 
	{
			//int num = 327;
		for(int num=1; num<1000; num++){
			String str = ""+num+(num*2)+(num*3);
			boolean flag = true;
			for(char ch='1'; ch<='9'; ch++){
				int cnt = 0;
				for(int j=0; j<str.length(); j++){
					if(str.charAt(j)==ch)
						cnt++;
				}
				if(cnt!=1){
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println(num+" is Fascinating Number.");
		}
	}
}
