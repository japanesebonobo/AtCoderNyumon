import java.util.Scanner;

public class B_PalindromePhilia  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        scanner.close();

        char [] charArray = S.toCharArray();
        int ans = 0;

        int loop = (int)charArray.length/2;

        for (int i = 0; i < loop; i++) {
            if(charArray[i] != charArray[charArray.length-i-1]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
