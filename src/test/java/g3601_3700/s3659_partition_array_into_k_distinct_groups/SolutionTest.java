package g3601_3700.s3659_partition_array_into_k_distinct_groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void partitionArray() {
        assertThat(new Solution().partitionArray(new int[] {1, 2, 3, 4}, 2), equalTo(true));
    }

    @Test
    void partitionArray2() {
        assertThat(new Solution().partitionArray(new int[] {3, 5, 2, 2}, 2), equalTo(true));
    }

    @Test
    void partitionArray3() {
        assertThat(new Solution().partitionArray(new int[] {1, 5, 2, 3}, 3), equalTo(false));
    }
}
