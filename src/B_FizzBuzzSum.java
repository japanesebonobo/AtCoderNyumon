import java.util.Scanner;

public class B_FizzBuzzSum  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.close();
        int[] F = new int[N];
        long ans = 0;

       for (int i = 0; i < N; i++) {
        F[i] = i+1;
        if (F[i]%3==0 || F[i]%5==0) {
            F[i] = 0;
        }
        ans += F[i];
       }

        System.out.println(ans);
    }
}
