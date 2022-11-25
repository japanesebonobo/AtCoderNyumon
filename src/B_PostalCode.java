import java.util.Scanner;
import java.util.regex.Pattern;

public class B_PostalCode  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        if(isPostalCode(A, B, S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPostalCode(int A, int B, String S) {
        String replacedS = S.replace("-", "");
        if (A+B+1 != S.length()) {
            return false;
        }

        if(S.charAt(A) != '-') {
            return false;
        }

        if (replacedS.length() != S.length()-1) {
            return false;
        }

        if (!checkInteger(replacedS)) {
            return false;
        }

        return true;
    }

    public static boolean checkInteger(String S) {
        Pattern pattern = Pattern.compile("^[0-9]*$");
        return pattern.matcher(S).matches();
    }
}
