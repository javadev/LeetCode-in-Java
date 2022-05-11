package g1801_1900.s1879_minimum_xor_sum_of_two_arrays;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void minimumXORSum() {
        assertThat(new Solution().minimumXORSum(new int[]{1,2}, new int[]{2,3}), equalTo(2));
    }

    @Test
    void minimumXORSum2() {
        assertThat(new Solution().minimumXORSum(new int[]{1,0,3}, new int[]{5,3,4}), equalTo(8));
    }
}
