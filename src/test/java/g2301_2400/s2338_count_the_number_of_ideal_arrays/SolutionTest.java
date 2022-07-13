package g2301_2400.s2338_count_the_number_of_ideal_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void idealArrays() {
        assertThat(new Solution().idealArrays(2, 5), equalTo(10));
    }

    @Test
    void idealArrays2() {
        assertThat(new Solution().idealArrays(5, 3), equalTo(11));
    }
}
