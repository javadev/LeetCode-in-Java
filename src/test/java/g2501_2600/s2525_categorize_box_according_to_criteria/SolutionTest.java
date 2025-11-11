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

    @Test
    void categorizeBox3() {
        assertThat(new Solution().categorizeBox(10000, 1, 1, 10), equalTo("Bulky"));
    }

    @Test
    void categorizeBox4() {
        assertThat(new Solution().categorizeBox(1000, 1000, 1000, 10), equalTo("Bulky"));
    }

    @Test
    void categorizeBox5() {
        assertThat(new Solution().categorizeBox(10000, 10000, 1, 200), equalTo("Both"));
    }

    @Test
    void categorizeBox6() {
        assertThat(new Solution().categorizeBox(9999, 9999, 1, 99), equalTo("Neither"));
    }

    @Test
    void categorizeBox7() {
        assertThat(new Solution().categorizeBox(10000, 10000, 1, 100), equalTo("Both"));
    }

    @Test
    void categorizeBox8() {
        assertThat(new Solution().categorizeBox(1000, 1000, 1000, 1), equalTo("Bulky"));
    }
}
