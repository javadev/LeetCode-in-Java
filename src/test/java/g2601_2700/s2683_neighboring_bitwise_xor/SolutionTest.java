package g2601_2700.s2683_neighboring_bitwise_xor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void doesValidArrayExist() {
        assertThat(new Solution().doesValidArrayExist(new int[] {1, 1, 0}), equalTo(true));
    }

    @Test
    void doesValidArrayExist2() {
        assertThat(new Solution().doesValidArrayExist(new int[] {1, 1}), equalTo(true));
    }

    @Test
    void doesValidArrayExist3() {
        assertThat(new Solution().doesValidArrayExist(new int[] {1, 0}), equalTo(false));
    }
}
