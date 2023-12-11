package g2701_2800.s2747_count_zero_request_servers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countServers() {
        assertThat(
                new Solution()
                        .countServers(
                                3,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,3],[2,6],[1,5]"),
                                5,
                                new int[] {10, 11}),
                equalTo(new int[] {1, 2}));
    }

    @Test
    void countServers2() {
        assertThat(
                new Solution()
                        .countServers(
                                3,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[2,4],[2,1],[1,2],[3,1]"),
                                2,
                                new int[] {3, 4}),
                equalTo(new int[] {0, 1}));
    }
}
