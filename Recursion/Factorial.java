import java.util.Scanner;
public class Factorial {
    public static void main(String [] args){
        System.out.print("Enter a Num : ");
        int num = new Scanner(System.in).nextInt();

        System.out.println("The Factorial of "+num+" is "+fact(num));
    }

    public static int fact(int num){
        if(num==0)
            return 1;

        return num*fact(num-1);
    }
}
