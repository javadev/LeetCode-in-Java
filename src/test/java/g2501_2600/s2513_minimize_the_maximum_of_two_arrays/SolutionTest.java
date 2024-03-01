package g2501_2600.s2513_minimize_the_maximum_of_two_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizeSet() {
        assertThat(new Solution().minimizeSet(2, 7, 1, 3), equalTo(4));
    }

    @Test
    void minimizeSet2() {
        assertThat(new Solution().minimizeSet(3, 5, 2, 1), equalTo(3));
    }

    @Test
    void minimizeSet3() {
        assertThat(new Solution().minimizeSet(2, 4, 8, 2), equalTo(15));
    }
}
