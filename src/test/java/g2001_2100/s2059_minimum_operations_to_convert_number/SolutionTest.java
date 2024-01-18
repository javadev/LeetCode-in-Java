package g2001_2100.s2059_minimum_operations_to_convert_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(new Solution().minimumOperations(new int[] {2, 4, 12}, 2, 12), equalTo(2));
    }

    @Test
    void minimumOperations2() {
        assertThat(new Solution().minimumOperations(new int[] {3, 5, 7}, 0, -4), equalTo(2));
    }

    @Test
    void minimumOperations3() {
        assertThat(new Solution().minimumOperations(new int[] {2, 8, 16}, 0, 1), equalTo(-1));
    }
}
