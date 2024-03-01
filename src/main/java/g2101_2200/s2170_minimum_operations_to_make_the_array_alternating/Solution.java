package g2101_2200.s2170_minimum_operations_to_make_the_array_alternating;

// #Medium #Array #Hash_Table #Greedy #Counting
// #2022_06_09_Time_8_ms_(100.00%)_Space_58.3_MB_(82.64%)

public class Solution {
    public int minimumOperations(int[] nums) {
        int maxOdd = 0;
        int maxEven = 0;
        int max = 0;
        int n = nums.length;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] even = new int[max + 1];
        int[] odd = new int[max + 1];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[nums[i]]++;
            } else {
                odd[nums[i]]++;
            }
        }
        int t1 = 0;
        int t2 = 0;
        for (int i = 0; i < max + 1; i++) {
            if (even[i] > maxEven) {
                maxEven = even[i];
                t1 = i;
            }
            if (odd[i] > maxOdd) {
                maxOdd = odd[i];
                t2 = i;
            }
        }
        int ans;
        if (t1 == t2) {
            int secondEven = 0;
            int secondOdd = 0;
            for (int i = 0; i < max + 1; i++) {
                if (i != t1 && even[i] > secondEven) {
                    secondEven = even[i];
                }
                if (i != t2 && odd[i] > secondOdd) {
                    secondOdd = odd[i];
                }
            }
            ans =
                    Math.min(
                            (n / 2 + n % 2 - maxEven) + (n / 2 - secondOdd),
                            (n / 2 + n % 2 - secondEven) + (n / 2 - maxOdd));
        } else {
            ans = n / 2 + n % 2 - maxEven + n / 2 - maxOdd;
        }
        return ans;
    }
}
