package g1801_1900.s1808_maximize_number_of_nice_divisors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxNiceDivisors() {
        assertThat(new Solution().maxNiceDivisors(5), equalTo(6));
    }

    @Test
    void maxNiceDivisors2() {
        assertThat(new Solution().maxNiceDivisors(8), equalTo(18));
    }
}
