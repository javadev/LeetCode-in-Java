package g2201_2300.s2215_find_the_difference_of_two_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDifference() {
        assertThat(
                new Solution().findDifference(new int[] {1, 2, 3}, new int[] {2, 4, 6}),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 3}, {4, 6}})));
    }

    @Test
    void findDifference2() {
        assertThat(
                new Solution().findDifference(new int[] {1, 2, 3, 3}, new int[] {1, 1, 2, 2}),
                equalTo(ArrayUtils.getLists(new int[][] {{3}, {}})));
    }
}
