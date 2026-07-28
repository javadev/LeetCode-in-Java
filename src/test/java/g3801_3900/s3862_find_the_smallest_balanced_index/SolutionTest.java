package g3801_3900.s3862_find_the_smallest_balanced_index;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsTheFirstIndexWhoseLeftSumEqualsRightProduct() {
        Solution solution = new Solution();

        assertThat(solution.smallestBalancedIndex(new int[] {2, 1, 2}), equalTo(1));
        assertThat(solution.smallestBalancedIndex(new int[] {2, 8, 2, 2, 5}), equalTo(2));
        assertThat(solution.smallestBalancedIndex(new int[] {1}), equalTo(-1));
    }
}
