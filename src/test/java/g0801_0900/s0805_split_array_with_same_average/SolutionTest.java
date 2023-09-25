package g0801_0900.s0805_split_array_with_same_average;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitArraySameAverage() {
        assertThat(
                new Solution().splitArraySameAverage(new int[] {1, 2, 3, 4, 5, 6, 7, 8}),
                equalTo(true));
    }

    @Test
    void splitArraySameAverage2() {
        assertThat(new Solution().splitArraySameAverage(new int[] {3, 1}), equalTo(false));
    }
}
