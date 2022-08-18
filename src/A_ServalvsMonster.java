import java.util.Scanner;

public class A_ServalvsMonster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int ans = H/A;

        if(H % A == 0) {
            System.out.println(ans);
        } else {
            System.out.println(ans+1);
        }
    }
}
