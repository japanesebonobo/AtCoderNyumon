import java.util.Scanner;

public class B_1Percent  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long X = scanner.nextLong();
        scanner.close();
        int i = 0;
        long currentSum = 100L;

       while(currentSum < X) {
        long money = (long)(currentSum / 100);
        currentSum += money;
        i++;
       }

        System.out.println(i);
    }
}
