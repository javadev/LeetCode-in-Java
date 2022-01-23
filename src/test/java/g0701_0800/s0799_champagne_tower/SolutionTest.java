package g0701_0800.s0799_champagne_tower;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void champagneTower() {
        assertThat(new Solution().champagneTower(8, 3, 0), equalTo(0.125));
    }

    @Test
    void champagneTower2() {
        assertThat(new Solution().champagneTower(8, 3, 1), equalTo(0.875));
    }

    @Test
    void champagneTower3() {
        assertThat(new Solution().champagneTower(8, 3, 2), equalTo(0.875));
    }

    @Test
    void champagneTower4() {
        assertThat(new Solution().champagneTower(1000000000, 99, 99), equalTo(0.0));
    }
}
