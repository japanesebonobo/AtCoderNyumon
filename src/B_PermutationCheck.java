import java.util.*;

public class B_PermutationCheck  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int C [] = new int[N];
        int A [] = new int[N];

        String ans = "No";
        
        for (int i = 0; i < N; i++) {
            C[i] = i+1;
            A[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(A);

        if(Arrays.equals(C, A)) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}