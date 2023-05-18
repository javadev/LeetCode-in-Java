package g1601_1700.s1671_minimum_number_of_removals_to_make_mountain_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumMountainRemovals() {
        assertThat(new Solution().minimumMountainRemovals(new int[] {1, 3, 1}), equalTo(0));
    }

    @Test
    void minimumMountainRemovals2() {
        assertThat(
                new Solution().minimumMountainRemovals(new int[] {2, 1, 1, 5, 6, 2, 3, 1}),
                equalTo(3));
    }
}
