package g2501_2600.s2597_the_number_of_beautiful_subsets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void beautifulSubsets() {
        assertThat(new Solution().beautifulSubsets(new int[] {2, 4, 6}, 2), equalTo(4));
    }

    @Test
    void beautifulSubsets2() {
        assertThat(new Solution().beautifulSubsets(new int[] {1}, 1), equalTo(1));
    }
}
