import java.util.Scanner;

public class A_BiscuitGenerator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int T = scanner.nextInt();
        int ans = 0;
        scanner.close();

        ans = B*Math.round(T/A);

        System.out.println(ans);
    }
}
