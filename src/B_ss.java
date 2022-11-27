import java.util.Arrays;
import java.util.Scanner;

public class B_ss  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        scanner.close();

        char[] s = S.toCharArray();

        for (int i = 0; i < s.length; i++) {
            char[] now = new char[s.length-1-i];
            System.arraycopy(s, 0, now, 0, s.length-1-i);
            
            if (now.length%2 != 0) {
                continue;
            }

            char[] firstHalf = new char[now.length/2];
            System.arraycopy(now, 0, firstHalf, 0, now.length/2);
            char[] secondHalf = new char[now.length/2];
            System.arraycopy(now, now.length/2, secondHalf, 0, now.length/2);
            if (Arrays.equals(firstHalf, secondHalf)) {
                System.out.println(firstHalf.length+secondHalf.length);
                System.exit(0);
            }
        } 
    }
}
