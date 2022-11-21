package g0301_0400.s0334_increasing_triplet_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void increasingTriplet() {
        assertThat(new Solution().increasingTriplet(new int[] {1, 2, 3, 4, 5}), equalTo(true));
    }

    @Test
    void increasingTriplet2() {
        assertThat(new Solution().increasingTriplet(new int[] {5, 4, 3, 2, 1}), equalTo(false));
    }

    @Test
    void increasingTriplet3() {
        assertThat(new Solution().increasingTriplet(new int[] {2, 1, 5, 0, 4, 6}), equalTo(true));
    }
}
