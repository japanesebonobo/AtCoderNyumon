import java.util.Scanner;

public class B_FactorialYenCoin  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int P = scanner.nextInt();
        scanner.close();
        int ans = 0;
        int f = 0;

       for (int i = 10; i > 0; i--) {
        f = factorial(i);
        ans += P/f;
        P -= (P/f)*f;
       }

        System.out.println(ans);
    }

    private static int factorial(int n){
        if(n == 0) {
            return 1;
        }
        return n*factorial(n-1);
    }
}