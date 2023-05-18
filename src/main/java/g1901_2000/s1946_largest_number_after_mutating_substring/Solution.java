package g1901_2000.s1946_largest_number_after_mutating_substring;

// #Medium #Array #String #Greedy #2022_05_18_Time_18_ms_(70.91%)_Space_72.8_MB_(9.09%)

public class Solution {
    public String maximumNumber(String num, int[] change) {
        int n = num.length();
        char[] nums = num.toCharArray();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            int val = nums[i] - '0';
            arr[i] = (char) (change[val] + '0');
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] < arr[i]) {
                nums[i] = arr[i];
                flag = true;
            } else if (flag && nums[i] > arr[i]) {
                break;
            }
        }
        return String.valueOf(nums);
    }
}
