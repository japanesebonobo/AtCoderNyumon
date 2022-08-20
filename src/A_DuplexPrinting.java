import java.util.Scanner;

public class A_DuplexPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextInt();
        double ans = 0.0;
        scanner.close();

        ans = (double)N/2;

        System.out.println((int)Math.ceil(ans));
    }
}