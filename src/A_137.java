import java.util.Scanner;

public class A_137  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = 0;

        ans = A+B;

        if(ans < (A-B)) {
            ans=A-B;
        }

        if(ans < (A*B)) {
            ans=A*B;
        }

        System.out.println(ans);
    }
}
