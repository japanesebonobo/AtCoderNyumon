import java.util.Scanner;

public class B_SomeSums  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = 0;
        scanner.close();

       for (int i = 1; i <= N; i++) {
        int sum = 0;
        int num = i;
        while(num != 0) {
            sum += num%10;
            num /= 10;
        }
        if (sum>=A && sum<=B) {
            ans += i;
        }
       }

        System.out.println(ans);
    }
}
