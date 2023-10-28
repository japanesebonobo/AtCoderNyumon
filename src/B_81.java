import java.util.*;

public class B_81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.close();
        
        String ans = "No";

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i*j == N) {
                    ans = "Yes";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
