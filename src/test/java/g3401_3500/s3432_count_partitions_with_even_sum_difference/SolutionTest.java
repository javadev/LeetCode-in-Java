package g3401_3500.s3432_count_partitions_with_even_sum_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPartitions() {
        assertThat(new Solution().countPartitions(new int[] {10, 10, 3, 7, 6}), equalTo(4));
    }

    @Test
    void countPartitions2() {
        assertThat(new Solution().countPartitions(new int[] {1, 2, 2}), equalTo(0));
    }

    @Test
    void countPartitions3() {
        assertThat(new Solution().countPartitions(new int[] {2, 4, 6, 8}), equalTo(3));
    }
}
