import java.util.*;

public class B_Palace  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int A = scanner.nextInt();
        Map<Double, Integer> diffMap = new HashMap<>();
        double diff = 10000000;
        int ans = 0;

        for (int i = 1; i < N+1; i++) {
            int height = scanner.nextInt();
            double nowDiff  = Math.abs(A - (T - (height*0.006)));
            if(diff > nowDiff) {
                diff = nowDiff;
                diffMap.put(diff,i);
            }
        }
        scanner.close();

        ans = diffMap.get(diff);

        System.out.println(ans);
    }
}