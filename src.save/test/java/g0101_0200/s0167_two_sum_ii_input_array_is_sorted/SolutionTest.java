package g0101_0200.s0167_two_sum_ii_input_array_is_sorted;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void twoSum() {
        assertThat(new Solution().twoSum(new int[] {2, 7, 11, 15}, 9), equalTo(new int[] {1, 2}));
    }

    @Test
    void twoSum2() {
        assertThat(new Solution().twoSum(new int[] {2, 3, 4}, 6), equalTo(new int[] {1, 3}));
    }

    @Test
    void twoSum3() {
        assertThat(new Solution().twoSum(new int[] {-1, 0}, -1), equalTo(new int[] {1, 2}));
    }
}
