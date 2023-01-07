package g1801_1900.s1893_check_if_all_the_integers_in_a_range_are_covered;

// #Easy #Array #Hash_Table #Prefix_Sum #2022_05_09_Time_1_ms_(72.81%)_Space_42.4_MB_(39.06%)

public class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] temp = new int[52];
        for (int[] range : ranges) {
            int start = range[0];
            int end = range[ranges[0].length - 1];
            temp[start] += 1;
            temp[end + 1] += -1;
        }
        for (int i = 1; i < temp.length; i++) {
            temp[i] += temp[i - 1];
        }
        for (int i = left; i <= right; i++) {
            if (temp[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
