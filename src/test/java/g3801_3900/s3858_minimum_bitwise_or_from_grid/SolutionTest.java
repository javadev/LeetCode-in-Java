package g3801_3900.s3858_minimum_bitwise_or_from_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void choosesOneValuePerRowWithTheSmallestOr() {
        Solution solution = new Solution();

        assertThat(solution.minimumOR(new int[][] {{1, 5}, {2, 4}}), equalTo(3));
        assertThat(solution.minimumOR(new int[][] {{3, 5}, {6, 4}}), equalTo(5));
        assertThat(solution.minimumOR(new int[][] {{7, 9, 8}}), equalTo(7));
    }
}
