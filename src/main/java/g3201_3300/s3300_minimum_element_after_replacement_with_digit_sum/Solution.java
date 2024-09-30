package g3201_3300.s3300_minimum_element_after_replacement_with_digit_sum;

// #Easy #2024_09_30_Time_4_ms_(100.00%)_Space_43.3_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = sumOfDigits(nums[i]);
            arr[i] = sum;
        }
        Arrays.sort(arr);
        return arr[0];
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        if (num <= 9) {
            return num;
        }
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
