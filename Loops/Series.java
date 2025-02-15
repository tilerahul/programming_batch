public class Series {
    public static void main(String[] args) {
        int num = 79;
        int prime = 29;
        System.out.print(num+" ");
        for(int i=0; i<5; i++){
            num += prime;
            System.out.print(num+" ");

            for(int j = prime+1; ;j++){
                boolean flag = true;
                for(int k=2; k*k<=j; k++){
                    if(j%k==0){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    prime=j;
                    break;
                }
            }
        }
    }
}
