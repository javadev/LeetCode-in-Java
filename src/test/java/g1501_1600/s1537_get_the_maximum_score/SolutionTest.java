package g1501_1600.s1537_get_the_maximum_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(
                new Solution().maxSum(new int[] {2, 4, 5, 8, 10}, new int[] {4, 6, 8, 9}),
                equalTo(30));
    }

    @Test
    void maxSum2() {
        assertThat(
                new Solution().maxSum(new int[] {1, 3, 5, 7, 9}, new int[] {3, 5, 100}),
                equalTo(109));
    }

    @Test
    void maxSum3() {
        assertThat(
                new Solution().maxSum(new int[] {1, 2, 3, 4, 5}, new int[] {6, 7, 8, 9, 10}),
                equalTo(40));
    }
}
