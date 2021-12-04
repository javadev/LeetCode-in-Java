package g0301_0400.s0334_increasing_triplet_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void increasingTriplet() {
        assertThat(new Solution().increasingTriplet(new int[] {1, 2, 3, 4, 5}), equalTo(true));
    }
}
