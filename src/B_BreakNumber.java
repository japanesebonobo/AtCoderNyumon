import java.util.*;

public class B_BreakNumber  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.close(); 
        int now = N;
        int MaxCount = 0;
        int ans = 1;
    
        while(now > 0)  {
            int count = 0;
            N = now;
            while (N > 0) {
                if ((N % 2) == 0) count+=1;
                N/=2;
            }
            if (count > MaxCount) {
                MaxCount = count;
                ans = now;
            }
            now -= 1;
        }   

        
        System.out.println(ans);
    }
}