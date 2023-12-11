package g2801_2900.s2826_sorting_three_groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(new Solution().minimumOperations(Arrays.asList(2, 1, 3, 2, 1)), equalTo(3));
    }

    @Test
    void minimumOperations2() {
        assertThat(new Solution().minimumOperations(Arrays.asList(1, 3, 2, 1, 3, 3)), equalTo(2));
    }

    @Test
    void minimumOperations3() {
        assertThat(new Solution().minimumOperations(Arrays.asList(2, 2, 2, 2, 3, 3)), equalTo(0));
    }
}
