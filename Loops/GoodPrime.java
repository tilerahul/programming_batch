import java.util.Scanner;
class GoodPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();


        for(int i=2; i<=num; i++){
            boolean flag = true;
            for(int j=2; j*j<=i; j++){
                if(i%j==0)flag=false;
                break;
            }

            if(flag){
                int dup = i;
                boolean flag2 = true;
                while(dup>0){
                    int rem = dup%10;
                    if(rem!=2 && rem!=3 && rem!=5 && rem!=7){
                        flag2 = false;
                        break;
                    }
                    dup /= 10;                        
                }
                if (flag2) {
                    System.out.println(i+" ");
                }
            }
                
        }
    }
}