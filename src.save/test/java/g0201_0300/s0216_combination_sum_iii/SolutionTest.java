package g0201_0300.s0216_combination_sum_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void combinationSum3() {
        assertThat(
                new Solution().combinationSum3(3, 7),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 2, 4}})));
    }

    @Test
    void combinationSum32() {
        assertThat(
                new Solution().combinationSum3(3, 9),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 2, 6}, {1, 3, 5}, {2, 3, 4}})));
    }
}
