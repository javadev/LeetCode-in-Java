package g2401_2500.s2412_minimum_money_required_before_transactions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumMoney() {
        assertThat(new Solution().minimumMoney(new int[][] {{2, 1}, {5, 0}, {4, 2}}), equalTo(10L));
    }

    @Test
    void minimumMoney2() {
        assertThat(new Solution().minimumMoney(new int[][] {{3, 0}, {0, 3}}), equalTo(3L));
    }
}
