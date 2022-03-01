package g0901_1000.s0970_powerful_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void powerfulIntegers() {
        assertThat(
                new Solution().powerfulIntegers(2, 3, 10),
                equalTo(Arrays.asList(2, 3, 4, 5, 7, 9, 10)));
    }

    @Test
    void powerfulIntegers2() {
        assertThat(
                new Solution().powerfulIntegers(3, 5, 15),
                equalTo(Arrays.asList(2, 4, 6, 8, 10, 14)));
    }
}
