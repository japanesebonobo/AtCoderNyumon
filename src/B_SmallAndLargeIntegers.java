import java.util.*;

public class B_SmallAndLargeIntegers  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> duplicateList = new ArrayList<Integer>();
    
        for (int i = 0; i < K; i++) {
            if(A+i <= B) {
                duplicateList.add(A+i);
            }
            
            if (B-i >= A) {
                duplicateList.add(B-i);
            }
        }

        Collections.sort(duplicateList);

        LinkedHashSet<Integer> ansList = new LinkedHashSet<>(duplicateList);
        
        for (int ans : ansList) {
            System.out.println(ans);
          }
    }
}