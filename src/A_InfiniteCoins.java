import java.util.Scanner;

public class A_InfiniteCoins  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int one = 0;
        scanner.close();

        if(N <= A) {
            System.out.println("Yes");
            System.exit(0);
        }

        one = N%500;

        if(one <= A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
