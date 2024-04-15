package g1601_1700.s1601_maximum_number_of_achievable_transfer_requests;

// #Hard #Array #Bit_Manipulation #Backtracking #Enumeration
// #2022_04_11_Time_26_ms_(84.02%)_Space_42.3_MB_(62.89%)

public class Solution {
    private int max = 0;

    public int maximumRequests(int n, int[][] requests) {
        helper(requests, 0, new int[n], 0);
        return max;
    }

    private void helper(int[][] requests, int index, int[] count, int num) {
        if (index == requests.length) {
            for (int i : count) {
                if (0 != i) {
                    return;
                }
            }
            max = Math.max(max, num);
            return;
        }
        count[requests[index][0]]++;
        count[requests[index][1]]--;
        helper(requests, index + 1, count, num + 1);
        count[requests[index][0]]--;
        count[requests[index][1]]++;
        helper(requests, index + 1, count, num);
    }
}
