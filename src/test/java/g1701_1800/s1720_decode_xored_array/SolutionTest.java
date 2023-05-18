package g1701_1800.s1720_decode_xored_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void decode() {
        assertThat(new Solution().decode(new int[] {1, 2, 3}, 1), equalTo(new int[] {1, 0, 2, 1}));
    }

    @Test
    void decode2() {
        assertThat(
                new Solution().decode(new int[] {6, 2, 7, 3}, 4),
                equalTo(new int[] {4, 2, 0, 7, 4}));
    }
}
