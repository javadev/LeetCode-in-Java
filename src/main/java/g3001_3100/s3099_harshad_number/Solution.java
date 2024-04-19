package g3001_3100.s3099_harshad_number;

// #Easy #Math #2024_04_19_Time_0_ms_(100.00%)_Space_40.9_MB_(7.00%)

public class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int digit;
        int temp = x;
        while (temp != 0) {
            digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        if (sum != 0 && x % sum == 0) {
            return sum;
        }
        return -1;
    }
}
