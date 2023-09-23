package g2701_2800.s2740_find_the_value_of_the_partition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findValueOfPartition() {
        assertThat(new Solution().findValueOfPartition(new int[] {1, 3, 2, 4}), equalTo(1));
    }

    @Test
    void findValueOfPartition2() {
        assertThat(new Solution().findValueOfPartition(new int[] {100, 1, 10}), equalTo(9));
    }
}
