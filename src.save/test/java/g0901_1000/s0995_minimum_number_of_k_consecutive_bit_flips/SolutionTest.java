package g0901_1000.s0995_minimum_number_of_k_consecutive_bit_flips;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minKBitFlips() {
        assertThat(new Solution().minKBitFlips(new int[] {0, 1, 0}, 1), equalTo(2));
    }

    @Test
    void minKBitFlips2() {
        assertThat(new Solution().minKBitFlips(new int[] {1, 1, 0}, 2), equalTo(-1));
    }

    @Test
    void minKBitFlips3() {
        assertThat(new Solution().minKBitFlips(new int[] {0, 0, 0, 1, 0, 1, 1, 0}, 3), equalTo(3));
    }
}
