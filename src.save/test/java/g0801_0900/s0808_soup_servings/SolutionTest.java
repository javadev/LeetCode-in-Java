package g0801_0900.s0808_soup_servings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void soupServings() {
        assertThat(new Solution().soupServings(50), equalTo(0.625));
    }

    @Test
    void soupServings2() {
        assertThat(new Solution().soupServings(100), equalTo(0.71875));
    }
}
