package g1701_1800.s1752_check_if_array_is_sorted_and_rotated;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void check() {
        assertThat(new Solution().check(new int[] {3, 4, 5, 1, 2}), equalTo(true));
    }

    @Test
    void check2() {
        assertThat(new Solution().check(new int[] {2, 1, 3, 4}), equalTo(false));
    }

    @Test
    void check3() {
        assertThat(new Solution().check(new int[] {1, 2, 3}), equalTo(true));
    }
}
