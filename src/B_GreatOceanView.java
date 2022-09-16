import java.util.*;

public class B_GreatOceanView  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int m[] = new int[N];
        int max = -1;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            m[i] = scanner.nextInt();
            if(max <= m[i]) {
                max = m[i];
                ans++;
            }
        }
        scanner.close();
        
        System.out.println(ans);
    }
}