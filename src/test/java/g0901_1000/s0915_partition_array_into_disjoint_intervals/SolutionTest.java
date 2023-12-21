package g0901_1000.s0915_partition_array_into_disjoint_intervals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void partitionDisjoint() {
        assertThat(new Solution().partitionDisjoint(new int[] {5, 0, 3, 8, 6}), equalTo(3));
    }

    @Test
    void partitionDisjoint2() {
        assertThat(new Solution().partitionDisjoint(new int[] {1, 1, 1, 0, 6, 12}), equalTo(4));
    }
}
