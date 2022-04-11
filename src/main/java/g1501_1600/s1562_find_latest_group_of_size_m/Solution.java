package g1501_1600.s1562_find_latest_group_of_size_m;

// #Medium #Array #Binary_Search #Simulation #2022_04_11_Time_8_ms_(90.00%)_Space_84.2_MB_(53.00%)

public class Solution {
    public int findLatestStep(int[] arr, int m) {

        int[] length_at_index = new int[arr.length + 2];

        int[] count_of_length = new int[arr.length + 1];

        int res = -1;

        int step = 1;

        for (int i : arr) {

            int left_length = length_at_index[i - 1];

            int right_length = length_at_index[i + 1];

            int new_length = left_length + right_length + 1;

            length_at_index[i] = new_length;

            length_at_index[i - left_length] = new_length;

            length_at_index[i + right_length] = new_length;

            count_of_length[new_length] += 1;

            count_of_length[left_length] -= 1;

            count_of_length[right_length] -= 1;

            if (count_of_length[m] > 0) {
                res = step;
            }

            step++;
        }

        return res;
    }
}
