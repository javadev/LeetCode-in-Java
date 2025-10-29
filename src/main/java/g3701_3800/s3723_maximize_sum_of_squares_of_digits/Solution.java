package g3701_3800.s3723_maximize_sum_of_squares_of_digits;

// #Medium #Math #Greedy #Biweekly_Contest_168
// #2025_10_29_Time_14_ms_(98.69%)_Space_46.36_MB_(47.20%)

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
