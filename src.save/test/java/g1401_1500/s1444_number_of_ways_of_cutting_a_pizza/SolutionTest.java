package g1401_1500.s1444_number_of_ways_of_cutting_a_pizza;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void ways() {
        assertThat(new Solution().ways(new String[] {"A..", "AAA", "..."}, 3), equalTo(3));
    }

    @Test
    void ways2() {
        assertThat(new Solution().ways(new String[] {"A..", "AA.", "..."}, 3), equalTo(1));
    }

    @Test
    void ways3() {
        assertThat(new Solution().ways(new String[] {"A..", "A..", "..."}, 1), equalTo(1));
    }
}
