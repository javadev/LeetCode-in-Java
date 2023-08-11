package g0301_0400.s0398_random_pick_index;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pick() {
        int[] input = new int[] {1, 2, 3, 3, 3};
        Solution solution = new Solution(input);
        assertThat(Arrays.asList(2, 3, 4).contains(solution.pick(3)), equalTo(true));
        assertThat(solution.pick(1), equalTo(0));
        assertThat(Arrays.asList(2, 3, 4).contains(solution.pick(3)), equalTo(true));
    }
}
