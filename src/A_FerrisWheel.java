import java.util.Scanner;

public class A_FerrisWheel  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = 0;

        ans = B;

        if(A >= 6 && A <= 12) {
            ans=B/2;
        }

        if(A <= 5) {
            ans=0;
        }

        System.out.println(ans);
    }
}
