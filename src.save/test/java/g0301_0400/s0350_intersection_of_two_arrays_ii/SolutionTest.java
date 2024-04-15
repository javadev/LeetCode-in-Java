package g0301_0400.s0350_intersection_of_two_arrays_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void intersect() {
        assertThat(
                new Solution().intersect(new int[] {1, 2, 2, 1}, new int[] {2, 2}),
                equalTo(new int[] {2, 2}));
    }

    @Test
    void intersect2() {
        assertThat(
                new Solution().intersect(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4}),
                equalTo(new int[] {4, 9}));
    }
}
