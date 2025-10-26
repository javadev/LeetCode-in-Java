package g3701_3800.s3723_maximize_sum_of_squares_of_digits;

// #Medium #Biweekly_Contest_168 #2025_10_26_Time_8_ms_(99.81%)_Space_45.78_MB_(_%)

public class Solution {
    public String maxSumOfSquares(int places, int sum) {
        String ans = "";
        int nines = sum / 9;
        if (places < nines) {
            return ans;
        } else if (places == nines) {
            int remSum = sum - nines * 9;
            if (remSum > 0) {
                return ans;
            }
            ans = "9".repeat(nines);
        } else {
            int remSum = sum - nines * 9;
            ans = "9".repeat(nines) + remSum;
            int extra = places - ans.length();
            if (extra > 0) {
                ans = ans + ("0".repeat(extra));
            }
        }
        return ans;
    }
}
