package g1201_1300.s1262_greatest_sum_divisible_by_three;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumDivThree() {
        assertThat(new Solution().maxSumDivThree(new int[] {3, 6, 5, 1, 8}), equalTo(18));
    }

    @Test
    void maxSumDivThree2() {
        assertThat(new Solution().maxSumDivThree(new int[] {4}), equalTo(0));
    }

    @Test
    void maxSumDivThree3() {
        assertThat(new Solution().maxSumDivThree(new int[] {1, 2, 3, 4, 4}), equalTo(12));
    }
}
