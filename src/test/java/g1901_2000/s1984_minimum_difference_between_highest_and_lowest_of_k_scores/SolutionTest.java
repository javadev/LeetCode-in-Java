package g1901_2000.s1984_minimum_difference_between_highest_and_lowest_of_k_scores;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDifference() {
        assertThat(new Solution().minimumDifference(new int[] {90}, 1), equalTo(0));
    }

    @Test
    void minimumDifference2() {
        assertThat(new Solution().minimumDifference(new int[] {9, 4, 1, 7}, 2), equalTo(2));
    }
}
