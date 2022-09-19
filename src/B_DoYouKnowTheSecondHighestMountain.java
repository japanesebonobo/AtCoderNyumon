import java.util.*;

public class B_DoYouKnowTheSecondHighestMountain  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        NavigableMap<Integer, String> mountainMap = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String name = scanner.next();
            int height = scanner.nextInt();
            mountainMap.put(height, name);
        }
        scanner.close();
        
        mountainMap.pollLastEntry();

        System.out.println(mountainMap.pollLastEntry().getValue());
    }
}