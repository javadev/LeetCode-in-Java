package g2101_2200.s2163_minimum_difference_in_sums_after_removal_of_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDifference() {
        assertThat(new Solution().minimumDifference(new int[] {3, 1, 2}), equalTo(-1L));
    }

    @Test
    void minimumDifference2() {
        assertThat(new Solution().minimumDifference(new int[] {7, 9, 5, 8, 1, 3}), equalTo(1L));
    }
}
