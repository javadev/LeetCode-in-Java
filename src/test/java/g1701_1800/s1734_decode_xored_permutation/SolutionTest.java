package g1701_1800.s1734_decode_xored_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void decode() {
        assertThat(new Solution().decode(new int[] {3, 1}), equalTo(new int[] {1, 2, 3}));
    }

    @Test
    void decode2() {
        assertThat(
                new Solution().decode(new int[] {6, 5, 4, 6}), equalTo(new int[] {2, 4, 1, 5, 3}));
    }
}
