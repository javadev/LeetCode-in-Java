package g2801_2900.s2860_happy_students;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countWays() {
        assertThat(new Solution().countWays(Arrays.asList(1, 1)), equalTo(2));
    }

    @Test
    void countWays2() {
        assertThat(new Solution().countWays(Arrays.asList(6, 0, 3, 3, 6, 7, 2, 7)), equalTo(3));
    }
}
