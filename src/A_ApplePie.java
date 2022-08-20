import java.util.Scanner;

public class A_ApplePie  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int P = scanner.nextInt();
        int ans = 0;
        scanner.close();

        ans = (A*3+P)/2;

        System.out.println(ans);
    }
}
