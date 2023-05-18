package g2001_2100.s2056_number_of_valid_move_combinations_on_chessboard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCombinations() {
        assertThat(
                new Solution().countCombinations(new String[] {"rook"}, new int[][] {{1, 1}}),
                equalTo(15));
    }

    @Test
    void countCombinations2() {
        assertThat(
                new Solution().countCombinations(new String[] {"queen"}, new int[][] {{1, 1}}),
                equalTo(22));
    }

    @Test
    void countCombinations3() {
        assertThat(
                new Solution().countCombinations(new String[] {"bishop"}, new int[][] {{4, 3}}),
                equalTo(12));
    }
}
