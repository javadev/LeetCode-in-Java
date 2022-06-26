package g0401_0500.s0419_battleships_in_a_board;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBattleships() {
        char[][] matrix = {{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};
        assertThat(new Solution().countBattleships(matrix), equalTo(2));
    }

    @Test
    void countBattleships2() {
        char[][] matrix = {{'.'}};
        assertThat(new Solution().countBattleships(matrix), equalTo(0));
    }
}
