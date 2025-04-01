package g3401_3500.s3500_minimum_cost_to_divide_array_into_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(
                new Solution().minimumCost(new int[] {3, 1, 4}, new int[] {4, 6, 6}, 1),
                equalTo(110L));
    }

    @Test
    void minimumCost2() {
        assertThat(
                new Solution()
                        .minimumCost(
                                new int[] {4, 8, 5, 1, 14, 2, 2, 12, 1},
                                new int[] {7, 2, 8, 4, 2, 2, 1, 1, 2},
                                7),
                equalTo(985L));
    }
}
