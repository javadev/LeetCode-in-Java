package g2401_2500.s2405_optimal_partition_of_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void partitionString() {
        assertThat(new Solution().partitionString("abacaba"), equalTo(4));
    }

    @Test
    void partitionString2() {
        assertThat(new Solution().partitionString("ssssss"), equalTo(6));
    }
}
