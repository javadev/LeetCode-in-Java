package g1701_1800.s1787_make_the_xor_of_all_segments_equal_to_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minChanges() {
        assertThat(new Solution().minChanges(new int[] {1, 2, 0, 3, 0}, 1), equalTo(3));
    }

    @Test
    void minChanges2() {
        assertThat(new Solution().minChanges(new int[] {3, 4, 5, 2, 1, 7, 3, 4, 7}, 3), equalTo(3));
    }

    @Test
    void minChanges3() {
        assertThat(new Solution().minChanges(new int[] {1, 2, 4, 1, 2, 5, 1, 2, 6}, 3), equalTo(3));
    }
}
