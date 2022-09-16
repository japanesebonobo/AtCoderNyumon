import java.util.*;

public class B_DoYouKnowTheSecondHighestMountain  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        String name[] = new String[N];
        int height[] = new int[N];
        int index = 0;

        for (int i = 0; i < N; i++) {
            name[i] = scanner.next();
            height[i] = scanner.nextInt();
        }
        scanner.close();
        
        int[] sortedheight = Arrays.copyOf(height, N);

        Arrays.sort(sortedheight);

        int secondHeight = sortedheight[N-2];

        for (int i = 0; i < N; i++) {
            if(height[i] == secondHeight) {
                index = i;
            }
        }

        System.out.println(name[index]);
    }
}