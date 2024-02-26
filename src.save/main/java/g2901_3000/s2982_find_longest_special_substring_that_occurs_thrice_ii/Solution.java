package g2901_3000.s2982_find_longest_special_substring_that_occurs_thrice_ii;

// #Medium #String #Hash_Table #Binary_Search #Counting #Sliding_Window
// #2024_01_18_Time_18_ms_(99.35%)_Space_48.9_MB_(42.38%)

public class Solution {
    public int maximumLength(String s) {
        int[][] arr = new int[26][4];
        char prev = s.charAt(0);
        int count = 1;
        int max = 0;
        for (int index = 1; index < s.length(); index++) {
            if (s.charAt(index) != prev) {
                int[] ints = arr[prev - 'a'];
                updateArr(count, ints);
                prev = s.charAt(index);
                count = 1;
            } else {
                count++;
            }
        }
        updateArr(count, arr[prev - 'a']);
        for (int[] values : arr) {
            if (values[0] != 0) {
                if (values[1] >= 3) {
                    max = Math.max(max, values[0]);
                } else if (values[1] == 2 || values[2] == values[0] - 1) {
                    max = Math.max(max, values[0] - 1);
                } else {
                    max = Math.max(max, values[0] - 2);
                }
            }
        }
        return max == 0 ? -1 : max;
    }

    private void updateArr(int count, int[] ints) {
        if (ints[0] == count) {
            ints[1]++;
        } else if (ints[0] < count) {
            ints[3] = ints[1];
            ints[2] = ints[0];
            ints[0] = count;
            ints[1] = 1;
        } else if (ints[2] < count) {
            ints[2] = count;
            ints[3] = 1;
        }
    }
}
