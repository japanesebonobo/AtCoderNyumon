import java.util.Scanner;

public class A_Takoyaki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();
        int ans = 0;
        scanner.close();

        if(N%X == 0) {
            ans = T*(N/X);
        } else {
            ans = T*(N/X) + T;
        }

        System.out.println(ans);
    }
}