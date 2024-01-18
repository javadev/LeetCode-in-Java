package g2501_2600.s2567_minimum_score_by_changing_two_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizeSum() {
        assertThat(new Solution().minimizeSum(new int[] {1, 4, 3}), equalTo(0));
    }

    @Test
    void minimizeSum2() {
        assertThat(new Solution().minimizeSum(new int[] {1, 4, 7, 8, 5}), equalTo(3));
    }
}
