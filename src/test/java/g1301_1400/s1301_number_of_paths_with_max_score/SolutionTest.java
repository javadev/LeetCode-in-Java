package g1301_1400.s1301_number_of_paths_with_max_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pathsWithMaxScore() {
        assertThat(
                new Solution().pathsWithMaxScore(Arrays.asList("E23", "2X2", "12S")),
                equalTo(new int[] {7, 1}));
    }

    @Test
    void pathsWithMaxScore2() {
        assertThat(
                new Solution().pathsWithMaxScore(Arrays.asList("E12", "1X1", "21S")),
                equalTo(new int[] {4, 2}));
    }

    @Test
    void pathsWithMaxScore3() {
        assertThat(
                new Solution().pathsWithMaxScore(Arrays.asList("E11", "XXX", "11S")),
                equalTo(new int[] {0, 0}));
    }
}
