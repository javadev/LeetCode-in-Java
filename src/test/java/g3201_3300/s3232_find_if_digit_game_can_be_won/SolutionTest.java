package g3201_3300.s3232_find_if_digit_game_can_be_won;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canAliceWin() {
        assertThat(new Solution().canAliceWin(new int[] {1, 2, 3, 4, 10}), equalTo(false));
    }

    @Test
    void canAliceWin2() {
        assertThat(new Solution().canAliceWin(new int[] {1, 2, 3, 4, 5, 14}), equalTo(true));
    }

    @Test
    void canAliceWin3() {
        assertThat(new Solution().canAliceWin(new int[] {5, 5, 5, 25}), equalTo(true));
    }
}
