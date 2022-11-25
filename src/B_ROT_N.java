import java.util.*;

public class B_ROT_N  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        byte[] byteS = S.getBytes();
        byte[] ans = new byte[byteS.length];
        
        for (int i = 0; i < byteS.length; i++) {
            ans[i] = (byte)((byteS[i] - 65 + N) % 26 + 65);
        }

        System.out.println(new String(ans));
    }

    
}
