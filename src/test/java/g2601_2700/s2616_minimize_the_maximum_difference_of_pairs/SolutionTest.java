package g2601_2700.s2616_minimize_the_maximum_difference_of_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizeMax() {
        assertThat(new Solution().minimizeMax(new int[] {10, 1, 2, 7, 1, 3}, 2), equalTo(1));
    }

    @Test
    void minimizeMax2() {
        assertThat(new Solution().minimizeMax(new int[] {4, 2, 1, 2}, 1), equalTo(0));
    }
}
