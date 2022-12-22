import java.util.*;

public class B_MakingTriangle  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int S = scanner.nextInt();
        int T = scanner.nextInt();

        scanner.close();

        int ans = 0;

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                for (int k = 0; k <= 100; k++) {
                    if (i+j+k <= S) {
                        if (i*j*k <= T) {
                            ans ++;
                        }
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}