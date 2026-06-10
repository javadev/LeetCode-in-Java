package g3801_3900.s3812_minimum_edge_toggles_on_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumFlips() {
        assertThat(
                new Solution().minimumFlips(3, new int[][] {{0, 1}, {1, 2}}, "010", "100"),
                equalTo(Arrays.asList(0)));
    }

    @Test
    void minimumFlips2() {
        assertThat(
                new Solution()
                        .minimumFlips(
                                7,
                                new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 4}, {3, 5}, {1, 6}},
                                "0011000",
                                "0010001"),
                equalTo(Arrays.asList(1, 2, 5)));
    }

    @Test
    void minimumFlips3() {
        assertThat(
                new Solution().minimumFlips(2, new int[][] {{0, 1}}, "00", "01"),
                equalTo(Arrays.asList(-1)));
    }
}
