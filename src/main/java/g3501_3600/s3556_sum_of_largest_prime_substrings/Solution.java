package g3501_3600.s3556_sum_of_largest_prime_substrings;

// #Medium #String #Hash_Table #Math #Sorting #Number_Theory
// #2025_05_27_Time_7_ms_(99.93%)_Space_42.77_MB_(98.34%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public long sumOfLargestPrimes(String s) {
        Set<Long> set = new HashSet<>();
        int n = s.length();
        long first = -1;
        long second = -1;
        long third = -1;
        for (int i = 0; i < n; i++) {
            long num = 0;
            for (int j = i; j < n; j++) {
                num = num * 10 + (s.charAt(j) - '0');
                if (i != j && s.charAt(i) == '0') {
                    break;
                }
                if (isPrime(num) && !set.contains(num)) {
                    set.add(num);
                    if (num > first) {
                        third = second;
                        second = first;
                        first = num;
                    } else if (num > second) {
                        third = second;
                        second = num;
                    } else if (num > third) {
                        third = num;
                    }
                }
            }
        }
        long sum = 0;
        if (first != -1) {
            sum += first;
        }
        if (second != -1) {
            sum += second;
        }
        if (third != -1) {
            sum += third;
        }
        return sum;
    }

    public boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
