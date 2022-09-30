import java.util.*;

public class C_DivideTheProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int cnt = 0;
        int ans = 0;

        if(N%2 != 0) {
            System.out.println(0);
            System.exit(0);
        }

        int d[] = new int[N];

        for (int i = 0; i < N; i++) {
            d[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(d);
        
        int mid = (d[N-1] + d[0])/2;
        for (int i = 0; i < d.length; i++) {
            if (d[i] <= mid) {
                cnt++;
            }
        }

        if (cnt == N/2) {
            ans = d[cnt] - d[cnt-1];
        }

        System.out.println(ans);
    }
}
