package g3901_4000.s3966_count_good_integers_in_a_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void goodIntegers() {
        assertThat(new Solution().goodIntegers(10, 15, 1), equalTo(3L));
    }

    @Test
    void goodIntegers2() {
        assertThat(new Solution().goodIntegers(201, 204, 2), equalTo(2L));
    }

    @Test
    void goodIntegers3() {
        assertThat(new Solution().goodIntegers(10, 22, 0), equalTo(2L));
    }

    @Test
    void goodIntegers4() {
        assertThat(new Solution().goodIntegers(10, 10, 1), equalTo(1L));
    }

    @Test
    void goodIntegers5() {
        assertThat(new Solution().goodIntegers(10, 1000, 9), equalTo(991L));
    }
}
