package g2501_2600.s2525_categorize_box_according_to_criteria;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void categorizeBox() {
        assertThat(new Solution().categorizeBox(1000, 35, 700, 300), equalTo("Heavy"));
    }

    @Test
    void categorizeBox2() {
        assertThat(new Solution().categorizeBox(200, 50, 800, 50), equalTo("Neither"));
    }
}
