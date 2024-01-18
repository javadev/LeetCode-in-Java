package g2001_2100.s2070_most_beautiful_item_for_each_query;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumBeauty() {
        int[][] items =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[3,2],[2,4],[5,6],[3,5]");
        int[] queries = new int[] {1, 2, 3, 4, 5, 6};
        int[] expected = new int[] {2, 4, 5, 5, 6, 6};
        assertThat(new Solution().maximumBeauty(items, queries), equalTo(expected));
    }

    @Test
    void maximumBeauty2() {
        int[][] items =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[1,2],[1,3],[1,4]");
        int[] queries = new int[] {1};
        int[] expected = new int[] {4};
        assertThat(new Solution().maximumBeauty(items, queries), equalTo(expected));
    }

    @Test
    void maximumBeauty3() {
        int[][] items =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[10,1000]");
        int[] queries = new int[] {5};
        int[] expected = new int[] {0};
        assertThat(new Solution().maximumBeauty(items, queries), equalTo(expected));
    }
}
