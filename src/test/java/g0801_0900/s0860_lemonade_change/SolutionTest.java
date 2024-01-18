package g0801_0900.s0860_lemonade_change;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lemonadeChange() {
        assertThat(new Solution().lemonadeChange(new int[] {5, 5, 5, 10, 20}), equalTo(true));
    }

    @Test
    void lemonadeChange2() {
        assertThat(new Solution().lemonadeChange(new int[] {5, 5, 10, 10, 20}), equalTo(false));
    }
}
