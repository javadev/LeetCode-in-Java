package g2201_2300.s2294_partition_array_such_that_maximum_difference_is_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void partitionArray() {
        assertThat(new Solution().partitionArray(new int[] {3, 6, 1, 2, 5}, 2), equalTo(2));
    }

    @Test
    void partitionArray2() {
        assertThat(new Solution().partitionArray(new int[] {1, 2, 3}, 1), equalTo(2));
    }

    @Test
    void partitionArray3() {
        assertThat(new Solution().partitionArray(new int[] {2, 2, 4, 5}, 0), equalTo(3));
    }
}
