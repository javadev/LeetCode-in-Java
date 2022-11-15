package g2401_2500.s2413_smallest_even_multiple;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestEvenMultiple() {
        assertThat(new Solution().smallestEvenMultiple(0), equalTo(0));
    }
}
