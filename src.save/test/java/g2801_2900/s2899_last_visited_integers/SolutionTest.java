package g2801_2900.s2899_last_visited_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lastVisitedIntegers() {
        assertThat(
                new Solution().lastVisitedIntegers(Arrays.asList("1", "2", "prev", "prev", "prev")),
                equalTo(Arrays.asList(2, 1, -1)));
    }

    @Test
    void lastVisitedIntegers2() {
        assertThat(
                new Solution().lastVisitedIntegers(Arrays.asList("1", "prev", "2", "prev", "prev")),
                equalTo(Arrays.asList(1, 2, 1)));
    }
}
