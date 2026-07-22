package g3801_3900.s3841_palindromic_path_queries_in_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void palindromePath() {
        assertThat(
                new Solution()
                        .palindromePath(
                                3,
                                new int[][] {{0, 1}, {1, 2}},
                                "aac",
                                new String[] {"query 0 2", "update 1 b", "query 0 2"}),
                equalTo(Arrays.asList(true, false)));
    }

    @Test
    void palindromePath2() {
        assertThat(
                new Solution()
                        .palindromePath(
                                4,
                                new int[][] {{0, 1}, {0, 2}, {0, 3}},
                                "abca",
                                new String[] {
                                    "query 1 2",
                                    "update 0 b",
                                    "query 2 3",
                                    "update 3 a",
                                    "query 1 3"
                                }),
                equalTo(Arrays.asList(false, false, true)));
    }
}
