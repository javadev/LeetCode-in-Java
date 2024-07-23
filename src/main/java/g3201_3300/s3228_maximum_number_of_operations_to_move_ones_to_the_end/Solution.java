package g3201_3300.s3228_maximum_number_of_operations_to_move_ones_to_the_end;

// #Medium #String #Greedy #Counting #2024_07_23_Time_5_ms_(100.00%)_Space_45.2_MB_(89.96%)

public class Solution {
    public int maxOperations(String s) {
        char[] arr = s.toCharArray();
        int result = 0;
        int ones = 0;
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            ones += arr[i] - '0';
            if (i > 0 && arr[i] < arr[i - 1]) {
                result += ones;
            }
        }
        return result;
    }
}
