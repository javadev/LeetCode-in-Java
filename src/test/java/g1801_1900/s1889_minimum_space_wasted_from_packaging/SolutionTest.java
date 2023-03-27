package g1801_1900.s1889_minimum_space_wasted_from_packaging;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minWastedSpace() {
        assertThat(
                new Solution().minWastedSpace(new int[] {2, 3, 5}, new int[][] {{4, 8}, {2, 8}}),
                equalTo(6));
    }

    @Test
    void minWastedSpace2() {
        assertThat(
                new Solution()
                        .minWastedSpace(new int[] {2, 3, 5}, new int[][] {{1, 4}, {2, 3}, {3, 4}}),
                equalTo(-1));
    }

    @Test
    void minWastedSpace3() {
        assertThat(
                new Solution()
                        .minWastedSpace(
                                new int[] {3, 5, 8, 10, 11, 12},
                                new int[][] {{12}, {11, 9}, {10, 5, 14}}),
                equalTo(9));
    }
}
