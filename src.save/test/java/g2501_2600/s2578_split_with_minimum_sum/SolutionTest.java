package g2501_2600.s2578_split_with_minimum_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitNum() {
        assertThat(new Solution().splitNum(4325), equalTo(59));
    }

    @Test
    void splitNum2() {
        assertThat(new Solution().splitNum(687), equalTo(75));
    }
}
