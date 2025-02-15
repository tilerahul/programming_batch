public class Series5 {
    public static void main(String[] args) {
        int n = 6; // Number of terms to generate
        int sum = 0; // Sum of factorials
        
        for (int i = 1; i <= n; i++) {
            sum += factorial(i); // Add factorial of i to sum
            System.out.print(sum + " ");
        }
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
