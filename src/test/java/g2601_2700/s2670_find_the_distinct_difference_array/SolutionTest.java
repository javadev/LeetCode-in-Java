package g2601_2700.s2670_find_the_distinct_difference_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinctDifferenceArray() {
        assertThat(
                new Solution().distinctDifferenceArray(new int[] {1, 2, 3, 4, 5}),
                equalTo(new int[] {-3, -1, 1, 3, 5}));
    }

    @Test
    void distinctDifferenceArray2() {
        assertThat(
                new Solution().distinctDifferenceArray(new int[] {3, 2, 3, 4, 2}),
                equalTo(new int[] {-2, -1, 0, 2, 3}));
    }
}
