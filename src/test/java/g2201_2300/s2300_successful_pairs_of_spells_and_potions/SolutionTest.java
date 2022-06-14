package g2201_2300.s2300_successful_pairs_of_spells_and_potions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void successfulPairs() {
        assertThat(
                new Solution().successfulPairs(new int[] {5, 1, 3}, new int[] {1, 2, 3, 4, 5}, 7),
                equalTo(new int[] {4, 0, 3}));
    }

    @Test
    void successfulPairs2() {
        assertThat(
                new Solution().successfulPairs(new int[] {3, 1, 2}, new int[] {8, 5, 8}, 16),
                equalTo(new int[] {2, 0, 2}));
    }
}
