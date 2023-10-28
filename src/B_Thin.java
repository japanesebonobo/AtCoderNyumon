import java.util.*;

public class B_Thin  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        char C[][] = new char[H][W];
        for (int i = 0; i < H; i++) {
            String S = scanner.next();
            char[] c = S.toCharArray();
            for (int j = 0; j < W; j++) {
                C[i][j] = c[j];
            } 
        }
        scanner.close();

        for (int i = 0; i < 2*H; i++) {
            for (int j = 0; j < W; j++) {
                int k = i/2;
                if (j == W-1) {
                    System.out.println(C[k][j]);
                } else {
                    System.out.print(C[k][j]);
                }
            }
        }
    }
}