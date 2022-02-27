package g1101_1200.s1200_minimum_absolute_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumAbsDifference() {
        assertThat(
                new Solution().minimumAbsDifference(new int[] {4, 2, 1, 3}),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 2}, {2, 3}, {3, 4}})));
    }

    @Test
    void minimumAbsDifference2() {
        assertThat(
                new Solution().minimumAbsDifference(new int[] {1, 3, 6, 10, 15}),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 3}})));
    }

    @Test
    void minimumAbsDifference3() {
        assertThat(
                new Solution().minimumAbsDifference(new int[] {3, 8, -10, 23, 19, -4, -14, 27}),
                equalTo(ArrayUtils.getLists(new int[][] {{-14, -10}, {19, 23}, {23, 27}})));
    }
}
