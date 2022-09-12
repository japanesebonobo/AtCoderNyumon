import java.util.*;

public class B_Distance  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        double D = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            double d = Math.sqrt(Math.pow(p,2)+Math.pow(q,2));
            if(d <= D) {
                ans++;
            }
        }
        scanner.close();
        
        System.out.println(ans);
    }
}