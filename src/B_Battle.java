import java.util.Scanner;

public class B_Battle  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();
        String ans = "Yes";
        int counter = 0;

       while(A > 0 && C > 0) {
           if(counter%2 == 0) {
               C -= B;
           } else {
               A -= D;
           }
           counter++;
       }

       if(C > 0) {
           ans = "No";
       }

        System.out.println(ans);
    }
}
