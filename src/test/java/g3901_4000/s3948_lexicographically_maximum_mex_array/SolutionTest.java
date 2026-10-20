package g3901_4000.s3948_lexicographically_maximum_mex_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumMEX() {
        assertThat(new Solution().maximumMEX(new int[] {0, 1, 0}), equalTo(new int[] {2, 1}));
    }

    @Test
    void maximumMEX2() {
        assertThat(new Solution().maximumMEX(new int[] {1, 0, 2}), equalTo(new int[] {3}));
    }

    @Test
    void maximumMEX3() {
        assertThat(new Solution().maximumMEX(new int[] {3, 1}), equalTo(new int[] {0, 0}));
    }
}
