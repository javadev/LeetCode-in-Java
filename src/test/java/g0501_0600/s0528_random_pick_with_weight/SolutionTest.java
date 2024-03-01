package g0501_0600.s0528_random_pick_with_weight;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solutionTest() {
        assertThat(new Solution(new int[] {1}).pickIndex(), equalTo(0));
    }

    @Test
    void solutionTest2() {
        Solution solution = new Solution(new int[] {1, 3});
        assertThat(Arrays.asList(0, 1).contains(solution.pickIndex()), equalTo(true));
        assertThat(Arrays.asList(0, 1).contains(solution.pickIndex()), equalTo(true));
        assertThat(Arrays.asList(0, 1).contains(solution.pickIndex()), equalTo(true));
        assertThat(Arrays.asList(0, 1).contains(solution.pickIndex()), equalTo(true));
        assertThat(Arrays.asList(0, 1).contains(solution.pickIndex()), equalTo(true));
    }
}
