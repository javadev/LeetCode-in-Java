package g2801_2900.s2806_account_balance_after_rounded_purchase;

// #Easy #Math #2023_09_25_Time_0_ms_(100.00%)_Space_39.2_MB_(64.97%)

public class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int x = (int) ((purchaseAmount + 5) / (double) 10) * 10;
        return 100 - x;
    }
}
