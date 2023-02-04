package g1801_1900.s1877_minimize_maximum_pair_sum_in_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPairSum() {
        assertThat(new Solution().minPairSum(new int[] {3, 5, 2, 3}), equalTo(7));
    }

    @Test
    void minPairSum2() {
        assertThat(new Solution().minPairSum(new int[] {3, 5, 4, 2, 4, 6}), equalTo(8));
    }
}
