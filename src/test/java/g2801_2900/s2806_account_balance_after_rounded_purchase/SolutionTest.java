package g2801_2900.s2806_account_balance_after_rounded_purchase;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void accountBalanceAfterPurchase() {
        assertThat(new Solution().accountBalanceAfterPurchase(9), equalTo(90));
    }

    @Test
    void accountBalanceAfterPurchase2() {
        assertThat(new Solution().accountBalanceAfterPurchase(15), equalTo(80));
    }
}
