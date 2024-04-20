package g0001_0100.s0077_combinations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void combine() {
        int[][] expected = {{2, 1}, {3, 1}, {4, 1}, {3, 2}, {4, 2}, {4, 3}};
        assertThat(new Solution().combine(4, 2), equalTo(ArrayUtils.getLists(expected)));
    }

    @Test
    void combine2() {
        int[][] expected = {{1}};
        assertThat(new Solution().combine(1, 1), equalTo(ArrayUtils.getLists(expected)));
    }
}
