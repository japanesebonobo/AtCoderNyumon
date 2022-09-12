import java.util.*;

public class B_Bounding  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int [] coordinates = new int[N+1];
        int [] length = new int[N+1];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            length[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < N+1; i++) {
            if(i==0) {
                coordinates[0] = 0;
            } else {
                coordinates[i] = coordinates[i-1] + length[i-1];
            }
            if(coordinates[i] <= X) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}