package g3501_3600.s3574_maximize_subarray_gcd_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxGCDScore() {
        assertThat(new Solution().maxGCDScore(new int[] {2, 4}, 1), equalTo(8L));
    }

    @Test
    void maxGCDScore2() {
        assertThat(new Solution().maxGCDScore(new int[] {3, 5, 7}, 2), equalTo(14L));
    }

    @Test
    void maxGCDScore3() {
        assertThat(new Solution().maxGCDScore(new int[] {5, 5, 5}, 1), equalTo(15L));
    }
}
