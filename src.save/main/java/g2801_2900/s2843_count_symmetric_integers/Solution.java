package g2801_2900.s2843_count_symmetric_integers;

// #Easy #Math #Enumeration #2023_12_13_Time_26_ms_(80.87%)_Space_43.9_MB_(8.49%)

public class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSymmetric(int num) {
        String str = String.valueOf(num);
        int n = str.length();
        if (n % 2 != 0) {
            return false;
        }
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            leftSum += str.charAt(i) - '0';
            rightSum += str.charAt(j) - '0';
        }
        return leftSum == rightSum;
    }
}
