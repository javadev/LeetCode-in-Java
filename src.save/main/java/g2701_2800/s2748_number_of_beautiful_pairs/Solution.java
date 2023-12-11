package g2701_2800.s2748_number_of_beautiful_pairs;

// #Easy #Array #Math #Number_Theory #2023_09_24_Time_11_ms_(91.00%)_Space_43.3_MB_(63.82%)

public class Solution {
    public int countBeautifulPairs(int[] nums) {
        int beautifulPairs = 0;
        int i = 0;
        int j = 1;
        while (i < nums.length - 1) {
            int firstDigit = getFirstDigit(nums[i]);
            while (j < nums.length) {
                int lastDigit = nums[j] % 10;
                boolean botDigitsAreEqualAndNot1 = firstDigit == lastDigit && firstDigit > 1;
                boolean botDigitsAreDivisibleBy2 = firstDigit % 2 == 0 && lastDigit % 2 == 0;
                boolean botDigitsAreDivisibleBy3 = firstDigit % 3 == 0 && lastDigit % 3 == 0;

                if (!botDigitsAreEqualAndNot1
                        && !botDigitsAreDivisibleBy2
                        && !botDigitsAreDivisibleBy3) {
                    beautifulPairs++;
                }
                j++;
            }
            i++;
            j = i + 1;
        }
        return beautifulPairs;
    }

    private int getFirstDigit(int num) {
        int n = num;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            n /= 10;
        }
        return digit;
    }
}
