package g2901_3000.s2973_find_number_of_coins_to_place_in_tree_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void placedCoins() {
        assertThat(
                new Solution()
                        .placedCoins(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2],[0,3],[0,4],[0,5]"),
                                new int[] {1, 2, 3, 4, 5, 6}),
                equalTo(new long[] {120, 1, 1, 1, 1, 1}));
    }

    @Test
    void placedCoins2() {
        assertThat(
                new Solution()
                        .placedCoins(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2],[1,3],[1,4],[1,5],[2,6],[2,7],[2,8]"),
                                new int[] {1, 4, 2, 3, 5, 7, 8, -4, 2}),
                equalTo(new long[] {280, 140, 32, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    void placedCoins3() {
        assertThat(
                new Solution()
                        .placedCoins(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2]"),
                                new int[] {1, 2, -2}),
                equalTo(new long[] {0, 1, 1}));
    }
}
