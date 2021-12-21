package g0301_0400.s0303_range_sum_query_immutable;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class NumArrayTest {
    @Test
    void numArray() {
        NumArray numArray = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        // return (-2) + 0 + 3 = 1
        assertThat(numArray.sumRange(0, 2), equalTo(1));
        // return 3 + (-5) + 2 + (-1) = -1
        assertThat(numArray.sumRange(2, 5), equalTo(-1));
        // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
        assertThat(numArray.sumRange(0, 5), equalTo(-3));
    }
}
