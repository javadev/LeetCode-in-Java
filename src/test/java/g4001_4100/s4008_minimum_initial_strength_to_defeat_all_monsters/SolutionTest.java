package g4001_4100.s4008_minimum_initial_strength_to_defeat_all_monsters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minInitialStrength() {
        assertThat(
                new Solution().minInitialStrength(new int[] {5, 10, 15}, new int[][] {{1, 1, 10}}),
                equalTo(30L));
    }

    @Test
    void minInitialStrength2() {
        assertThat(
                new Solution()
                        .minInitialStrength(
                                new int[] {5, 10, 15}, new int[][] {{1, 2, 10}, {1, 2, 5}}),
                equalTo(5L));
    }
}
