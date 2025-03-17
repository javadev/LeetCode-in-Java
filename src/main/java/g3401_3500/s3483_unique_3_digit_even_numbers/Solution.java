package g3401_3500.s3483_unique_3_digit_even_numbers;

// #Easy #Array #Hash_Table #Recursion #Enumeration
// #2025_03_17_Time_5_ms_(100.00%)_Space_44.59_MB_(100.00%)

import java.util.HashSet;

public class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (digits[k] % 2 == 0) {
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        set.add(number);
                    }
                }
            }
        }
        return set.size();
    }
}
