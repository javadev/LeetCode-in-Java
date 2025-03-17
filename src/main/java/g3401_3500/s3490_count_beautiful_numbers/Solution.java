package g3401_3500.s3490_count_beautiful_numbers;

// #Hard #Dynamic_Programming #2025_03_17_Time_523_ms_(100.00%)_Space_55.41_MB_(100.00%)

import java.util.HashMap;

public class Solution {
    public int beautifulNumbers(int l, int r) {
        return countBeautiful(r) - countBeautiful(l - 1);
    }

    private int countBeautiful(int x) {
        char[] digits = getCharArray(x);
        HashMap<String, Integer> dp = new HashMap<>();
        return solve(0, 1, 0, 1, digits, dp);
    }

    private char[] getCharArray(int x) {
        String str = String.valueOf(x);
        return str.toCharArray();
    }

    private int solve(
            int i, int tight, int sum, int prod, char[] digits, HashMap<String, Integer> dp) {
        if (i == digits.length) {
            if (sum > 0 && prod % sum == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        String str = i + " - " + tight + " - " + sum + " - " + prod;
        if (dp.containsKey(str)) {
            return dp.get(str);
        }
        int limit;
        if (tight == 1) {
            limit = digits[i] - '0';
        } else {
            limit = 9;
        }
        int count = 0;
        int j = 0;
        while (j <= limit) {
            int newTight = 0;
            if (tight == 1 && j == limit) {
                newTight = 1;
            }
            int newSum = sum + j;
            int newProd;
            if (j == 0 && sum == 0) {
                newProd = 1;
            } else {
                newProd = prod * j;
            }
            count += solve(i + 1, newTight, newSum, newProd, digits, dp);
            j++;
        }
        dp.put(str, count);
        return count;
    }
}
