package g3501_3600.s3575_maximum_good_subtree_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void goodSubtreeSum() {
        assertThat(new Solution().goodSubtreeSum(new int[] {2, 3}, new int[] {-1, 0}), equalTo(8));
    }

    @Test
    void goodSubtreeSum2() {
        assertThat(
                new Solution().goodSubtreeSum(new int[] {1, 5, 2}, new int[] {-1, 0, 0}),
                equalTo(15));
    }

    @Test
    void goodSubtreeSum3() {
        assertThat(
                new Solution().goodSubtreeSum(new int[] {34, 1, 2}, new int[] {-1, 0, 1}),
                equalTo(42));
    }

    @Test
    void goodSubtreeSum4() {
        assertThat(
                new Solution().goodSubtreeSum(new int[] {3, 22, 5}, new int[] {-1, 0, 1}),
                equalTo(18));
    }
}
