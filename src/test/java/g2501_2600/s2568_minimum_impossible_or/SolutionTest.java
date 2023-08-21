package g2501_2600.s2568_minimum_impossible_or;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minImpossibleOR() {
        assertThat(new Solution().minImpossibleOR(new int[] {2, 1}), equalTo(4));
    }

    @Test
    void minImpossibleOR2() {
        assertThat(new Solution().minImpossibleOR(new int[] {5, 3, 2}), equalTo(1));
    }
}
