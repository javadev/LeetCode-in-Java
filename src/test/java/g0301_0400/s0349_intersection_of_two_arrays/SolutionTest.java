package g0301_0400.s0349_intersection_of_two_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void intersection() {
        assertThat(
                new Solution().intersection(new int[] {1, 2, 2, 1}, new int[] {2, 2}),
                equalTo(new int[] {2}));
    }

    @Test
    void intersection2() {
        assertThat(
                new Solution().intersection(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4}),
                equalTo(new int[] {9, 4}));
    }
}
