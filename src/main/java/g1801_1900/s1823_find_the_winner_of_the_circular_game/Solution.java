package g1801_1900.s1823_find_the_winner_of_the_circular_game;

// #Medium #Array #Math #Simulation #Recursion #Queue #Data_Structure_II_Day_14_Stack_Queue
// #2022_05_06_Time_3_ms_(64.85%)_Space_41.9_MB_(31.61%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        int startIndex = 0;
        while (list.size() != 1) {
            int removeIndex = (startIndex + k - 1) % list.size();
            list.remove(removeIndex);
            startIndex = removeIndex;
        }
        return list.get(0);
    }
}
