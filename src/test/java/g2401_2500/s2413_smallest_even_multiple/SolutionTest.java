package g2401_2500.s2413_smallest_even_multiple;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestEvenMultiple() {
        assertThat(new Solution().smallestEvenMultiple(5), equalTo(10));
    }

    @Test
    void smallestEvenMultiple2() {
        assertThat(new Solution().smallestEvenMultiple(6), equalTo(6));
    }
}
