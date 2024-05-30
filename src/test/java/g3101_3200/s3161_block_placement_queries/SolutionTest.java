package g3101_3200.s3161_block_placement_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getResults() {
        assertThat(
                new Solution().getResults(new int[][] {{1, 2}, {2, 3, 3}, {2, 3, 1}, {2, 2, 2}}),
                equalTo(List.of(false, true, true)));
    }

    @Test
    void getResults2() {
        assertThat(
                new Solution()
                        .getResults(new int[][] {{1, 7}, {2, 7, 6}, {1, 2}, {2, 7, 5}, {2, 7, 6}}),
                equalTo(List.of(true, true, false)));
    }

    @Test
    void getResults3() {
        assertThat(
                new Solution()
                        .getResults(
                                new int[][] {{1, 4}, {1, 9}, {2, 15, 4}, {2, 11, 6}, {2, 13, 10}}),
                equalTo(List.of(true, false, false)));
    }
}
