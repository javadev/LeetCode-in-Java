package g2501_2600.s2522_partition_string_into_substrings_with_values_at_most_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumPartition() {
        assertThat(new Solution().minimumPartition("165462", 60), equalTo(4));
    }

    @Test
    void minimumPartition2() {
        assertThat(new Solution().minimumPartition("238182", 5), equalTo(-1));
    }
}
