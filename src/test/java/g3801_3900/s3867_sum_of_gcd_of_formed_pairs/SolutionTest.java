package g3801_3900.s3867_sum_of_gcd_of_formed_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void gcdSum() {
        assertThat(new Solution().gcdSum(new int[] {2, 6, 4}), equalTo(2L));
    }

    @Test
    void gcdSum2() {
        assertThat(new Solution().gcdSum(new int[] {3, 6, 2, 8}), equalTo(5L));
    }

    @Test
    void gcdSum3() {
        assertThat(new Solution().gcdSum(new int[] {7}), equalTo(0L));
    }
}
