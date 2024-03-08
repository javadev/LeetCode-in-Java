package g2901_3000.s2980_check_if_bitwise_or_has_trailing_zeros;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasTrailingZeros() {
        assertThat(new Solution().hasTrailingZeros(new int[] {1, 2, 3, 4, 5}), equalTo(true));
    }

    @Test
    void hasTrailingZeros2() {
        assertThat(new Solution().hasTrailingZeros(new int[] {2, 4, 8, 16}), equalTo(true));
    }

    @Test
    void hasTrailingZeros3() {
        assertThat(new Solution().hasTrailingZeros(new int[] {1, 3, 5, 7, 9}), equalTo(false));
    }
}
