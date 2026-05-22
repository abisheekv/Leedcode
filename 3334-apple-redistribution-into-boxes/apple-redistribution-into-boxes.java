import java.util.Arrays;

public class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;
        for (int count : apple) {
            totalApples += count;
        }
        
        Arrays.sort(capacity);
        
        int boxesUsed = 0;
        int currentCapacity = 0;
        
        for (int i = capacity.length - 1; i >= 0; i--) {
            currentCapacity += capacity[i];
            boxesUsed++;
            
            if (currentCapacity >= totalApples) {
                break;
            }
        }
        
        return boxesUsed;
    }
}