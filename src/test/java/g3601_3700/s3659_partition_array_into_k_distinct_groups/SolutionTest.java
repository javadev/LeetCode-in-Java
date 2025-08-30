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

    @Test
    void partitionArray4() {
        int[] nums = {1, 2, 3, 4, 5};
        assertThat(new Solution().partitionArray(nums, 2), equalTo(false));
    }

    @Test
    void partitionArray5() {
        int[] nums = {1, 2, 1, 2};
        assertThat(new Solution().partitionArray(nums, 2), equalTo(true));
    }

    @Test
    void partitionArray6() {
        int[] nums = {1, 1, 1, 2};
        assertThat(new Solution().partitionArray(nums, 2), equalTo(false));
    }

    @Test
    void partitionArray7() {
        int[] nums = {7};
        assertThat(new Solution().partitionArray(nums, 1), equalTo(true));
    }

    @Test
    void partitionArray8() {
        int[] nums = {5, 5, 5, 5, 5, 5};
        assertThat(new Solution().partitionArray(nums, 3), equalTo(false));
    }
}
