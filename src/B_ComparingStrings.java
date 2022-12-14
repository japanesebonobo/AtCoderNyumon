import java.util.*;

public class B_ComparingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        StringBuilder sba = new StringBuilder();

        for (int i = 0; i < b; i++) {
            sba.append(String.valueOf(a));
        }

        StringBuilder sbb = new StringBuilder();

        for (int i = 0; i < a; i++) {
            sbb.append(String.valueOf(b));
        }

        String strA = sba.toString();
        String strB = sbb.toString();
         
        if (strB.compareTo(strA) > 0) {
            System.out.println(strA);
        } else {
            System.out.println(strB);
        }
    }
}
