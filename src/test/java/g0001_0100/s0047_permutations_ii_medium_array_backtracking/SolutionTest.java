package g0001_0100.s0047_permutations_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void permuteUnique() {
        int[][] expected = {{1, 1, 2}, {1, 2, 1}, {2, 1, 1}};
        assertThat(
                new Solution().permuteUnique(new int[] {1, 1, 2}),
                equalTo(ArrayUtils.getLists(expected)));
    }
}
