package g0301_0400.s0307_range_sum_query_mutable;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class NumArrayTest {
    @Test
    void numArray() {
        NumArray numArray = new NumArray(new int[] {1, 3, 5});
        assertThat(numArray.sumRange(0, 2), equalTo(9));
        numArray.update(1, 2);
        assertThat(numArray.sumRange(0, 2), equalTo(8));
    }
}
