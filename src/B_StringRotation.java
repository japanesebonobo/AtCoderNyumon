import java.util.*;

public class B_StringRotation  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        String T = scanner.next();
        scanner.close();

        String ans = "No";

        char[] s = S.toCharArray();
        char[] s2 = s.clone();
        String SS = new String(s) + new String(s2);

        if(SS.contains(T)) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
