package g2301_2400.s2369_check_if_there_is_a_valid_partition_for_the_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validPartition() {
        assertThat(new Solution().validPartition(new int[] {4, 4, 4, 5, 6}), equalTo(true));
    }

    @Test
    void validPartition2() {
        assertThat(new Solution().validPartition(new int[] {1, 1, 1, 2}), equalTo(false));
    }

    @Test
    void validPartition3() {
        assertThat(new Solution().validPartition(new int[] {1, 2}), equalTo(false));
    }

    @Test
    void validPartition4() {
        assertThat(new Solution().validPartition(new int[] {1, 3}), equalTo(false));
    }
}
