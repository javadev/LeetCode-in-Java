package g1301_1400.s1390_four_divisors;

// #Medium #Array #Math #2022_03_17_Time_13_ms_(97.25%)_Space_42.3_MB_(95.60%)

public class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num) {
                continue;
            }
            int tmpSum = num + 1;
            int count = 0;
            for (int i = 2; i <= sqrt; i++) {
                if (num % i == 0) {
                    count++;
                    tmpSum += (i + num / i);
                }
                if (count > 1) {
                    break;
                }
            }
            if (count == 1) {
                sum += tmpSum;
            }
        }
        return sum;
    }
}
