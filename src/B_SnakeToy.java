import java.util.*;

public class B_SnakeToy  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int l [] = new int[N];
        
        for (int i = 0; i < N; i++) {
            l[i] = scanner.nextInt();
        }
        scanner.close();

        int ans = 0;

        Arrays.sort(l);

        while(K>0) {
            ans += l[N-1];
            N--;
            K--;
        }

        System.out.println(ans);
    }
}