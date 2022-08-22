import java.util.Scanner;

public class B_200th  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        int K = scanner.nextInt();
        scanner.close();

       for (int i = 0; i < K; i++) {
        if(N%200 == 0) {
            N /= 200;
        } else {
            N = N*1000 + 200;
        }
       }

        System.out.println(N);
    }
}
