package g3201_3300.s3238_find_the_number_of_winning_players;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void winningPlayerCount() {
        assertThat(
                new Solution()
                        .winningPlayerCount(
                                4, new int[][] {{0, 0}, {1, 0}, {1, 0}, {2, 1}, {2, 1}, {2, 0}}),
                equalTo(2));
    }

    @Test
    void winningPlayerCount2() {
        assertThat(
                new Solution().winningPlayerCount(5, new int[][] {{1, 1}, {1, 2}, {1, 3}, {1, 4}}),
                equalTo(0));
    }

    @Test
    void winningPlayerCount3() {
        assertThat(
                new Solution().winningPlayerCount(5, new int[][] {{1, 1}, {2, 4}, {2, 4}, {2, 4}}),
                equalTo(1));
    }
}
