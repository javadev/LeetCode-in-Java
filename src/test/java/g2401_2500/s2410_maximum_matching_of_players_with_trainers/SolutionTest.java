package g2401_2500.s2410_maximum_matching_of_players_with_trainers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void matchPlayersAndTrainers() {
        assertThat(
                new Solution().matchPlayersAndTrainers(new int[] {4, 7, 9}, new int[] {8, 2, 5, 8}),
                equalTo(2));
    }

    @Test
    void matchPlayersAndTrainers2() {
        assertThat(
                new Solution().matchPlayersAndTrainers(new int[] {1, 1, 1}, new int[] {10}),
                equalTo(1));
    }
}
