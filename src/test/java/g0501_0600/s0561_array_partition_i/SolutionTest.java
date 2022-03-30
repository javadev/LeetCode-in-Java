package g0501_0600.s0561_array_partition_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void arrayPairSum() {
        assertThat(new Solution().arrayPairSum(new int[] {1, 4, 3, 2}), equalTo(4));
    }

    @Test
    void arrayPairSum2() {
        assertThat(new Solution().arrayPairSum(new int[] {6, 2, 6, 5, 1, 2}), equalTo(9));
    }
}
