class FascinatingWithoutString 
{
	public static void main(String[] args) 
	{
		int num = 327;
		int dup = num;
		for(int i=2; i<=3; i++){
			num = (num*1000)+dup*i;
		}
		
		boolean flag = true;
		for(int i=1; i<=9; i++){
			int cnt=0;
			for(int j = num; j>0; j/=10){
				if(i==(j%10))
					cnt++;
			}
			if(cnt!=1){
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(dup+" is Fascinating Number");
		else
			System.out.println(dup+" is not Fascinating Number");
	}
}
