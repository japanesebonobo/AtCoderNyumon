import java.util.*;

public class B_TwoAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        String T = scanner.next();
        scanner.close();
        
        String ans = "No";

        char[] sChars = S.toCharArray();
        char[] tChars = T.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        String sortedAscT = new String(tChars);

        StringBuilder sbT = new StringBuilder(sortedAscT);
        sbT.reverse();

        String sortedS = new String(sChars);
        String sortedT = sbT.toString();

        if (sortedS.compareTo(sortedT) < 0) {
            ans = "Yes";
        }
        
        System.out.println(ans);
    }
}
