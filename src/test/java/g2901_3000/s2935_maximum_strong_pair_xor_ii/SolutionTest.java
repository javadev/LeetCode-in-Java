package g2901_3000.s2935_maximum_strong_pair_xor_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumStrongPairXor() {
        assertThat(new Solution().maximumStrongPairXor(new int[] {1, 2, 3, 4, 5}), equalTo(7));
    }

    @Test
    void maximumStrongPairXor2() {
        assertThat(new Solution().maximumStrongPairXor(new int[] {10, 100}), equalTo(0));
    }

    @Test
    void maximumStrongPairXor3() {
        assertThat(
                new Solution().maximumStrongPairXor(new int[] {500, 520, 2500, 3000}),
                equalTo(1020));
    }
}
