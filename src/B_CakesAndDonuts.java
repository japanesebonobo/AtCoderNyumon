import java.util.*;

public class B_CakesAndDonuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.close();
        
        String ans = "No";

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 16; j++) {
                if (i*4+7*j==N) {
                    ans = "Yes";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
