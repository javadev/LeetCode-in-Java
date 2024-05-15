package g3101_3200.s3144_minimum_substring_partition_of_equal_character_frequency;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSubstringsInPartition() {
        assertThat(new Solution().minimumSubstringsInPartition("fabccddg"), equalTo(3));
    }

    @Test
    void minimumSubstringsInPartition2() {
        assertThat(new Solution().minimumSubstringsInPartition("abababaccddb"), equalTo(2));
    }
}
