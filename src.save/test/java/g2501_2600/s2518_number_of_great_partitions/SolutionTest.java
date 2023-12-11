package g2501_2600.s2518_number_of_great_partitions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPartitions() {
        assertThat(new Solution().countPartitions(new int[] {1, 2, 3, 4}, 4), equalTo(6));
    }

    @Test
    void countPartitions2() {
        assertThat(new Solution().countPartitions(new int[] {3, 3, 3}, 4), equalTo(0));
    }

    @Test
    void countPartitions3() {
        assertThat(new Solution().countPartitions(new int[] {6, 6}, 2), equalTo(2));
    }
}
