package g1501_1600.s1562_find_latest_group_of_size_m;

// #Medium #Array #Binary_Search #Simulation #Binary_Search_II_Day_19
// #2022_04_11_Time_8_ms_(90.00%)_Space_84.2_MB_(53.00%)

public class Solution {
    public int findLatestStep(int[] arr, int m) {
        int[] lengthAtIndex = new int[arr.length + 2];
        int[] countOfLength = new int[arr.length + 1];
        int res = -1;
        int step = 1;
        for (int i : arr) {
            int leftLength = lengthAtIndex[i - 1];
            int rightLength = lengthAtIndex[i + 1];
            int newLength = leftLength + rightLength + 1;
            lengthAtIndex[i] = newLength;
            lengthAtIndex[i - leftLength] = newLength;
            lengthAtIndex[i + rightLength] = newLength;
            countOfLength[newLength] += 1;
            countOfLength[leftLength] -= 1;
            countOfLength[rightLength] -= 1;
            if (countOfLength[m] > 0) {
                res = step;
            }
            step++;
        }

        return res;
    }
}
