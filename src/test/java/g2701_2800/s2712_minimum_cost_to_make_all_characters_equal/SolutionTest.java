package g2701_2800.s2712_minimum_cost_to_make_all_characters_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(new Solution().minimumCost("0011"), equalTo(2L));
    }

    @Test
    void minimumCost2() {
        assertThat(new Solution().minimumCost("010101"), equalTo(9L));
    }
}
