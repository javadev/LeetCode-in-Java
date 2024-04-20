package g2001_2100.s2025_maximum_number_of_ways_to_partition_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void waysToPartition() {
        assertThat(new Solution().waysToPartition(new int[] {2, -1, 2}, 3), equalTo(1));
    }

    @Test
    void waysToPartition2() {
        assertThat(new Solution().waysToPartition(new int[] {0, 0, 0}, 1), equalTo(2));
    }

    @Test
    void waysToPartition3() {
        assertThat(
                new Solution()
                        .waysToPartition(
                                new int[] {22, 4, -25, -20, -15, 15, -16, 7, 19, -10, 0, -13, -14},
                                -33),
                equalTo(4));
    }
}
