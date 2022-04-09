package g1501_1600.s1509_minimum_difference_between_largest_and_smallest_value_in_three_moves;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDifference() {
        assertThat(new Solution().minDifference(new int[] {5, 3, 2, 4}), equalTo(0));
    }

    @Test
    void minDifference2() {
        assertThat(new Solution().minDifference(new int[] {1, 5, 0, 10, 14}), equalTo(1));
    }
}
