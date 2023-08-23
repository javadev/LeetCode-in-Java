package g2501_2600.s2591_distribute_money_to_maximum_children;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distMoney() {
        assertThat(new Solution().distMoney(20, 3), equalTo(1));
    }

    @Test
    void distMoney2() {
        assertThat(new Solution().distMoney(16, 2), equalTo(2));
    }

    @Test
    void distMoney3() {
        assertThat(new Solution().distMoney(1, 2), equalTo(-1));
    }

    @Test
    void distMoney4() {
        assertThat(new Solution().distMoney(2, 1), equalTo(0));
    }
}
