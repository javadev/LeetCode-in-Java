package g2401_2500.s2427_number_of_common_factors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void commonFactors() {
        assertThat(new Solution().commonFactors(12, 6), equalTo(4));
    }

    @Test
    void commonFactors2() {
        assertThat(new Solution().commonFactors(25, 30), equalTo(2));
    }
}
