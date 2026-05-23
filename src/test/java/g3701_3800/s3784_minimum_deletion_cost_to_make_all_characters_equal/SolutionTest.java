package g3701_3800.s3784_minimum_deletion_cost_to_make_all_characters_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost("aabaac", new int[] {1, 2, 3, 4, 1, 10}), equalTo(11L));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost("abc", new int[] {10, 5, 8}), equalTo(13L));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost("zzzzz", new int[] {67, 67, 67, 67, 67}), equalTo(0L));
    }
}
