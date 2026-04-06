import java.util.*;

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0, j = 0;

        for (String cmd : commands) {
            if (cmd.equals("UP")) {
                i--;
            } else if (cmd.equals("DOWN")) {
                i++;
            } else if (cmd.equals("LEFT")) {
                j--;
            } else if (cmd.equals("RIGHT")) {
                j++;
            }
        }

        return i * n + j;
    }
}