package g1701_1800.s1716_calculate_money_in_leetcode_bank;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalMoney() {
        assertThat(new Solution().totalMoney(4), equalTo(10));
    }

    @Test
    void totalMoney2() {
        assertThat(new Solution().totalMoney(10), equalTo(37));
    }

    @Test
    void totalMoney3() {
        assertThat(new Solution().totalMoney(20), equalTo(96));
    }
}
