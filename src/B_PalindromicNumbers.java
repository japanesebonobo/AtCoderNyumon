import java.util.*;

public class B_PalindromicNumbers  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close(); 
        int ans = 0;

        for (int i = A; i <= B; i++) {
            String s = String.valueOf(i);
            char[] charArray = s.toCharArray();
            int j=0;
            while ((charArray[j] == charArray[(charArray.length-1)-j]) && j<=charArray.length/2) {
                j++;
            }
            if(j>=charArray.length/2) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}