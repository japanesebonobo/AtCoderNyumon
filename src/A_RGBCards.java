import java.util.Scanner;

public class A_RGBCards  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = 0;
        scanner.close();

        ans = 100*R + 10*G + B;

        if(ans % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
