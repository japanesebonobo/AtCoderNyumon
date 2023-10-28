import java.util.*;

public class B_Substring  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        String T = scanner.next();
        scanner.close();

        int ans = 0;

        if (S.contains(T)) {
            System.out.println(ans);
            System.exit(0);
        }

        char[] s = S.toCharArray();
        char[] t = T.toCharArray();

        int score = 0;
        for (int i = 0; i < s.length - t.length+1; i++) {
            int tmpScore = 0;
            for (int j = 0; j < t.length; j++) {
                if(s[i+j] == t[j]) {
                    tmpScore++;
                }
            }
            if (tmpScore >= score) {
                score = tmpScore;
            }
        }
        
        ans = t.length-score;

        System.out.println(ans);
    }
}