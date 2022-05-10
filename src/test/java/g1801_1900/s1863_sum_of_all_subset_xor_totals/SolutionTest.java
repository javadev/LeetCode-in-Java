package g1801_1900.s1863_sum_of_all_subset_xor_totals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subsetXORSum() {
        assertThat(new Solution().subsetXORSum(new int[] {1, 3}), equalTo(6));
    }

    @Test
    void subsetXORSum2() {
        assertThat(new Solution().subsetXORSum(new int[] {5, 1, 6}), equalTo(28));
    }

    @Test
    void subsetXORSum3() {
        assertThat(new Solution().subsetXORSum(new int[] {3, 4, 5, 6, 7, 8}), equalTo(480));
    }
}
