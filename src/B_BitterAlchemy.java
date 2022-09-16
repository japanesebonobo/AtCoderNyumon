import java.util.*;

public class B_BitterAlchemy  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int m[] = new int[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            m[i] = scanner.nextInt();
            X -= m[i];
            ans++;
        }
        scanner.close();

        Arrays.sort(m);

        while(X >= m[0]) {
            X -= m[0];
            ans++;
        }
        
        System.out.println(ans);
    }
}