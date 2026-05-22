package g3701_3800.s3796_find_maximum_value_in_a_constrained_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxVal() {
        assertThat(
                new Solution()
                        .findMaxVal(
                                10,
                                new int[][] {{3, 1}, {8, 1}},
                                new int[] {2, 2, 3, 1, 4, 5, 1, 1, 2}),
                equalTo(6));
    }

    @Test
    void findMaxVal2() {
        assertThat(
                new Solution().findMaxVal(8, new int[][] {{3, 2}}, new int[] {3, 5, 2, 4, 2, 3, 1}),
                equalTo(12));
    }
}
