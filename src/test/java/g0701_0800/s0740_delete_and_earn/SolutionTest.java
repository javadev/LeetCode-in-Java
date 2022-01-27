package g0701_0800.s0740_delete_and_earn;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deleteAndEarn() {
        assertThat(new Solution().deleteAndEarn(new int[] {3, 4, 3}), equalTo(6));
    }

    @Test
    void deleteAndEarn2() {
        assertThat(new Solution().deleteAndEarn(new int[] {2, 2, 3, 3, 3, 4}), equalTo(9));
    }
}
