import java.util.*;

public class B_Bingo  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
    
        int N = scanner.nextInt();
        int b[] = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = scanner.nextInt();
        }
        scanner.close();

        boolean[][] matcher = new boolean[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < b.length; k++) {
                    if (A[i][j] == b[k])  {
                        matcher[i][j] = true;
                    }
                }
            }
        }

        String ans = "No";

        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (matcher[i][j] == true) {
                    count ++;
                }
            }
            if (count == 3) {
                ans = "Yes";
                break;
            }
        }

        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (matcher[j][i] == true) {
                    count ++;
                }
            }
            if (count == 3) {
                ans = "Yes";
                break;
            }
        }

        if (matcher[0][0] == true && matcher[1][1] == true && matcher[2][2] == true ) {
            ans = "Yes";
        }
        if (matcher[0][2] == true && matcher[1][1] == true && matcher[2][0] == true ) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}