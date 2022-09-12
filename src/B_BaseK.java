import java.util.*;

public class B_BaseK  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int K = scanner.nextInt();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        scanner.close(); 
        long ans = 0L;

        long a = converter(A,K);
        long b = converter(B,K);

        ans = a*b;
        
        System.out.println(ans);
    }

    public static long converter(long number, int base) {
        int count = 0;
        long result = 0L;

        while (number > 0) {
            result+=(Long)Math.round(Math.pow(base,count))*(number%10);
            number/=10;
            count++;
        }
        return result;
    }
}