package g0701_0800.s0763_partition_labels;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void partitionLabels() {
        assertThat(
                new Solution().partitionLabels("ababcbacadefegdehijhklij"),
                equalTo(Arrays.asList(9, 7, 8)));
    }

    @Test
    void partitionLabels2() {
        assertThat(new Solution().partitionLabels("eccbbbbdec"), equalTo(Arrays.asList(10)));
    }
}
