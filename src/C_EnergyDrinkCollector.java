import java.util.*;

public class C_EnergyDrinkCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        TreeMap<Long, Long> pair = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            long key = scanner.nextLong();
            long value = scanner.nextLong();
            if (pair.containsKey(key)) {
                pair.replace(key, pair.get(key)+value);
            } else {
                pair.put(key, value);
            }
        }
        scanner.close();
        
        long ans = 0L;
        for(Map.Entry<Long, Long> entry : pair.entrySet()) {
            if(M > entry.getValue()) {
                ans += entry.getValue()*entry.getKey();
                M -= entry.getValue();
            } else {
                ans += M*entry.getKey();
                break;
            }
        }

        System.out.println(ans);
    }
}
