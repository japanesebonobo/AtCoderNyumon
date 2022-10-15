import java.util.Scanner;

public class B_AcCepted  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        scanner.close();
        
        String ans = "AC";

        char first = S.charAt(0);
        if (first != 'A') {
            ans = "WA";
        }

        String second = S.substring(2,S.length()-1);
        int length = second.length();
        second = second.replace("C", "");
        if (second.length() != length-1) {
            ans = "WA";
        }

        String third = S.replace("A", "").replace("C", "");
        if (!third.toLowerCase().equals(third)) {
            ans = "WA";
        }
        System.out.println(ans);
    }
}
