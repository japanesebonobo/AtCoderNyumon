import java.util.Scanner;

public class A_WeLoveGolf  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String ans = "NG";
        scanner.close();

       while (ans == "NG") {
            if (B < A) {
                break;
            }

            if(B%K == 0) {
                ans = "OK";
            }
            B-=1;
       }

        System.out.println(ans);
    }
}
