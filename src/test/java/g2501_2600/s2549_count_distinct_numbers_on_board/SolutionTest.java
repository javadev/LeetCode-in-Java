package g2501_2600.s2549_count_distinct_numbers_on_board;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void distinctIntegers() {
        assertThat(new Solution().distinctIntegers(5),
                equalTo(4));
    }

    @Test
    void distinctIntegers2() {
        assertThat(new Solution().distinctIntegers(3),
                equalTo(2));
    }
}
