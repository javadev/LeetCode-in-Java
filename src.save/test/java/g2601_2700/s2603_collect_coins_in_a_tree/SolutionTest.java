package g2601_2700.s2603_collect_coins_in_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void collectTheCoins() {
        assertThat(
                new Solution()
                        .collectTheCoins(
                                new int[] {1, 0, 0, 0, 0, 1},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[1,2],[2,3],[3,4],[4,5]")),
                equalTo(2));
    }

    @Test
    void collectTheCoins2() {
        assertThat(
                new Solution()
                        .collectTheCoins(
                                new int[] {0, 0, 0, 1, 1, 0, 0, 1},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2],[1,3],[1,4],[2,5],[5,6],[5,7]")),
                equalTo(2));
    }
}
