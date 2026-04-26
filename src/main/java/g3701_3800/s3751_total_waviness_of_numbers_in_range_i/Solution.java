package g3701_3800.s3751_total_waviness_of_numbers_in_range_i;

// #Medium #Dynamic_Programming #Math #Enumeration #Senior #Biweekly_Contest_170
// #2026_04_26_Time_11_ms_(98.18%)_Space_42.55_MB_(97.88%)

public class Solution {
    private int countpeakValley(int num) {
        int lastdigit = num % 10;
        int waiviness = 0;
        int prevcurrent = -1;
        num = num / 10;
        while (num > 0) {
            if (prevcurrent == -1) {
                prevcurrent = num % 10;
                num = num / 10;
                continue;
            }
            int currvalue = num % 10;
            if ((prevcurrent > currvalue && prevcurrent > lastdigit)
                    || (prevcurrent < currvalue && prevcurrent < lastdigit)) {
                waiviness++;
            }
            lastdigit = prevcurrent;
            prevcurrent = num % 10;
            num = num / 10;
        }
        return waiviness;
    }

    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int i = num1; i <= num2; i++) {
            int l = countpeakValley(i);
            ans = ans + l;
        }
        return ans;
    }
}
