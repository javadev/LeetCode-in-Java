package g0701_0800.s0718_maximum_length_of_repeated_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLength() {
        assertThat(
                new Solution().findLength(new int[] {1, 2, 3, 2, 1}, new int[] {3, 2, 1, 4, 7}),
                equalTo(3));
    }

    @Test
    void findLength2() {
        assertThat(
                new Solution().findLength(new int[] {0, 0, 0, 0, 0}, new int[] {0, 0, 0, 0, 0}),
                equalTo(5));
    }
}
