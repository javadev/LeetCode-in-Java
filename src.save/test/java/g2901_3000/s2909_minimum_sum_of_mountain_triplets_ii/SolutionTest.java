package g2901_3000.s2909_minimum_sum_of_mountain_triplets_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSum() {
        assertThat(new Solution().minimumSum(new int[] {8, 6, 1, 5, 3}), equalTo(9));
    }

    @Test
    void minimumSum2() {
        assertThat(new Solution().minimumSum(new int[] {5, 4, 8, 7, 10, 2}), equalTo(13));
    }

    @Test
    void minimumSum3() {
        assertThat(new Solution().minimumSum(new int[] {6, 5, 4, 3, 4, 5}), equalTo(-1));
    }
}
