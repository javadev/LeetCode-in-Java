package g0901_1000.s0941_valid_mountain_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validMountainArray() {
        assertThat(new Solution().validMountainArray(new int[] {2, 1}), equalTo(false));
    }

    @Test
    void validMountainArray2() {
        assertThat(new Solution().validMountainArray(new int[] {3, 5, 5}), equalTo(false));
    }

    @Test
    void validMountainArray3() {
        assertThat(new Solution().validMountainArray(new int[] {0, 3, 2, 1}), equalTo(true));
    }
}
