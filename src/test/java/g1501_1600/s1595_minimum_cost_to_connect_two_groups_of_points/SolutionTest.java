package g1501_1600.s1595_minimum_cost_to_connect_two_groups_of_points;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void connectTwoGroups() {
        assertThat(
                new Solution()
                        .connectTwoGroups(ArrayUtils.getLists(new int[][] {{15, 96}, {36, 2}})),
                equalTo(17));
    }

    @Test
    void connectTwoGroups2() {
        assertThat(
                new Solution()
                        .connectTwoGroups(
                                ArrayUtils.getLists(new int[][] {{1, 3, 5}, {4, 1, 1}, {1, 5, 3}})),
                equalTo(4));
    }

    @Test
    void connectTwoGroups3() {
        assertThat(
                new Solution()
                        .connectTwoGroups(
                                ArrayUtils.getLists(
                                        new int[][] {
                                            {2, 5, 1}, {3, 4, 7}, {8, 1, 2}, {6, 2, 4}, {3, 8, 8}
                                        })),
                equalTo(10));
    }
}
