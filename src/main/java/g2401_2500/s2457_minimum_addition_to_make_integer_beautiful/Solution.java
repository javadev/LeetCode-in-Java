package g2401_2500.s2457_minimum_addition_to_make_integer_beautiful;

// #Medium #Math #Greedy #2022_12_16_Time_0_ms_(100.00%)_Space_39.2_MB_(86.59%)

public class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        if (sumOfDigits(n) <= target) {
            return 0;
        }
        long old = n;
        long newNumber = 1;
        while (sumOfDigits(n) > target) {
            newNumber = newNumber * 10;
            n = n / 10 + 1;
        }
        newNumber = (n) * newNumber;
        return newNumber - old;
    }

    public long sumOfDigits(long n) {
        long sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}
