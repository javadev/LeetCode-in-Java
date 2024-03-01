package g2801_2900.s2827_number_of_beautiful_integers_in_the_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfBeautifulIntegers() {
        assertThat(new Solution().numberOfBeautifulIntegers(10, 20, 3), equalTo(2));
    }

    @Test
    void numberOfBeautifulIntegers2() {
        assertThat(new Solution().numberOfBeautifulIntegers(1, 10, 1), equalTo(1));
    }

    @Test
    void numberOfBeautifulIntegers3() {
        assertThat(new Solution().numberOfBeautifulIntegers(5, 5, 2), equalTo(0));
    }
}
