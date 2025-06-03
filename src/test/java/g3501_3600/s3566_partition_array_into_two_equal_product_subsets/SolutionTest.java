package g3501_3600.s3566_partition_array_into_two_equal_product_subsets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkEqualPartitions() {
        assertThat(
                new Solution().checkEqualPartitions(new int[] {3, 1, 6, 8, 4}, 24L), equalTo(true));
    }

    @Test
    void checkEqualPartitions2() {
        assertThat(
                new Solution().checkEqualPartitions(new int[] {2, 5, 3, 7}, 15L), equalTo(false));
    }
}
