package g1801_1900.s1887_reduction_operations_to_make_the_array_elements_equal;

// #Medium #Array #Sorting #2022_05_10_Time_26_ms_(94.56%)_Space_117_MB_(20.41%)

public class Solution {
    public int reductionOperations(int[] nums) {
        int[] arr = new int[100001];
        for (int i : nums) {
            arr[i]++;
        }
        int val = 0;
        int curr = 0;
        for (int i = 100000; i >= 0; i--) {
            if (arr[i] != 0) {
                val += curr;
                curr += arr[i];
            }
        }
        return val;
    }
}
