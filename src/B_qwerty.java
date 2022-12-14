import java.util.Scanner;

public class B_qwerty  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] input = new int[26];
        char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] ansChar = new char[26];

        for (int i = 0; i < 26; i++) {
            input[i] = scanner.nextInt();
            ansChar[i] = alphabet[input[i]-1];
        }
        scanner.close();

        String ans = new String(ansChar);
        System.out.println(ans);
    }
}
