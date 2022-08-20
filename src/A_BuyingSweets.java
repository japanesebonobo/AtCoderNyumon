import java.util.Scanner;

public class A_BuyingSweets  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = 0;
        scanner.close();

        ans = X-A;

        System.out.println(ans%=B);
    }
}
