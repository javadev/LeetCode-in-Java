package g0401_0500.s0483_smallest_good_base;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestGoodBase() {
        assertThat(new Solution().smallestGoodBase("13"), equalTo("3"));
    }

    @Test
    void smallestGoodBase2() {
        assertThat(new Solution().smallestGoodBase("4681"), equalTo("8"));
    }

    @Test
    void smallestGoodBase3() {
        assertThat(
                new Solution().smallestGoodBase("1000000000000000000"),
                equalTo("999999999999999999"));
    }
}
