package g2501_2600.s2554_maximum_number_of_integers_to_choose_from_a_range_i;

// #Medium #Array #Hash_Table #Sorting #Greedy #Binary_Search
// #2023_08_19_Time_4_ms_(100.00%)_Space_44.9_MB_(17.88%)

public class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] arr = new boolean[10002];
        for (int j : banned) {
            arr[j] = true;
        }
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!arr[i]) {
                sum += i;
                if (sum > maxSum) {
                    return count;
                }
                count++;
            }
        }
        return count;
    }
}
