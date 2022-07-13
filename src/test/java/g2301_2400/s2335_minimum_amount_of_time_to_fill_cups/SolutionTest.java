package g2301_2400.s2335_minimum_amount_of_time_to_fill_cups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fillCups() {
        assertThat(new Solution().fillCups(new int[] {1, 4, 2}), equalTo(4));
    }

    @Test
    void fillCups2() {
        assertThat(new Solution().fillCups(new int[] {5, 4, 4}), equalTo(7));
    }

    @Test
    void fillCups3() {
        assertThat(new Solution().fillCups(new int[] {5, 0, 0}), equalTo(5));
    }
}
