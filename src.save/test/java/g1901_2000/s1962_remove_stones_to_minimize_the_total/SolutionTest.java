package g1901_2000.s1962_remove_stones_to_minimize_the_total;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minStoneSum() {
        assertThat(new Solution().minStoneSum(new int[] {5, 4, 9}, 2), equalTo(12));
    }

    @Test
    void minStoneSum2() {
        assertThat(new Solution().minStoneSum(new int[] {4, 3, 6, 7}, 3), equalTo(12));
    }
}
