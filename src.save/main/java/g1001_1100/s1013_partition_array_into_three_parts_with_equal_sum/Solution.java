package g1001_1100.s1013_partition_array_into_three_parts_with_equal_sum;

// #Easy #Array #Greedy #2022_02_25_Time_3_ms_(53.27%)_Space_60.1_MB_(28.68%)

public class Solution {
    public boolean canThreePartsEqualSum(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int equalSum = sum / 3;
        int left = 0;
        int leftSum = 0;
        while (left < a.length - 2 && leftSum != equalSum) {
            leftSum += a[left++];
        }
        if (left > a.length - 2 || leftSum != equalSum) {
            return false;
        }

        int right = a.length - 1;
        int rightSum = 0;
        while (right > left && rightSum != equalSum) {
            rightSum += a[right--];
        }
        if (right < left || rightSum != equalSum) {
            return false;
        }
        int middleSum = 0;
        for (int i = left; i <= right; i++) {
            middleSum += a[i];
        }
        return middleSum == equalSum;
    }
}
