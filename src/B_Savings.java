import java.util.Scanner;

public class B_Savings  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.close();
        int i = 1;
        long sum = 0;

       while((sum+(i+1)) < N) {
        sum += i;
        i++;
       }

        System.out.println(i);
    }
}
