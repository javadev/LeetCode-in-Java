package g3401_3500.s3480_maximize_subarrays_after_removing_one_conflicting_pair;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubarrays() {
        assertThat(new Solution().maxSubarrays(4, new int[][] {{2, 3}, {1, 4}}), equalTo(9L));
    }

    @Test
    void maxSubarrays2() {
        assertThat(
                new Solution().maxSubarrays(5, new int[][] {{1, 2}, {2, 5}, {3, 5}}), equalTo(12L));
    }
}
