package g3901_4000.s3987_minimum_total_cost_to_process_all_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(new Solution().minimumCost(new int[] {1, 2, 3, 4}, 4), equalTo(3));
    }

    @Test
    void minimumCost2() {
        assertThat(new Solution().minimumCost(new int[] {1, 1, 7, 14}, 4), equalTo(15));
    }

    @Test
    void minimumCost3() {
        assertThat(new Solution().minimumCost(new int[] {1, 2, 3, 4}, 10), equalTo(0));
    }
}
