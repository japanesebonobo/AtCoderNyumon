import java.util.*;

public class B_typo  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        String T = scanner.next();
        scanner.close();

        int count = 0;
        String ans = "No";

        char[] s = S.toCharArray();
        char[] t = T.toCharArray();

        if(Arrays.equals(s, t)) {
            ans = "Yes";
            System.out.println(ans);
            System.exit(0);
        }

        for (int i = 0; i < s.length-1; i++) {
            if(s[i] == t[i+1] && s[i+1] == t[i]) {
                s[i] = t[i];
                s[i+1] = t[i+1];
                if (Arrays.equals(s, t)) {
                    count++;
                }
            }
        }
        
        if (count == 1) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
