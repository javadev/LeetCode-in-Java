package g2701_2800.s2749_minimum_operations_to_make_the_integer_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeTheIntegerZero() {
        assertThat(new Solution().makeTheIntegerZero(3, -2), equalTo(3));
    }

    @Test
    void makeTheIntegerZero2() {
        assertThat(new Solution().makeTheIntegerZero(5, 7), equalTo(-1));
    }
}
