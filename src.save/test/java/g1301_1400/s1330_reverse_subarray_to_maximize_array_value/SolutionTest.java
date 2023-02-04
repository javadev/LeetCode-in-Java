package g1301_1400.s1330_reverse_subarray_to_maximize_array_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxValueAfterReverse() {
        assertThat(new Solution().maxValueAfterReverse(new int[] {2, 3, 1, 5, 4}), equalTo(10));
    }

    @Test
    void maxValueAfterReverse2() {
        assertThat(
                new Solution().maxValueAfterReverse(new int[] {2, 4, 9, 24, 2, 1, 10}),
                equalTo(68));
    }
}
