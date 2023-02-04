package g1801_1900.s1835_find_xor_sum_of_all_pairs_bitwise_and;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getXORSum() {
        assertThat(new Solution().getXORSum(new int[] {1, 2, 3}, new int[] {6, 5}), equalTo(0));
    }

    @Test
    void getXORSum2() {
        assertThat(new Solution().getXORSum(new int[] {12}, new int[] {4}), equalTo(4));
    }
}
