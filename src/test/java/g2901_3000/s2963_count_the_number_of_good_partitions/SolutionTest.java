package g2901_3000.s2963_count_the_number_of_good_partitions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfGoodPartitions() {
        assertThat(new Solution().numberOfGoodPartitions(new int[] {1, 2, 3, 4}), equalTo(8));
    }

    @Test
    void numberOfGoodPartitions2() {
        assertThat(new Solution().numberOfGoodPartitions(new int[] {1, 1, 1, 1}), equalTo(1));
    }

    @Test
    void numberOfGoodPartitions3() {
        assertThat(new Solution().numberOfGoodPartitions(new int[] {1, 2, 1, 3}), equalTo(2));
    }
}
