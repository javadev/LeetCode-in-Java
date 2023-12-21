package g1501_1600.s1526_minimum_number_of_increments_on_subarrays_to_form_a_target_array;

// #Hard #Array #Dynamic_Programming #Greedy #Stack #Monotonic_Stack
// #2022_04_09_Time_4_ms_(70.36%)_Space_72.7_MB_(76.68%)

public class Solution {
    public int minNumberOperations(int[] target) {
        int operations = target[0];
        for (int i = 1; i < target.length; i++) {
            if (target[i] > target[i - 1]) {
                operations += target[i] - target[i - 1];
            }
        }
        return operations;
    }
}
