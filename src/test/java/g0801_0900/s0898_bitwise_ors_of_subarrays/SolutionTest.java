package g0801_0900.s0898_bitwise_ors_of_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subarrayBitwiseORs() {
        assertThat(new Solution().subarrayBitwiseORs(new int[] {0}), equalTo(1));
    }

    @Test
    void subarrayBitwiseORs2() {
        assertThat(new Solution().subarrayBitwiseORs(new int[] {1, 1, 2}), equalTo(3));
    }

    @Test
    void subarrayBitwiseORs3() {
        assertThat(new Solution().subarrayBitwiseORs(new int[] {1, 2, 4}), equalTo(6));
    }
}
