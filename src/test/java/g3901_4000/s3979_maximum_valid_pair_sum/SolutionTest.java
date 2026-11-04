package g3901_4000.s3979_maximum_valid_pair_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxValidPairSum() {
        assertThat(new Solution().maxValidPairSum(new int[] {1, 3, 5, 2, 8}, 2), equalTo(13));
    }

    @Test
    void maxValidPairSum2() {
        assertThat(new Solution().maxValidPairSum(new int[] {5, 1, 9}, 1), equalTo(14));
    }

    @Test
    void maxValidPairSum3() {
        assertThat(new Solution().maxValidPairSum(new int[] {9, 1, 1, 8}, 3), equalTo(17));
    }
}
