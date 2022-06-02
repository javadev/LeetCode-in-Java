package g2101_2200.s2121_intervals_between_identical_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getDistances() {
        assertThat(
                new Solution().getDistances(new int[] {2, 1, 3, 1, 2, 3, 3}),
                equalTo(new long[] {4, 2, 7, 2, 4, 4, 5}));
    }

    @Test
    void getDistances2() {
        assertThat(
                new Solution().getDistances(new int[] {10, 5, 10, 10}),
                equalTo(new long[] {5, 0, 3, 4}));
    }
}
