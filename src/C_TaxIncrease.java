import java.math.BigDecimal;
import java.util.*;

public class C_TaxIncrease  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double A = scanner.nextInt();
        double B = scanner.nextInt();
        scanner.close();
        Boolean flag = false;
        double tax = 0.0;
        double taxRate1 = 0.08;
        double taxRate2 = 0.10;
        int count = 1;
    
        while(!flag&&count <= 100)  {
            tax = Math.floor(count*taxRate1);
            if(tax == A) {
                tax =  Math.floor(count*taxRate2);
                if(tax == B) {
                    flag = true;
                    break;
                }
            }
            count++;
        }   

        if(flag == false) {
            System.out.println(-1);
        } else{
            System.out.println(count);
        }
    }
}