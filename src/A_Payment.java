import java.util.Scanner;

public class A_Payment  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int ans = 0;
        scanner.close();

        ans = N%1000;

        if(ans == 0) {
            System.out.println(ans);   
        } else {
            System.out.println(1000 - ans);
        }
    }
}