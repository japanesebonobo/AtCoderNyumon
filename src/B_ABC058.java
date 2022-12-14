import java.util.Scanner;

public class B_ABC058  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String O = scanner.next();
        String E = scanner.next();
        scanner.close();

        char[] o = O.toCharArray();
        char[] e = E.toCharArray();

        char[] ansChar = new char[o.length+e.length];

        for (int i = 0; i < ansChar.length; i++) {
            if ((i+1)%2 != 0) {
                ansChar[i] = o[i/2];
            } else {
                ansChar[i] = e[i/2];
            }
        }   
        
        String ans = new String(ansChar);
        System.out.println(ans);
    }
}
