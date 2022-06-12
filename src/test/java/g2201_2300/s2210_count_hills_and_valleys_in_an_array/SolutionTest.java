package g2201_2300.s2210_count_hills_and_valleys_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countHillValley() {
        assertThat(new Solution().countHillValley(new int[] {2, 4, 1, 1, 6, 5}), equalTo(3));
    }

    @Test
    void countHillValley2() {
        assertThat(new Solution().countHillValley(new int[] {6, 6, 5, 5, 4, 1}), equalTo(0));
    }
}
