import java.util.*;

public class B_Minesweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();

        int DX[] = {-1,-1,0,1,1,1,0,-1};
        int DY[] = {0,1,1,1,0,-1,-1,-1};

        String S[] = new String[H];
        char [][] tmp = new char[W][H];
        char [][] ans = new char[H][W];
        for (int i = 0; i < H; i++) {
            S[i] = scanner.next();
            char c[] = S[i].toCharArray();
            for (int j = 0; j < W; j++) {
                if (c[j] == '#') {
                    tmp[j][i] = '#';
                } else {
                    tmp[j][i] = '.';
                }
            }
        }
        scanner.close();

        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                if (tmp[i][j] == '#') {
                    ans[j][i] = '#';
                    continue;
                }

                int counter = 0;
                for (int k = 0; k < 8; k++) {
                    if (i+DX[k] < 0 || i+DX[k] >= W || j+DY[k] < 0 || j+DY[k] >= H) {
                        continue;
                    }

                    if (tmp[i+DX[k]][j+DY[k]] != '#') {
                        continue;
                    }
                    counter++;
                }
                ans[j][i] = (char) (counter + '0');
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (j == W-1) {
                    System.out.println(ans[i][j]);
                } else {
                    System.out.print(ans[i][j]);
                }
            }
        }
    }
}
