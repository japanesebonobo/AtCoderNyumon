import java.util.Scanner;

public class A_YourFirstJudge  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        scanner.close();
        
        if(S.equals("Hello,World!")) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}
