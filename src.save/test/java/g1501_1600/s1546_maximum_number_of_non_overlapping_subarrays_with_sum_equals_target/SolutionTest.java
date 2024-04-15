package g1501_1600.s1546_maximum_number_of_non_overlapping_subarrays_with_sum_equals_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxNonOverlapping() {
        assertThat(new Solution().maxNonOverlapping(new int[] {1, 1, 1, 1, 1}, 2), equalTo(2));
    }

    @Test
    void maxNonOverlapping2() {
        assertThat(
                new Solution().maxNonOverlapping(new int[] {-1, 3, 5, 1, 4, 2, -9}, 6), equalTo(2));
    }
}
