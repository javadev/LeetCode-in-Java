package g2001_2100.s2081_sum_of_k_mirror_numbers;

// #Hard #Math #Enumeration #2022_05_29_Time_759_ms_(81.69%)_Space_116.6_MB_(61.97%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public long kMirror(int k, int n) {
        List<Long> result = new ArrayList<>();
        int len = 1;
        while (result.size() < n) {
            backtrack(result, new char[len++], k, n, 0);
        }
        long sum = 0;
        for (Long num : result) {
            sum += num;
        }
        return sum;
    }

    private void backtrack(List<Long> result, char[] arr, int k, int n, int index) {
        if (result.size() == n) {
            return;
        }
        if (index >= (arr.length + 1) / 2) {
            // Number in base-10
            Long number = Long.parseLong(String.valueOf(arr), k);

            if (isPalindrome(number)) {
                result.add(number);
            }
            return;
        }
        // Generate base-k palindrome number in arr.length without leading zeros
        for (char i = 0; i < k; i++) {
            if (index == 0 && i == 0) {
                // Leading zeros
                continue;
            }
            char c = (char) (i + '0');
            arr[index] = c;
            arr[arr.length - 1 - index] = c;
            backtrack(result, arr, k, n, index + 1);
        }
    }

    private boolean isPalindrome(Long number) {
        String strNum = String.valueOf(number);
        int left = 0;
        int right = strNum.length() - 1;
        while (left < right) {
            if (strNum.charAt(left) == strNum.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
