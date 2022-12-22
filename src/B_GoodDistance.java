import java.util.*;

public class B_GoodDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();

        int X[][] = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                X[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int sum = 0;
                for (int k = 0; k < D; k++) {
                    sum += Math.pow((X[i][k] - X[j][k]),2);
                }
                double sumRoot = Math.sqrt(sum);
                if (sumRoot%1 == 0) {
                    ans ++; 
                }
            }
        }
        System.out.println(ans);
    }
}
