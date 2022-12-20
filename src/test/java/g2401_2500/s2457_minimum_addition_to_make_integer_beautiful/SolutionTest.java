package g2401_2500.s2457_minimum_addition_to_make_integer_beautiful;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeIntegerBeautiful() {
        assertThat(new Solution().makeIntegerBeautiful(16, 6), equalTo(4L));
    }

    @Test
    void makeIntegerBeautiful2() {
        assertThat(new Solution().makeIntegerBeautiful(467, 6), equalTo(33L));
    }

    @Test
    void makeIntegerBeautiful3() {
        assertThat(new Solution().makeIntegerBeautiful(1, 1), equalTo(0L));
    }
}
