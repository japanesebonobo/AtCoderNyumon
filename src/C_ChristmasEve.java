import java.util.*;

public class C_ChristmasEve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int h[] = new int[N];

        for (int i = 0; i < N; i++) {
            h[i] = scanner.nextInt();
        }
        scanner.close();
        
        int ans = 1000000000;

        Arrays.sort(h);
        
        for (int i = 0; i < N-K+1; i++) {
            int min = h[i+K-1] - h[i];
            if (min < ans) {
                ans = min;
            }
        }

        System.out.println(ans);
    }
}
