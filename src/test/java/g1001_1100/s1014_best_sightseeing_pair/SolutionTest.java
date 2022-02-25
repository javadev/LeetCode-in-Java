package g1001_1100.s1014_best_sightseeing_pair;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScoreSightseeingPair() {
        assertThat(new Solution().maxScoreSightseeingPair(new int[] {8, 1, 5, 2, 6}), equalTo(11));
    }

    @Test
    void maxScoreSightseeingPair2() {
        assertThat(new Solution().maxScoreSightseeingPair(new int[] {1, 2}), equalTo(2));
    }
}
