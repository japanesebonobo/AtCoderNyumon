import java.util.Scanner;

public class B_AcCepted  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        scanner.close();

        if (isAC(S)) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }

    public static boolean isAC(String S) {

        char first = S.charAt(0);
        if (first != 'A') {
            return false;
        }

        String second = S.substring(2,S.length()-1);
        int length = second.length();
        second = second.replace("C", "");
        if (second.length() != length-1) {
            return false;
        }

        String third = S.replace("A", "").replace("C", "");
        if (!third.toLowerCase().equals(third)) {
            return false;
        }
        return true;
    }
}
