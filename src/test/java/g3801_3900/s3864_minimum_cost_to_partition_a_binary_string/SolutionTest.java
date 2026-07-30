package g3801_3900.s3864_minimum_cost_to_partition_a_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost("1010", 2, 1), equalTo(6L));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost("1010", 3, 10), equalTo(12L));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost("00", 1, 2), equalTo(2L));
    }
}
