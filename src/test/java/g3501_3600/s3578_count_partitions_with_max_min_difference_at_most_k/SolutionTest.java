package g3501_3600.s3578_count_partitions_with_max_min_difference_at_most_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPartitions() {
        assertThat(new Solution().countPartitions(new int[] {9, 4, 1, 3, 7}, 4), equalTo(6));
    }

    @Test
    void countPartitions2() {
        assertThat(new Solution().countPartitions(new int[] {3, 3, 4}, 0), equalTo(2));
    }
}
