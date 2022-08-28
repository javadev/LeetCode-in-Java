package g2201_2300.s2225_find_players_with_zero_or_one_losses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findWinners() {
        assertThat(
                new Solution()
                        .findWinners(
                                new int[][] {
                                    {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9},
                                    {10, 4}, {10, 9}
                                }),
                equalTo(Arrays.asList(Arrays.asList(1, 2, 10), Arrays.asList(4, 5, 7, 8))));
    }

    @Test
    void findWinners2() {
        assertThat(
                new Solution().findWinners(new int[][] {{2, 3}, {1, 3}, {5, 4}, {6, 4}}),
                equalTo(Arrays.asList(Arrays.asList(1, 2, 5, 6), Collections.emptyList())));
    }
}
