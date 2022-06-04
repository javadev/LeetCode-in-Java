package g0001_0100.s0001_two_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void twoSum() {
        assertThat(new Solution().twoSum(new int[] {2, 7, 11, 15}, 9), equalTo(new int[] {0, 1}));
    }

    @Test
    void twoSum2() {
        assertThat(new Solution().twoSum(new int[] {3, 2, 4}, 6), equalTo(new int[] {1, 2}));
    }

    @Test
    void twoSum3() {
        assertThat(new Solution().twoSum(new int[] {3, 3}, 6), equalTo(new int[] {0, 1}));
    }

    @Test
    void twoSum4() {
        assertThat(new Solution().twoSum(new int[] {3, 3}, 7), equalTo(new int[] {-1, -1}));
    }
}
